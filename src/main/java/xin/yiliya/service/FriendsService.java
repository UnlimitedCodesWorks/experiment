package xin.yiliya.service;

import org.springframework.stereotype.Service;
import xin.yiliya.pojo.Friends;

@Service
public interface FriendsService {

    //删除好友
    //参数：Friends对象
    //返回：如果删除成功为true，不成功为false
    //两边好友都会删除
    Boolean deleteFriend(Friends friends);

}
