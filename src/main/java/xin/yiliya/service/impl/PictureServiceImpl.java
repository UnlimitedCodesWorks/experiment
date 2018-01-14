package xin.yiliya.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xin.yiliya.dao.PictureMapper;
import xin.yiliya.pojo.Picture;
import xin.yiliya.service.PictureService;

import java.util.List;

@Service
@Transactional
public class PictureServiceImpl implements PictureService {

    @Autowired
    private PictureMapper pictureMapper;

    @Override
    public Integer sendPicture(Picture picture) {
        try{
         pictureMapper.insertSelective(picture);
         return picture.getId();
        }
        catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public Picture getPictureByPath(String path) {
        return pictureMapper.selectByPath(path);
    }

    @Override
    public List<Picture> getPicturesByMsg(Integer msgId) {
        return pictureMapper.selectByMsg(msgId);
    }
}
