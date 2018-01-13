package xin.yiliya.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xin.yiliya.dao.MessageMapper;
import xin.yiliya.pojo.Message;
import xin.yiliya.service.MessageService;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class MessageServiceImpl implements MessageService {
    @Autowired
    private MessageMapper messageMapper;




    @Override
    public Integer sendMessage(String content, int sendId, int receiveId) {
        Message message=new Message();
        message.setSendId(sendId);
        message.setReceiveId(receiveId);
        Date now=new Date();
        message.setContent(content);
        message.setMsgTime(now);
        message.setReadStatus(0);
        return messageMapper.insertSelective(message);
    }

    @Override
    public List<Message> getMessagesByUser(int userId) {
        return messageMapper.selectByUserId(userId);

    }

    @Override
    public Message getMessage(int userId) {
        return messageMapper.selectOneByUser(userId);
    }
}
