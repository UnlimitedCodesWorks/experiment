package xin.yiliya.service;

import org.springframework.stereotype.Service;
import xin.yiliya.pojo.File;
import xin.yiliya.pojo.Message;

import java.util.List;

@Service
public interface FileService {

    //发送文件
    //发送成功则返回1，失败则返回0
    Integer sendFile(File file);

    //下载文件
    //下载成功则返回1，失败则返回0
    Integer dwlFile(File file);

    //查看文件
    //参数：文件路径path
    //返回File
    File getFileByPath(String path);


    //用户查看是否有未下载的文件
    List<File> getFileByMsg(Message message);
}
