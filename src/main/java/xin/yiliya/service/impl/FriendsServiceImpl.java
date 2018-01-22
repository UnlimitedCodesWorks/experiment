package xin.yiliya.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xin.yiliya.dao.FriendsMapper;
import xin.yiliya.dao.UserMapper;
import xin.yiliya.pojo.Friends;
import xin.yiliya.pojo.User;
import xin.yiliya.service.FriendsService;

import java.util.List;

@Service
@Transactional
public class FriendsServiceImpl implements FriendsService{

    @Autowired
    private FriendsMapper friendsMapper;

    @Autowired
    private UserMapper userMapper;

    @Override
    public Boolean addFriend(Friends friends) {
        try{
            friends.setConfirmStatus(0);
            friendsMapper.insertSelective(friends);
            //friendsMapper.addFaceFriend(friends);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Boolean sureFriend(Friends friends) {
        try{
            friendsMapper.sureFriend(friends);
            friends.setConfirmStatus(1);
            friendsMapper.addFaceFriend(friends);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Boolean refuseFriend(Friends friends) {
        try{
            friendsMapper.refuseFriend(friends);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Boolean deleteFriend(Friends friends) {
        try{
            friendsMapper.deleteMyFriend(friends);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

}
