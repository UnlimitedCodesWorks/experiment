package xin.yiliya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import xin.yiliya.pojo.Message;
import xin.yiliya.pojo.MessagePicture;
import xin.yiliya.pojo.Picture;
import xin.yiliya.service.MessageService;
import xin.yiliya.service.PictureService;

@RestController
@RequestMapping(value = "/picture")
public class PictureController {

    @Autowired
    private PictureService pictureService;

    @Autowired
    private MessageService messageService;

    /**
     * 发送图片
     * @param messagePicture 图片信息
     * @return 成功则返回图片的id，失败则返回0
     */
    @RequestMapping(value = "/sendPicOnly",consumes = "application/json",method = RequestMethod.POST)
    public Integer sendPicOnly(@RequestBody MessagePicture messagePicture) {
        Message message = messagePicture.getMessage();
        message.setContent("/null/");
        messageService.sendMessage(message);
        Picture picture = messagePicture.getPicture();
        picture.setMsgId(message.getId());
        return pictureService.sendPicture(picture);
    }
}


