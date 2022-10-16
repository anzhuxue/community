package com.nowcoder.community.mapper;

import com.nowcoder.community.dao.UserMapper;
import com.nowcoder.community.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserMappertests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelectById(){
        User user = userMapper.selectById(1);
        System.out.println(user);

        User lisi = userMapper.selectByName("lisi");
        System.out.println(lisi);
        User user1 = userMapper.selectByEmail("123456");
        System.out.println(user1);
    }

    @Test
    public void testInsertUser(){
        User user = new User();
        user.setUsername("test");
        user.setPassword("23243");
        user.setSalt("abc");
        user.setEmail("test@example.com");
        user.setHeaderUrl("http://example.com");
        user.setCreateTime(new Date());

        int i = userMapper.insertUser(user);
        System.out.println(i);
        System.out.println(user.getId());

    }
    @Test
    public void testUpdateUser(){
        int i = userMapper.updateStatus(4, 1);
        System.out.println(i);

        int i1 = userMapper.updateHeader(4, "http://example.commm");
        System.out.println(i1);

        int i2 = userMapper.updatePassword(4, "2132");
        System.out.println(i2);
    }


}
