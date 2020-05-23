package com.example.commons.test.demo.util;

import com.example.commons.test.demo.bean.Person;

public class CommonStatic {

    public static String USERNAME = "1712277952@qq.com";
    public static String PASSWORD = "ogeounpteympccfj";

    public static Person initPerson(){
        Person person = new Person();
        person.setName("tom");
        person.setAge(21);
        person.setPassword("asd111");
        return person;
    }
}
