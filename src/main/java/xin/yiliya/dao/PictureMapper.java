package xin.yiliya.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import xin.yiliya.pojo.Picture;
@Repository
@Mapper
public interface PictureMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Picture record);

    int insertSelective(Picture record);

    Picture selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Picture record);

    int updateByPrimaryKey(Picture record);
}