package xin.yiliya.dao;

import org.apache.ibatis.annotations.Param;
import xin.yiliya.pojo.Message;
import xin.yiliya.pojo.MessagePicture;

import java.util.Date;
import java.util.List;

public interface MessageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Message record);

    int insertSelective(Message record);

    Message selectByPrimaryKey(Integer id);

    Message selectOneByUser(@Param("sendId")Integer sendId, @Param("receiveId")Integer receiveId);

    List<MessagePicture> selectByUserId(@Param("sendId")Integer sendId, @Param("receiveId")Integer receiveId);

    List<MessagePicture> selectNewByUserId(@Param("sendId")Integer sendId, @Param("receiveId")Integer receiveId);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);

    int updateByUser(@Param("sendId")Integer sendId, @Param("receiveId")Integer receiveId);
}