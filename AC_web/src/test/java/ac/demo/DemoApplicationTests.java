package ac.demo;

import ac.front.beans.ac_beans_edit;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;
    @Test
    public void contextLoads() {
        ValueOperations val = redisTemplate.opsForValue();
//        val.set("a","yu");

//        redisTemplate.delete("a");
//        val.set("c",123456,30, TimeUnit.SECONDS);
        ac_beans_edit edit = new ac_beans_edit();
        edit.setAc_edit_id(1);
        edit.setAc_edit_name("tom");
        val.set("u1",edit,20,TimeUnit.SECONDS);
        ac_beans_edit e1 = (ac_beans_edit)val.get("u1");
        System.out.println(e1);

    }

}
