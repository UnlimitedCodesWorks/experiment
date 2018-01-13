package xin.yiliya.dao;

import xin.yiliya.pojo.Message;

import java.util.List;

public interface MessageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Message record);

    int insertSelective(Message record);

    Message selectByPrimaryKey(Integer id);

    List<Message> selectByUserId(Integer userId);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);
}