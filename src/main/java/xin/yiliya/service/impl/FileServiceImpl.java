package xin.yiliya.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xin.yiliya.dao.FileMapper;
import xin.yiliya.pojo.File;
import xin.yiliya.service.FileService;

import java.util.List;

@Service
@Transactional
public class FileServiceImpl implements FileService {

    @Autowired
    FileMapper fileMapper;


    @Override
    public Integer sendFile(File file) {
        return fileMapper.insertSelective(file);
    }

    @Override
    public Integer dwlFile(File file) {
        return fileMapper.updateByPrimaryKeySelective(file);
    }

    @Override
    public File getFileByPath(String path) {
        return fileMapper.selectByPath(path);
    }

    @Override
    public List<File> getFileByMsg(Integer msgId) {
        return fileMapper.selectByMsg(msgId);
    }
}
