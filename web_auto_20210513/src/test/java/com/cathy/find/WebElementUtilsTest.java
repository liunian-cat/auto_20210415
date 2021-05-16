package com.cathy.find;

import com.cathy.drivers.SeleniumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

/**
 * @author liangjunjun
 * @date 2021-05-15-16:27
 **/
public class WebElementUtilsTest {

    @Test
    public void findTest(){
        WebDriver driver = SeleniumDriver.open("firefox");
        driver.get("D:\\auto_20210415\\docs\\index.html");
        WebElementUtils.findElement(By.className("wait")).click();
        String text = WebElementUtils.findElement(By.className("red")).getText();
        System.out.println(text);
        SeleniumDriver.closed();
    }
}
