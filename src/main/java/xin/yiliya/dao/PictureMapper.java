package xin.yiliya.dao;

import org.springframework.stereotype.Repository;
import xin.yiliya.pojo.Picture;

@Repository
public interface PictureMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Picture record);

    int insertSelective(Picture record);

    Picture selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Picture record);

    int updateByPrimaryKeyWithBLOBs(Picture record);

    int updateByPrimaryKey(Picture record);
}