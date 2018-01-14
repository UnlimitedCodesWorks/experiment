package xin.yiliya.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xin.yiliya.pojo.Message;
import xin.yiliya.pojo.Picture;
import xin.yiliya.service.MessageService;
import xin.yiliya.service.PictureService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/picture")
public class PictureController {

    @Autowired
    private PictureService pictureService;

    @Autowired
    private MessageService messageService;

    /**
     *用户只发送图片
     * @param picture
     * @param sendId
     * @param receiveId
     * @return 发送成功返回1，否则返回0
     */
    @RequestMapping(value = "/sendPicOnly",method = RequestMethod.POST)
    public Integer sendPicOnly(Picture picture,@RequestParam("sendId") Integer sendId,@RequestParam("receiveId") Integer receiveId) {
        Message message = new Message();
        Date now = new Date();
        message.setMsgTime(now);
        message.setSendId(sendId);
        message.setReceiveId(receiveId);
        message.setReadStatus(0);
        message.setContent("/null/");
        int msgId= messageService.sendMessage(message);
        picture.setMsgId(msgId);
        return pictureService.sendPicture(picture);

    }




}
