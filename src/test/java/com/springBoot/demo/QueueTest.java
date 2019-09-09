package com.springBoot.demo;

import com.springBoot.demo.common.util.MqSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = application.class)
public class QueueTest {


    @Autowired
    private MqSender mqSender;
    /**
     * 测试消息队列
     */
    @Test
    public void testMq(){
        this.mqSender.send("hello");
    }
}
