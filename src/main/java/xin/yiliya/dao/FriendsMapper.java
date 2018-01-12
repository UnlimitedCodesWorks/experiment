package xin.yiliya.dao;

import xin.yiliya.pojo.Friends;

public interface FriendsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Friends record);

    int insertSelective(Friends record);

    Friends selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Friends record);

    int updateByPrimaryKey(Friends record);
}