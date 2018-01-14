package xin.yiliya;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import xin.yiliya.pojo.File;
import xin.yiliya.pojo.Message;
import xin.yiliya.pojo.Picture;
import xin.yiliya.service.FileService;
import xin.yiliya.service.MessageService;
import xin.yiliya.service.PictureService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExperimentApplicationTests {
	@Autowired
	MessageService messageService;
	@Autowired
	FileService fileService;
	@Autowired
	PictureService pictureService;

	@Test
	public void contextLoads() throws ParseException {



		//发送消息
 //      int status=messageService.sendMessage("你是谁",3,2);
//       System.out.println(status);


		//查询历史消息
//       List<Message> messages=messageService.getMessagesByUser(2);
//       System.out.println(JSON.toJSONString(messages,true));

		//查询最新消息
//       Message message=messageService.getMessage(2);
//       System.out.println(JSON.toJSONString(message));


		//删除消息
//		int status=messageService.deleteMessage(2);
//		System.out.println(status);

		//发送文件

//		File file=new File();
//		file.setFileName("视频");
//		file.setFilePath("cc");
//		file.setLoadStatus(0);
//		file.setMsgId(3);
//		int status=fileService.sendFile(file);


		//查询文件

//		File file=fileService.getFileByPath("aa");
//		System.out.println(JSON.toJSONString(file));

		//下载文件
//		File file=fileService.getFileByPath("aa");
//		file.setLoadStatus(1);
//		int status=fileService.dwlFile(file);
//		System.out.println(status);


		//发送图片
//		Picture picture=new Picture();
//		picture.setImgPath("aa");
//		picture.setMsgId(1);
//		pictureService.sendPicture(picture);

		//查看图片
//		Picture picture=pictureService.getPictureByPath("aa");
//		System.out.println(JSON.toJSONString(picture));

		//查看消息所带图片
//		List<Picture> picture=pictureService.getPicturesByMsg(1);
//		System.out.println(JSON.toJSONString(picture));

		//查看消息所带文件
//		List<File> file=fileService.getFileByMsg(1);
//		System.out.println(JSON.toJSONString(file));


//		Message message=new Message();
//		Date now=new Date();
//		message.setMsgTime(now);
//		message.setSendId(1);
//		message.setReceiveId(2);
//		message.setReadStatus(0);
//		message.setContent("/null/");
//		messageService.sendMessage(message);
//		Picture picture=new Picture();
//		Message message1=messageService.getLatestMessage(2);
//		picture.setMsgId(message1.getId());
//		picture.setImgPath("dd");
//		pictureService.sendPicture(picture);
//		System.out.println(JSON.toJSONString(picture));



	}

}
