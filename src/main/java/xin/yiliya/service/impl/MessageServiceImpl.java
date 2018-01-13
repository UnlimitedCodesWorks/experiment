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
    public Integer sendMessage(Message message) {

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
