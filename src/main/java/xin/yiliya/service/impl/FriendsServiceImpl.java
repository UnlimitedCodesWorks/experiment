package xin.yiliya.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xin.yiliya.dao.FriendsMapper;
import xin.yiliya.pojo.Friends;
import xin.yiliya.service.FriendsService;

@Service
@Transactional
public class FriendsServiceImpl implements FriendsService{

    @Autowired
    private FriendsMapper friendsMapper;

    @Override
    public Boolean addFriend(Friends friends) {
        try{
            friends.setConfirmStatus(0);
            friendsMapper.insertSelective(friends);
            friendsMapper.addFaceFriend(friends);
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
