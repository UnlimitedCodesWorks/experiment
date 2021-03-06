package xin.yiliya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import xin.yiliya.pojo.Friends;
import xin.yiliya.service.FriendsService;

@RestController
@RequestMapping(value = "/user")
public class FriendsController {

    @Autowired
    private FriendsService friendsService;

    /**
     * 添加好友
     * @param friends
     * @return 成功返回true，若失败返回false。两边都处于待接受状态0
     */
    @RequestMapping(value = "/addFriend",consumes = "application/json",method = RequestMethod.POST)
    public Boolean addFriendDo(@RequestBody Friends friends){
        return friendsService.addFriend(friends);
    }

    /**
     * 确认添加为好友
     * @param friends
     * @return 成功返回true，若失败返回false。两边状态变为1
     */
    @RequestMapping(value = "/sureFriend",consumes = "application/json",method = RequestMethod.POST)
    public Boolean sureFriendDo(@RequestBody Friends friends){
        return friendsService.sureFriend(friends);
    }

    /**
     * 拒绝添加为好友
     * @param friends
     * @return 成功返回true，删除添加纪录；若失败返回false
     */
    @RequestMapping(value = "/refuseFriend",consumes = "application/json",method = RequestMethod.POST)
    public Boolean refuseFriendDo(@RequestBody Friends friends){
        return friendsService.refuseFriend(friends);
    }

    /**
     * 删除好友
     * @param friends
     * @return 如果删除成功为true，两边好友都会删除；不成功为false
     */
    @RequestMapping(value = "deleteFriend",consumes = "application/json",method = RequestMethod.POST)
    public Boolean deleteFriendDo(@RequestBody Friends friends){
        return friendsService.deleteFriend(friends);
    }

}
