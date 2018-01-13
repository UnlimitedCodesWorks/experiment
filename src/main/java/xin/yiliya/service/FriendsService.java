package xin.yiliya.service;

import org.springframework.stereotype.Service;
import xin.yiliya.pojo.Friends;

@Service
public interface FriendsService {

    //添加好友
    //参数：Friends对象
    //成功返回true，若失败返回false
    //两边都处于待接受状态0
    Boolean addFriend(Friends friends);

    //删除好友
    //参数：Friends对象
    //返回：如果删除成功为true，不成功为false
    //两边好友都会删除
    Boolean deleteFriend(Friends friends);


}
