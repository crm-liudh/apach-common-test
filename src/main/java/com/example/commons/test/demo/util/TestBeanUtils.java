package com.example.commons.test.demo.util;

import com.example.commons.test.demo.bean.Person;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.MethodUtils;

import java.util.HashMap;
import java.util.Map;

public class TestBeanUtils {

    public static void BeanTest(){
        Person person = CommonStatic.initPerson();
        try {
            //克隆对象
            Person person2 =  (Person) BeanUtils.cloneBean(person);
            System.out.println(person2.getName()+">>"+person2.getAge());
            Map map1 = new HashMap();
            map1.put("name","tom1");
            map1.put("email","tom@");
            map1.put("age","22");
            map1.put("password","53423afd");
            //map转换为Bean
            BeanUtils.populate(person,map1);
            System.out.println(person.getName()+">>"+person.getAge()+">>"+person.getEmail()+">>"+person.getPassword());
            //Bean转换为map
            Map map2 = BeanUtils.describe(person);
            System.out.println(map2.get("name")+":"+map2.get("email"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}