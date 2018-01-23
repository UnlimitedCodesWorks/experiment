package xin.yiliya.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xin.yiliya.dao.FileMapper;
import xin.yiliya.pojo.File;
import xin.yiliya.pojo.Message;
import xin.yiliya.service.FileService;

import java.util.List;

@Service
@Transactional
public class FileServiceImpl implements FileService {

    @Autowired
    FileMapper fileMapper;


    @Override
    public Integer sendFile(File file) {
        try {
             file.setLoadStatus(0);
             fileMapper.insertSelective(file);
             return file.getId();
        }catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public Integer dwlFile(File file) {
        try{
            file.setLoadStatus(0);
            fileMapper.updateByPrimaryKeySelective(file);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public File getFileByPath(String path) {
        return fileMapper.selectByPath(path);
    }

    @Override
    public List<File> getFileByMsg(Integer sendId,Integer receiveId) {
        List<File> fileList = fileMapper.selectByMsg(sendId,receiveId);
        for(File file:fileList){
            file.setLoadStatus(1);
            fileMapper.updateByPrimaryKeySelective(file);
        }
        return fileList;
    }
}
