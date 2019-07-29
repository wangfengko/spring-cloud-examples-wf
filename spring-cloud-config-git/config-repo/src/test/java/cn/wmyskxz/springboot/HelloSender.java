package cn.wmyskxz.springboot;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class HelloSender {
    @Autowired
private AmqpTemplate amqpTemplate;
    public void send(){
        String context="hello"+new Date();
        System.out.println("Sender:"+context);
        this.amqpTemplate.convertAndSend("hello",context);
    }
    public void sendVar(String tempVar){
        System.out.println("Sender:"+tempVar);
        this.amqpTemplate.convertAndSend("hello",tempVar);
    }
    public void sendTopicMessage(){
        String context="hi I am topic one";
        System.out.println("Sender:"+context);
        this.amqpTemplate.convertAndSend("exchange","topic.message",context);
    }
    public void sendTopicMessages(){
        String context="hi I am topoc two";
        System.out.println("Sender:"+context);
        this.amqpTemplate.convertAndSend("exchange","topic.messages",context);
    }
    public void sendFanoutMessages(){
        String context="hi I am fanout Message";
        System.out.println("Sender:"+context);
        this.amqpTemplate.convertAndSend("fanoutExchange","",context);
    }
}
