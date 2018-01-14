package xin.yiliya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xin.yiliya.pojo.Message;
import xin.yiliya.service.MessageService;

import java.util.List;

@RestController
@RequestMapping(value = "/message")
public class MessageController {

    @Autowired
    MessageService messageService;


    /**
     *用户发送消息
     * @param message
     * @return 发送成功返回1，否则返回0
     */
    @RequestMapping(value = "/sendMsg",method = RequestMethod.POST)
    public Integer sendMsg(Message message){
        return messageService.sendMessage(message);
    }


    /**
     *用户接收最新消息
     * @param userId
     * @return 返回最新消息对象
     */
    @RequestMapping(value = "/receiveMsg",method = RequestMethod.GET)
    public Message receiveMsg(@RequestParam("userId") Integer userId){
        return messageService.getLatestMessage(userId);
    }

    /**
     *用户阅读消息
     * @param message
     * @return 已阅读则返回1，否则返回0
     */
    @RequestMapping(value = "/readMsg",method = RequestMethod.POST)
    public Integer readMsg(Message message){
        return messageService.readMessage(message);
    }

    /**
     *用户删除消息
     * @param message
     * @return 删除成功则返回1，否则返回0
     */
    @RequestMapping(value = "/deleteMsg",method = RequestMethod.POST)
    public Integer deleteMsg(Message message){
        return messageService.deleteMessage(message.getId());
    }

    /**
     *用户查看历史消息
     * @param userId
     * @return 返回历史消息的List对象
     */
    @RequestMapping(value = "/historyMsg",method = RequestMethod.GET)
    public List<Message> historyMsg(@RequestParam("userId") Integer userId){
        return messageService.getMessagesByUser(userId);
    }

    /**
     *用户查看未读消息
     * @param userId
     * @return 返回未读消息的List对象
     */
    @RequestMapping(value = "/newMsgs",method = RequestMethod.GET)
    public List<Message> newMsgs(@RequestParam("userId") Integer userId){
        return messageService.getNewMessagesByUser(userId);
    }

}
