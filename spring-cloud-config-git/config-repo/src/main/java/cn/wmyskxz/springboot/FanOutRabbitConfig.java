package cn.wmyskxz.springboot;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FanOutRabbitConfig {
    @Bean
 public Queue Amessage(){
    return new Queue("fanout.A");
}
@Bean
    public Queue Bmessage(){
        return new Queue("fanout.B");
}
@Bean
    public Queue Cmessage(){
        return new Queue("fanout.C");
}
@Bean
FanoutExchange fanoutExchange(){
        return new FanoutExchange("fanoutExchange");
}
@Bean
Binding bindingExchangeA(Queue Amessage,FanoutExchange fanoutExchange){
   return BindingBuilder.bind(Amessage).to(fanoutExchange);
}
@Bean
    Binding bindingExchangeB(Queue Bmessage,FanoutExchange fanoutExchange){
        return BindingBuilder.bind(Bmessage).to(fanoutExchange);
}
@Bean
    Binding bindingExchangeC(Queue Cmessage,FanoutExchange fanoutExchange){
        return BindingBuilder.bind(Cmessage).to(fanoutExchange);
}
}
