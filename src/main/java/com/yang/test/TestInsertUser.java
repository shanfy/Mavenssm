package com.yang.test;

import com.yang.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: shanfy
 * @Date: 2019/7/28 14:50
 */
public class TestInsertUser {
    private ApplicationContext context;
    @Before
    public void init(){
        context = new ClassPathXmlApplicationContext("spring-core.xml");
    }
    @Test
    public void insertUser(){
        UserService service = (UserService) context.getBean("userService");
        System.out.println(service);
    }
}
