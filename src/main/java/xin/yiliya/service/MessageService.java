package xin.yiliya.service;

import org.springframework.stereotype.Service;
import xin.yiliya.pojo.Message;
import xin.yiliya.pojo.User;

import java.util.List;

@Service
public interface MessageService {
    //发送消息
    //参数：消息内容，自己的Id（sendId），接受用户Id（receiveId）
    //发送成功则返回1，失败返回0
    Integer sendMessage(String content, int sendId,int receiveId);



    //查询消息
    //参数：接收用户的Id（userId）
    //返回List对象
    List<Message> getMessagesByUser(int userId);

}
