package com.cathy.tools;

import org.testng.annotations.Test;

/**
 * @author liangjunjun
 * @date 2021-05-16-11:55
 **/
public class DateFormateTest {

    @Test
    public void formatTest(){
        String date_now = DateFormate.format(DateFormate.CHECK_LOG_FORMAT);
        System.out.println("当前时间为："+date_now);
    }

    @Test
    public void timeTest(){
        String randomNum = DateFormate.time();
        System.out.println("11位的随机数为："+randomNum);
    }
}
