package xin.yiliya.service;

import org.springframework.stereotype.Service;

@Service
public interface UserService {

    //登陆接口
    //返回User对象的id
    Integer login(String num, String pass);

}
