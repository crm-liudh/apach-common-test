package com.example.commons.test.demo;

import com.example.commons.test.demo.util.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        //TestBeanUtils.BeanTest(); //操作对象
        //TestEncode.EncodeTest();  //常用加密
        //TestLang.LangTest();  //操作数组、字符串
        //TestLog.LogTest();  //日志
        TestEmail.EmailTest();//邮件发送
    }

}
