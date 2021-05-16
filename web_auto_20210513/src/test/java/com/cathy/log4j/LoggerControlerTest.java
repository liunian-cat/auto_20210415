package com.cathy.log4j;

import org.testng.annotations.Test;

/**
 * @author liangjunjun
 * @date 2021-05-16-10:08
 **/
public class LoggerControlerTest {

    final static LoggerControler log = LoggerControler.getLogger(LoggerControlerTest.class);

    @Test
    public void testCase(){
        log.info("这是info");
        log.debug("这是debug");
        log.warn("这是warn");
        log.error("这是error");
    }
}
