package com.cloud.spring;

import com.cloud.spring.mapper.DictionaryMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DictionaryTest {
    @Resource
    private DictionaryMapper dictionaryMapper;
    @Test
    public void testCreateTable(){
        dictionaryMapper.createTable("sys_test_2021");
    }
}
