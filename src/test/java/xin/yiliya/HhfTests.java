package xin.yiliya;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import xin.yiliya.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HhfTests {

    @Autowired
    UserService userService;

    @Test
    public void hhfTest() {

        //用户登陆
        System.out.println(userService.login("1150299165","12345"));

    }

}
