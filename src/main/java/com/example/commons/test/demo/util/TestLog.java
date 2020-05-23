package com.example.commons.test.demo.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class TestLog {

    private static Log log = LogFactory.getLog(TestLog.class);
    public static void LogTest(){
        log.error("ERROR");
        log.warn("WARN");
        log.info("INFO");
    }
}
