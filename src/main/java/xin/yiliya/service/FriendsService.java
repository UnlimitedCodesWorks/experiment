package xin.yiliya.service;

import org.springframework.stereotype.Service;
import xin.yiliya.pojo.Friends;
import xin.yiliya.pojo.User;

import java.util.List;

@Service
public interface FriendsService {

    /**
     * 添加好友
     * @param friends
     * @return 成功返回true，若失败返回false。两边都处于待接受状态0
     */
    Boolean addFriend(Friends friends);

    /**
     * 确认添加为好友
     * @param friends
     * @return 成功返回true，若失败返回false。两边状态变为1
     */
    Boolean sureFriend(Friends friends);

    /**
     * 拒绝添加为好友
     * @param friends
     * @return 成功返回true，删除添加纪录；若失败返回false
     */
    Boolean refuseFriend(Friends friends);

    /**
     * 删除好友
     * @param friends
     * @return 如果删除成功为true，两边好友都会删除；不成功为false
     */
    Boolean deleteFriend(Friends friends);

}
