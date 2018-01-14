package xin.yiliya.service;

import org.springframework.stereotype.Service;
import xin.yiliya.pojo.Message;
import xin.yiliya.pojo.User;

import java.util.Date;
import java.util.List;

@Service
public interface MessageService {


    //发送消息
    //参数：消息内容，自己的Id（sendId），接受用户Id（receiveId）
    //发送成功则返回1，失败返回0
    Integer sendMessage(Message message);


    //查询历史消息
    //参数：接收用户的Id（userId）
    //返回List对象
    List<Message> getMessagesByUser(int userId);


    //查询未读消息
    //参数：接收用户的Id（userId）
    //返回List对象
    List<Message> getNewMessagesByUser(int userId);

    //查询最新消息
    //参数：接收用户的id（userId）
    //返回Message对象
    Message getLatestMessage(int userId);

    //删除消息
    //参数：消息id
    //删除成功则返回1，失败返回0
    Integer deleteMessage(Integer id);


    //阅读消息
    //已阅读则返回1，否则返回0
    Integer readMessage(Message message);



}
