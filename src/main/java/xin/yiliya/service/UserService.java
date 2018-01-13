package xin.yiliya.service;

import org.springframework.stereotype.Service;
import xin.yiliya.pojo.User;
import xin.yiliya.pojo.UserLaunch;

import java.util.List;

@Service
public interface UserService {

    /**
     * 用户注册
     * @param user 用户实体类
     * @return 用户的id，若失败则返回0
     */
    Integer Register(User user);

    /**
     *
     * @param user
     * @return 修改成功返回id，否则返回0
     */
    Integer updateInfo(User user);

    /**
     * 用户登录
     * @param num 用户账号
     * @param pass 用户密码
     * @return 用户的id，若失败则返回0
     */
    Integer login(String num, String pass);

    /**
     * 获取主界面信息
     * @param userId
     * @return 返回UserLaunch对象，包含个人信息，好友信息
     */
    UserLaunch getLaunchInfo(Integer userId);

    /**
     * 根据输入内容查找用户
     * @param input
     * @return 返回List User对象
     */
    List<User> getUsersByInput(String input);

    /**
     * 好友申请请求
     * @param userId
     * @return 发来请求的好友List
     */
    List<User> usersOfRequireList(Integer userId);

}
