package xin.yiliya.dao;

import org.apache.ibatis.annotations.Param;
import xin.yiliya.pojo.File;
import xin.yiliya.pojo.Message;

import java.util.List;

public interface FileMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(File record);

    int insertSelective(File record);

    File selectByPrimaryKey(Integer id);

    File selectByPath(String path);

    List<File> selectByMsg(@Param("sendId") Integer sendId,@Param("receiveId") Integer receiveId);

    int updateByPrimaryKeySelective(File record);

    int updateByPrimaryKey(File record);
}