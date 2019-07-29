package cn.wmyskxz.springboot;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TopicRabbitConfig {
   final static String message="top.message";
   final static String messags="top.messages";
   @Bean
   public Queue queueMessage(){
       return new Queue(TopicRabbitConfig.message);
   }
   @Bean
   public Queue queueMessages(){
       return new Queue(TopicRabbitConfig.messags);
   }
   @Bean
   public TopicExchange topicExchange(){
       return new TopicExchange("exchange");
   }
   @Bean
   Binding bindingExchangeMessage(Queue queueMessage,TopicExchange topicExchange){
       return BindingBuilder.bind(queueMessage).to(topicExchange).with("top.message");
   }
   @Bean
   Binding bindingExchangeMessages(Queue queueMessages,TopicExchange topicExchange){
       return BindingBuilder.bind(queueMessages).to(topicExchange).with("top.#");
   }
}
