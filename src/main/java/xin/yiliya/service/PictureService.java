package xin.yiliya.service;

import org.springframework.stereotype.Service;
import xin.yiliya.pojo.Picture;

import java.util.List;

@Service
public interface PictureService {
    //发送图片
    //发送成功则返回1，失败则返回0
    Integer sendPicture(Picture picture);

    //查看图片
    //参数图片路径（path）
    //返回Picture
    Picture getPictureByPath(String path);

    //查询消息所带图片
    //参数：消息Id（msgId）
    //返回List对象
    List<Picture> getPicturesByMsg(Integer msgId);
}
