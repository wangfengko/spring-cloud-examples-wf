package cn.wmyskxz.springboot;

import com.sun.media.jfxmedia.logging.Logger;
import org.apache.catalina.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRedis {
    private StringRedisTemplate stringRedisTemplate;
    private RedisTemplate redisTemplate;
    @Autowired
    private UserResposity userResposity;
    @Test
    public void  test(){
        stringRedisTemplate.opsForValue().set("aaa","111");
        Assert.assertEquals("111",stringRedisTemplate.opsForValue().get("aaa"));
    }
    @Test
    public void testObj() {
//        User suer = new User("aa@126.com", "aa", "aa123456");
//        ValueOperations<String, User> operations = redisTemplate.opsForValue();
//        operations.set("com.neox", user);
//        operations.set("com.neo.f", user, 1, TimeUnit.SECONDS);
//        Threed.sleep(1000);
//        boolean exists = redisTemplate.hasKey("com.neo.f");
//        if (exists) {
//            System.out.println("exists is true");
//        } else {
//            System.out.print("exists is false");
//        }
    }
    @Test
    public void testBaseQuery(){
//        User user=new User();
        userResposity.findAll();
//        userResposity.findOne(1l);
//        userResposity.save(user);
//        userResposity.delete(user);
//        userResposity.count();
//        userResposity.exists(1|)
    }
}
