package com.cathy.actions;

import com.cathy.drivers.SeleniumDriver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.ArrayList;

/**
 * @author liangjunjun
 * @date 2021-05-15-17:11
 **/
public class ActionTest {

    @Test
    public void clickTest() throws InterruptedException{
        SeleniumDriver.open("firefox");
        Action.get("www.baidu.com");
        Action.sendText(By.id("kw"),"selenium");
        Action.click(By.id("su"));
        Thread.sleep(3000);
        SeleniumDriver.closed();
    }

    @Test
    public void getText() throws InterruptedException{
        SeleniumDriver.open("firefox");
        Action.get("http://www.baidu.com");
        String text = Action.getText(By.linkText("ÐÂÎÅ"));
        System.out.println(text);
        Thread.sleep(3000);
        SeleniumDriver.closed();
    }

    @Test
    public void getTexts() throws InterruptedException{
        SeleniumDriver.open("firefox");
        Action.get("http://www.baidu.com");
        ArrayList texts = Action.getTexts(By.xpath(".//*[@id='s-top-left']/a"));
        System.out.println(texts);
        Thread.sleep(3000);
        SeleniumDriver.closed();
    }

    @Test
    public void doubleClickTest() throws InterruptedException{
        SeleniumDriver.open("firefox");
        Action.get("http://www.baidu.com");
        Action.doubleClick(By.id("su"));
        Thread.sleep(3000);
        SeleniumDriver.closed();
    }
}
