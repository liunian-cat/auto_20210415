package com.cathy.find;

import com.cathy.drivers.SeleniumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * @author liangjunjun
 * @date 2021-05-15-16:13
 **/
public class WebElementUtils extends SeleniumDriver {

    public static WebElement findElement(final By by){
        try {
            new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfElementLocated(by));
        }catch (Exception e){
            System.out.println("元素:"+by+"查找超时！");
            e.printStackTrace();
        }
        return driver.findElement(by);
    }

    public static List<WebElement> findElements(final By by){
        try {
            new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfElementLocated(by));
        }catch (Exception e){
            System.out.println("元素:"+by+"查找超时！");
            e.printStackTrace();
        }
        return driver.findElements(by);
    }
}
