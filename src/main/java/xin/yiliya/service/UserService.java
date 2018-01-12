package xin.yiliya.service;

import org.springframework.stereotype.Service;
import xin.yiliya.pojo.User;

@Service
public interface UserService {

    //登陆接口
    //返回User对象
    User login(String num, String pass);

}
