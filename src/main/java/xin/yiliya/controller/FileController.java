package xin.yiliya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xin.yiliya.pojo.File;
import xin.yiliya.pojo.Message;
import xin.yiliya.pojo.MessageFile;
import xin.yiliya.pojo.Picture;
import xin.yiliya.service.FileService;
import xin.yiliya.service.MessageService;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/file")
public class FileController {

    @Autowired
    private MessageService messageService;

    @Autowired
    private FileService fileService;

    /**
     * 发送文件
     * @param messageFile 文件信息
     * @return 发送成功返回文件id，失败返回0
     */
    @RequestMapping(value = "/sendFileOnly",consumes = "application/json",method = RequestMethod.POST)
    public Integer sendFileOnly(@RequestBody MessageFile messageFile) {
        Message message = messageFile.getMessage();
        message.setContent("/fileNull/");
        messageService.sendMessage(message);
        File file = messageFile.getFile();
        file.setMsgId(message.getId());
        return fileService.sendFile(file);
    }

    /**
     *用户查看是否有未下载的文件
     * @param sendId
     * @param receiveId
     * @return 返回消息所带文件的List对象
     */
    @RequestMapping(value = "/readFile",method = RequestMethod.GET)
    public List<File> readFile(@RequestParam("sendId") Integer sendId,@RequestParam("receiveId") Integer receiveId) {
        return fileService.getFileByMsg(sendId,receiveId);

    }

    /**
     *用户取消下载文件
     * @param file
     * @return 修改完成返回1,失败返回0
     */
    @RequestMapping(value = "/unDwlFile",consumes = "application/json",method = RequestMethod.POST)
    public Integer dwlFile(@RequestBody File file){
        return fileService.dwlFile(file);

    }
}
