package xin.yiliya.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xin.yiliya.dao.UserMapper;
import xin.yiliya.pojo.User;
import xin.yiliya.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public Integer login(String num, String pass) {
        User user = userMapper.login(num,pass);
        if(user==null){
            return 0;
        }
        else{
            return user.getId();
        }
    }
}
