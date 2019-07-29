package cn.wmyskxz.springboot;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class Scheduler2Task {
    /**
     * spring-boot定时任务
     */
    private static  final SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
public void reportCurrentTime(){
    System.out.println("当前时间:"+sdf.format(new Date()));
}
}
