package cn.wmyskxz.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {
    @Autowired
    UserResposity userResposity;
    @Test
    public void contextLoads() {
    }
    @Test
    public void testPageQuery() throws Exception{
        int page=1,size=10;
        Sort sort=new Sort(Sort.Direction.DESC,"id");
        Pageable pageable=new PageRequest(page,size,sort);
        userResposity.findAll(pageable);
        userResposity.findByUserName("testName",pageable);
    }

}

