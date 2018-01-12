package xin.yiliya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import xin.yiliya.pojo.User;
import xin.yiliya.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/login.do",method = RequestMethod.GET)
    @ResponseBody
    public Integer loginDo(@RequestParam("num")String num,
                        @RequestParam("pass")String pass){
        return userService.login(num,pass);
    }

}
