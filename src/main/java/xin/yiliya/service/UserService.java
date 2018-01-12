package xin.yiliya.service;

import org.springframework.stereotype.Service;
import xin.yiliya.pojo.User;
import xin.yiliya.pojo.UserLaunch;

import java.util.List;

@Service
public interface UserService {

    //登陆接口
    //返回User对象
    Integer login(String num, String pass);

    //获取主界面信息
    //返回UserLaunch对象，包含个人信息，好友信息
    UserLaunch getLaunchInfo(Integer userId);

    //根据账号查找用户
    //返回List对象
    List<User> getUsersByNumber(String num);

    //根据用户名查找用户
    //返回List对象
    List<User> getUsersByName(String name);

    //删除好友
    //参数：自己的数据库Id号（Integer），朋友的账号number（String）
    //删除成功则返回true，不成功则为false
    Boolean deleteFriendByNumber(Integer myId,String friendNumber);

}
