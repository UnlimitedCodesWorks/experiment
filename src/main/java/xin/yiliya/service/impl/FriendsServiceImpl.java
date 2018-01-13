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
