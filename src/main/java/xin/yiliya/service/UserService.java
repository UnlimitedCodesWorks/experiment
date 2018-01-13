package xin.yiliya.service;

import org.springframework.stereotype.Service;
import xin.yiliya.pojo.User;
import xin.yiliya.pojo.UserLaunch;

import java.util.List;

@Service
public interface UserService {

    //注册接口
    //注册成功返回id，否则返回0
    Integer Register(User user);

    //修改用户信息
    //修改成功返回id，否则返回0
    Integer updateInfo(User user);

    //登陆接口
    //返回User对象
    Integer login(String num, String pass);

    //获取主界面信息
    //返回UserLaunch对象，包含个人信息，好友信息
    UserLaunch getLaunchInfo(Integer userId);

    //根据输入内容查找用户
    //返回List对象
    List<User> getUsersByInput(String input);

    //好友申请请求
    //参数：用户id
    //返回：发来请求的好友List
    List<User> usersOfRequireList(Integer userId);

}
