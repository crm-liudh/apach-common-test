package com.example.commons.test.demo.util;

import com.example.commons.test.demo.bean.Person;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.codec.net.URLCodec;

public class TestEncode {
    public static void EncodeTest() {
        Person person = CommonStatic.initPerson();
        try {
            String str = "";

            //BASE64
            System.out.println("===============BASE64======================");
            Base64 base64 = new Base64();
            str = base64.encodeToString(person .getPassword().getBytes("UTF-8"));
            System.out.println(str);
            //MD5
            System.out.println("===============MD5======================");
            str = DigestUtils.md5Hex(person .getPassword());
            System.out.println(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
