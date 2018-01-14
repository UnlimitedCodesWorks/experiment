package xin.yiliya.dao;

import xin.yiliya.pojo.File;

import java.util.List;

public interface FileMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(File record);

    int insertSelective(File record);

    File selectByPrimaryKey(Integer id);

    File selectByPath(String path);

    List<File> selectByMsg(Integer msgId);

    int updateByPrimaryKeySelective(File record);

    int updateByPrimaryKey(File record);
}