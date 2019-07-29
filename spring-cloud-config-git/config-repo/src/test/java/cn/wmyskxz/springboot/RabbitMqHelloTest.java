package cn.wmyskxz.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitMqHelloTest {
    @Autowired
   private HelloSender helloSender;
    @Autowired
    private HelloSender helloSender2;
    @Test
    public void send() throws  Exception{
        helloSender.send();
    }
    @Test
    public void oneToMany() throws Exception{
        for (int i=0;i<100;i++){
            helloSender.sendVar(String.valueOf(i));
            helloSender2.sendVar(String.valueOf(i));
        }
    }
    @Test
    public void sendTopicMessage() throws Exception{
        this.helloSender.sendTopicMessage();
        this.helloSender.sendTopicMessages();
    }

    @Test
    public void sendFanoutMessage() throws Exception{
        this.helloSender.sendFanoutMessages();
    }
}
