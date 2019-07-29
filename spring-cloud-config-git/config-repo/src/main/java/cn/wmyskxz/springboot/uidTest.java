package cn.wmyskxz.springboot;

import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.UUID;


public class uidTest {
    @RequestMapping("/uid")
    String uid(HttpSession session){
        UUID uid= (UUID) session.getAttribute("uid");
        if(uid==null){
            uid=UUID.randomUUID();
        }
        session.setAttribute("uid",uid);
        return session.getId();
    }
}
