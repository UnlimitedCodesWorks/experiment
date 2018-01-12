package xin.yiliya.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xin.yiliya.dao.UserMapper;
import xin.yiliya.pojo.User;
import xin.yiliya.pojo.UserLaunch;
import xin.yiliya.service.UserService;

import java.util.List;

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

    @Override
    public UserLaunch getLaunchInfo(Integer userId) {
        UserLaunch userLaunch=new UserLaunch();
        userLaunch.setUser(userMapper.getUserInfoById(userId));
        userLaunch.setFriends(userMapper.getFriendsById(userId));
        return userLaunch;
    }

    @Override
    public List<User> getUsersByNumber(String num) {
        return userMapper.getUsersByNumber(num);
    }

    @Override
    public List<User> getUsersByName(String name) {
        return userMapper.getUsersByName(name);
    }
}
