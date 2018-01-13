package xin.yiliya.service;

import org.springframework.stereotype.Service;

@Service
public interface MessageService {

    Integer sendMessage(String content, int sendId,int receiveId);



}
