package com.kode.rocketmq;

import com.alibaba.rocketmq.client.exception.MQClientException;
import com.alibaba.rocketmq.client.producer.DefaultMQProducer;
import com.alibaba.rocketmq.client.producer.SendResult;
import com.alibaba.rocketmq.common.message.Message;
import sun.misc.BASE64Encoder;


/**
 * Producer，发送消息
 */
public class Producer {
    public static void main(String[] args) throws MQClientException, InterruptedException {
        DefaultMQProducer producer = new DefaultMQProducer("goodtime");

        producer.setNamesrvAddr("10.22.0.26:9876");
        producer.setInstanceName("Producer");
        producer.start();
        String md5Str = new BASE64Encoder().encode("hello".getBytes());
        for (int i = 0; i < 5; i++) {
            try {
                Message msg = new Message("TopicTest",// topic
                        "TagA",// tag
                        md5Str.getBytes()// body
                );
                SendResult sendResult = producer.send(msg);
                System.out.println(sendResult);
            } catch (Exception e) {
                e.printStackTrace();
                Thread.sleep(1000);
            }
        }
        producer.shutdown();
    }
}