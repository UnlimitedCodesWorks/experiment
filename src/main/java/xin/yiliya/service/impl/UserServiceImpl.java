package xin.yiliya.service.impl;

import org.apache.commons.codec.digest.DigestUtils;
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
    public Integer Register(User user) {
        try{
            String password=user.getUserPass();
            user.setUserPass(DigestUtils.md5Hex(password));
            userMapper.insertSelective(user);
            return user.getId();
        }catch (Exception e){
            e.printStackTrace();
            return 0;
        }

    }

    @Override
    public Integer updateInfo(User user) {
        try{
            String password=user.getUserPass();
            if(password!=null){
                user.setUserPass(DigestUtils.md5Hex(password));
            }
            userMapper.updateByPrimaryKeySelective(user);
            return user.getId();
        }catch (Exception e){
            e.printStackTrace();
            return 0;
        }
    }

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
    public List<User> getUsersByInput(String input) {
        return userMapper.getUsersByInput(input);
    }

}
