package xin.yiliya;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import xin.yiliya.pojo.Message;
import xin.yiliya.service.MessageService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExperimentApplicationTests {
	@Autowired
	MessageService messageService;
	@Test
	public void contextLoads() {



		//发送消息
      // int state=messageService.sendMessage("你是谁",3,2);
        //System.out.println(state);


		//查询消息
		//       List<Message> messages=messageService.getMessagesByUser(2);
		//       System.out.println(JSON.toJSONString(messages,true));

		//查询最新消息
		Message message=messageService.getMessage(2);
		System.out.println(JSON.toJSONString(message));
	}

}
