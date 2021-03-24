package com.cloud.spring;

import com.cloud.spring.entities.User;
import com.cloud.spring.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {
    @Resource
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        String[] nameArr = {"xiaoming","xiaohong","xiaolan","xiaohua","xiaomei"};
        for(int i=0;i<5;i++) {
            User user = new User();
            user.setName(nameArr[i]);
            userMapper.insert(user);
        }
        List<User> userList = userMapper.selectList(null);
        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }
}
