package com.nowcoder.community.mapper;

import com.nowcoder.community.dao.DiscussPostMapper;
import com.nowcoder.community.entity.DiscussPost;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DiscussPostMapperTests {

    @Autowired
    private DiscussPostMapper discussPostMapper;

    @Test
    public void testSelectPosts(){
        List<DiscussPost> discussPosts = discussPostMapper.selectDiscussPosts(105, 0, 10);
        for (DiscussPost discusspost : discussPosts) {
            System.out.println(discusspost);
        }

        int i = discussPostMapper.selectDiscussPostRows(104);
        System.out.println(i);

    }

}
