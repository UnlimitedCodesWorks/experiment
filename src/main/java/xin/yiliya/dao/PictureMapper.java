package xin.yiliya.dao;

import xin.yiliya.pojo.Picture;

import java.util.List;

public interface PictureMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Picture record);

    int insertSelective(Picture record);

    Picture selectByPrimaryKey(Integer id);

    Picture  selectByPath(String path);

    List<Picture> selectByMsg(Integer msgId);

    int updateByPrimaryKeySelective(Picture record);

    int updateByPrimaryKey(Picture record);
}