package xin.yiliya.dao;

import org.apache.ibatis.annotations.Param;
import xin.yiliya.pojo.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int login(@Param("number") String num, @Param("password") String pass);
}