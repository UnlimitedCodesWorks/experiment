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
    public List<Message> getNewMessagesByUser(int userId) {
        return messageMapper.selectNewByUserId(userId);
    }

    @Override
    public Message getLatestMessage(int userId) {
        return messageMapper.selectOneByUser(userId);
    }

    @Override
    public Integer deleteMessage(Integer id) {

        return messageMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer readMessage(Message message) {
        return messageMapper.updateByPrimaryKeySelective(message);
    }


}
