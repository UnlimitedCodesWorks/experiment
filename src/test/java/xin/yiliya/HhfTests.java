package xin.yiliya;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import xin.yiliya.pojo.Message;
import xin.yiliya.service.MessageService;
import xin.yiliya.service.UserService;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HhfTests {

    @Autowired
    UserService userService;



    @Test
    public void hhfTest() {

//        //用户登陆
//        System.out.println(userService.login("1150299199","12345"));

//        //主界面信息
//        System.out.println(JSON.toJSONString(userService.getLaunchInfo(1),true));

//        //根据账号查找用户
//        List<User> users=userService.getUsersByNumber("1150");
//        System.out.println(JSON.toJSONString(users,true));

//        //根据用户名查询
//        List<User> users=userService.getUsersByName("h");
//        System.out.println(JSON.toJSONString(users,true));

        //删除好友
//        Boolean b=userService.deleteFriendByNumber(1,"1150299177");
//        System.out.println(b);



    }

}
