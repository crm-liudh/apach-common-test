package com.example.commons.test.demo.util;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.StringUtils;

public class TestLang {
    public static void LangTest() {
        String[] s1 = new String[]{"1", "2", "3"};
        String[] s2 = new String[]{"a", "b", "c"};
        //两个数组组合成新的数组
        String[] s = ArrayUtils.addAll(s1, s2);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
        String str = ArrayUtils.toString(s);
        //str = str.substring(1, str.length() - 1);
        System.out.println(str + ">>" + str.length());


        //2 截取从from开始字符串
        StringUtils.substringAfter("SELECT * FROM PERSON ", "from");
        //3 判断该字符串是不是为数字(0~9)组成，如果是，返回true 但该方法不识别有小数点和 请注意。
        StringUtils.isNumeric("454534"); //返回true
        //4.取得类名
        System.out.println(ClassUtils.getShortClassName(TestLang.class));
        //5.取得其包名
        System.out.println(ClassUtils.getPackageName(TestLang.class));
        //6.StringUtils,判断是否是空格字符
        System.out.println(StringUtils.isBlank("   ")+"---------"+StringUtils.isBlank("11"));
        //在右边加下字符,使之总长度为6
        System.out.println(StringUtils.rightPad("abc", 6, 'T'));
        //首字母大写
        System.out.println(StringUtils.capitalize("abc"));
        //Deletes all whitespaces from a String 删除所有空格
        System.out.println(StringUtils.deleteWhitespace("   ab  c  "));
        //判断是否包含这个字符
        System.out.println(StringUtils.contains("abc", "ba"));
        //表示左边两个字符
        System.out.println(StringUtils.left("abc", 2));

    }
}
