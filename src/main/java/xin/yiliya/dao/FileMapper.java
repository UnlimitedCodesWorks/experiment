package xin.yiliya.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import xin.yiliya.pojo.File;
@Repository
@Mapper
public interface FileMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(File record);

    int insertSelective(File record);

    File selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(File record);

    int updateByPrimaryKey(File record);
}