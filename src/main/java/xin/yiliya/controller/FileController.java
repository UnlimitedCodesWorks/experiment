package xin.yiliya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xin.yiliya.pojo.File;
import xin.yiliya.pojo.Message;
import xin.yiliya.pojo.Picture;
import xin.yiliya.service.FileService;
import xin.yiliya.service.MessageService;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/file")
public class FileController {


    @Autowired
    MessageService messageService;
    @Autowired
    FileService fileService;
    /**
     *用户只发送文件
     * @param file
     * @param sendId
     * @param receiveId
     * @return 发送成功返回1，否则返回0
     */
    @RequestMapping(value = "/sendFileOnly",method = RequestMethod.POST)
    public Integer sendFileOnly(File file, @RequestParam("sendId") Integer sendId, @RequestParam("receiveId") Integer receiveId) {
        Message message = new Message();
        Date now = new Date();
        message.setMsgTime(now);
        message.setSendId(sendId);
        message.setReceiveId(receiveId);
        message.setReadStatus(0);
        message.setContent("/null/");
        messageService.sendMessage(message);
        Message message1 = messageService.getLatestMessage(sendId,receiveId);
        file.setMsgId(message1.getId());
        return fileService.sendFile(file);

    }


    /**
     *用户发送文件和消息
     * @param file
     * @param message
     * @return 发送成功返回1，否则返回0
     */
    @RequestMapping(value = "/sendFile",method = RequestMethod.POST)
    public Integer sendFile(File file,Message message) {
        messageService.sendMessage(message);
        Message message1 = messageService.getLatestMessage(message.getSendId(),message.getReceiveId());
        file.setMsgId(message1.getId());
        return fileService.sendFile(file);

    }


    /**
     *用户查看消息所带文件
     * @param message
     * @return 返回消息所带文件的List对象
     */
    @RequestMapping(value = "/readFile",method = RequestMethod.GET)
    public List<File> readFile(Message message){

        return fileService.getFileByMsg(message.getId());

    }


    /**
     *用户下载文件
     * @param file
     * @return 已下载则返回1，未下载则返回0
     */
    @RequestMapping(value = "/dwlFile",method = RequestMethod.POST)
    public Integer dwlFile(File file){

        return fileService.dwlFile(file);

    }
}
