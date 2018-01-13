package xin.yiliya.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import xin.yiliya.pojo.User;
import xin.yiliya.pojo.UserLaunch;
import xin.yiliya.service.UserService;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 用户注册
     * @param user 用户User类
     * @return 用户的id，若失败则返回0
     */
    @RequestMapping(value = "/register",consumes = "application/json",method = RequestMethod.POST)
    public Integer registerDo(@RequestBody User user){
        return userService.Register(user);
    }

    /**
     * 用户登陆
     * @param num
     * @param pass
     * @return 用户的id，若失败则返回0
     */
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public Integer loginDo(@RequestParam("num")String num,
                        @RequestParam("pass")String pass){
        return userService.login(num,pass);
    }

    /**
     *用户修改信息
     * @param user
     * @return 修改成功返回id，否则返回0
     */
    @RequestMapping(value = "/update",consumes = "application/json",method = RequestMethod.POST)
    public Integer updateInfoDo(@RequestBody User user){
        return userService.updateInfo(user);
    }

    /**
     * 获取主界面信息
     * @param userId
     * @return 返回UserLaunch对象，包含个人信息，好友信息
     */
    @RequestMapping(value = "/launch",method = RequestMethod.GET)
    public UserLaunch getUserLaunchDo(@RequestParam("userId") Integer userId){
        return userService.getLaunchInfo(userId);
    }

    /**
     * 根据输入内容查找用户
     * @param input
     * @return 返回List User对象
     */
    @RequestMapping(value = "/find",method = RequestMethod.GET)
    public List<User> getUsersByInputDo(@RequestParam("input")String input){
        return userService.getUsersByInput(input);
    }

    /**
     * 好友申请请求
     * @param userId
     * @return 发来请求的好友List
     */
    @RequestMapping(value = "/apply",method = RequestMethod.GET)
    public List<User> getReplyListDo(@RequestParam("userId")Integer userId){
        return userService.usersOfRequireList(userId);
    }

}
