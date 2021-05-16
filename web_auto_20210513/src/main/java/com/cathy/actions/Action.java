package com.cathy.actions;

import com.cathy.drivers.SeleniumDriver;
import com.cathy.find.WebElementUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liangjunjun
 * @date 2021-05-15-17:06
 **/
public class Action extends SeleniumDriver {

    //打开网站
    public static void get(String url){
        if(!url.startsWith("http")){
            String url2 = "http://"+url;
            driver.get(url2);
        }else {
            driver.get(url);
        }
    }

    //点击
    public static void click(By by){
        WebElementUtils.findElement(by).click();
    }

    //文本框输入
    public static void sendText(By by,String value){
        WebElement element = WebElementUtils.findElement(by);
        element.clear();
        element.sendKeys(value);
    }

    //获取文本值
    public static String getText(By by){
        String text = WebElementUtils.findElement(by).getText();
        return text;
    }

    //获取多个文本值
    public static ArrayList getTexts(By by){
        ArrayList arrayList = new ArrayList();
        List<WebElement> elementList = WebElementUtils.findElements(by);
        for (WebElement element:elementList){
            arrayList.add(element.getText());
        }
        return arrayList;
    }

    //双击
    public static void doubleClick(By by){
        WebElement element = WebElementUtils.findElement(by);
        Actions actions = new Actions(driver);
        actions.doubleClick(element).perform();
    }
}

