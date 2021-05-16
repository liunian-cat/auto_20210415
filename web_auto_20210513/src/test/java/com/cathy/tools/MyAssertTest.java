package com.cathy.tools;

import com.cathy.actions.Action;
import com.cathy.drivers.SeleniumDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

/**
 * @author liangjunjun
 * @date 2021-05-16-15:49
 **/
public class MyAssertTest {

    @Test
    public void testCase(){
        SeleniumDriver.open("firefox");
        Action.get("http://www.baidu.com");
        MyAssert.assertEquals("123456","sdfdsfds");
    }
}
