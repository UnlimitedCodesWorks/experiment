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
        try{
            message.setReadStatus(0);
            messageMapper.insertSelective(message);
            return message.getId();
        }catch (Exception e) {
            e.printStackTrace();
            return 0;
        }

    }

    @Override
    public List<Message> getMessagesByUser(Integer sendId,Integer receiveId) {
        return messageMapper.selectByUserId(sendId,receiveId);

    }

    @Override
    public List<Message> getNewMessagesByUser(Integer sendId,Integer receiveId) {
        return messageMapper.selectNewByUserId(sendId,receiveId);
    }

    @Override
    public Message getLatestMessage(Integer sendId,Integer receiveId) {
        return messageMapper.selectOneByUser(sendId,receiveId);
    }

    @Override
    public Integer deleteMessage(Integer id) {

        try {
            messageMapper.deleteByPrimaryKey(id);
            return 1;
        }catch (Exception e) {
            e.printStackTrace();
            return 0;
        }

    }

    @Override
    public Integer readMessage(Integer sendId,Integer receiveId) {

        try {
            return   messageMapper.updateByUser(sendId,receiveId);
        }catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }


}
