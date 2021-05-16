package com.cathy.drivers;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

/**
 * @author liangjunjun
 * @date 2021-05-15-15:36
 **/
public class SeleniumDriverTest {

    @Test
    public void openTest() throws InterruptedException{
        WebDriver driver = SeleniumDriver.open("firefox");
        Thread.sleep(3000);
        SeleniumDriver.closed();
    }

}
