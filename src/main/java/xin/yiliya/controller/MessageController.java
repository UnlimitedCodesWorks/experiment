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
    private MessageService messageService;

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
     *用户查看历史消息
     * @param sendId
     * @param receiveId
     * @return 返回历史消息的List对象
     */
    @RequestMapping(value = "/historyMsg",method = RequestMethod.GET)
    public List<Message> historyMsg(@RequestParam("sendId") Integer sendId,@RequestParam("receiveId") Integer receiveId){
        return messageService.getMessagesByUser(sendId,receiveId);
    }

    /**
     *用户查看未读消息
     * @param sendId
     * @param receiveId
     * @return 返回未读消息的List对象
     */
    @RequestMapping(value = "/newMsgs",method = RequestMethod.GET)
    public List<Message> newMsgs(@RequestParam("sendId") Integer sendId,@RequestParam("receiveId") Integer receiveId){
        List<Message> messages= messageService.getNewMessagesByUser(sendId,receiveId);
        messageService.readMessage(sendId,receiveId);
        return messages;
    }

}
