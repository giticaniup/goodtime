package com.github.api.service;

import com.github.api.entity.SystemMessage;
import com.sun.org.apache.bcel.internal.generic.IINC;

import java.util.List;

/**
 * 系统消息Service
 * Created by zhongcy on 16-12-5.
 */
public interface SystemMessageService {

    void addSystemMessage(SystemMessage systemMessage);

    List<SystemMessage> getSystemMessage();

    void markSystemMessage(Integer id);

    Long findCount();
}
