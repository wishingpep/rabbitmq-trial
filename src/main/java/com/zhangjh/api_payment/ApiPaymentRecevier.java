package com.zhangjh.api_payment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ApiPaymentRecevier {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RabbitHandler
    @RabbitListener(queues = "api.payment")
    public void order(String msg) {
        logger.info("从api.payment队列中接收到消息：" + msg);
    }
}
