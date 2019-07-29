package cn.wmyskxz.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.util.Date;

//@RestController
@Controller
public class HelloController {
//    @Value("${content}")
////   private String content;
////    @RequestMapping("hello")
////    public String hello(){
////         return content;
////    }
//    @Autowired
//    private StudentProperties studentProperties;
    @RequestMapping("/hello")
    public String hello(Model m){
//        return studentProperties.getName()+","+studentProperties.getAge();
        m.addAttribute("now",DateFormat.getDateTimeInstance().format(new Date()));
        return "hello";
    }
}
