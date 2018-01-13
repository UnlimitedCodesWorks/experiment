package xin.yiliya;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import xin.yiliya.pojo.Friends;
import xin.yiliya.pojo.Message;
import xin.yiliya.pojo.User;
import xin.yiliya.service.FriendsService;
import xin.yiliya.service.MessageService;
import xin.yiliya.service.UserService;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HhfTests {

    @Autowired
    UserService userService;

    @Autowired
    FriendsService friendsService;

    @Test
    public void hhfTest() {

//        //用户注册
//        User user=new User();
//        user.setUserNum("1150299167");
//        user.setUserPass("12345");
//        user.setUserHead("aaa.jpg");
//        System.out.println(userService.Register(user));

//        //用户修改信息
//        User user=new User();
//        user.setId(1);
//        user.setUserName("hhf");
//        user.setUserPass("12345");
//        System.out.println(userService.updateInfo(user));

//        //用户登陆
//        System.out.println(userService.login("1150299165","12345"));

//        //主界面信息
//        System.out.println(JSON.toJSONString(userService.getLaunchInfo(1),true));

        //根据账号查找用户
//        List<User> users=userService.getUsersByInput("1150");
//        System.out.println(JSON.toJSONString(users,true));

        //删除好友
//        Friends friends = new Friends();
//        friends.setUserId(1);
//        friends.setFriendId(2);
//        Boolean b=friendsService.deleteFriend(friends);
//        System.out.println(b);
    }

}
