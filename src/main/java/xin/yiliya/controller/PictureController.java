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
    PictureService pictureService;
    @Autowired
    MessageService messageService;


    /**
     *用户只发送图片
     * @param picture
     * @param userId
     * @param receiveId
     * @return 发送成功返回1，否则返回0
     */
    @RequestMapping(value = "/sendPicOnly",method = RequestMethod.POST)
    public Integer sendPicOnly(Picture picture,@RequestParam("userId") Integer userId,@RequestParam("receiveId") Integer receiveId) {
        Message message = new Message();
        Date now = new Date();
        message.setMsgTime(now);
        message.setSendId(userId);
        message.setReceiveId(receiveId);
        message.setReadStatus(0);
        message.setContent("/null/");
        messageService.sendMessage(message);
        Message message1 = messageService.getLatestMessage(receiveId);
        picture.setMsgId(message1.getId());
        return pictureService.sendPicture(picture);

    }



    /**
     *用户发送消息和图片
     * @param picture
     * @param message
     * @return 发送成功返回1，否则返回0
     */
    @RequestMapping(value = "/sendPic",method = RequestMethod.POST)
    public Integer sendPic(Picture picture,Message message) {

        messageService.sendMessage(message);
        Message message1 = messageService.getLatestMessage(message.getReceiveId());
        picture.setMsgId(message1.getId());
        return pictureService.sendPicture(picture);

    }


        /**
         *用户查看消息所带图片
         * @param message
         * @return 返回消息所带图片的List对象
         */
        @RequestMapping(value = "/readPic",method = RequestMethod.GET)
        public List<Picture> readPic(Message message){

            return pictureService.getPicturesByMsg(message.getId());

    }







}
