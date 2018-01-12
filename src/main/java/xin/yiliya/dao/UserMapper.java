package xin.yiliya.dao;

import org.apache.ibatis.annotations.Param;
import xin.yiliya.pojo.User;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User login(@Param("number") String num, @Param("password") String pass);

    User getUserInfoById(Integer userId);

    List<User> getFriendsById(Integer userId);

    List<User> getUsersByNumber(@Param("num") String num);

    List<User> getUsersByName(@Param("name") String name);
}