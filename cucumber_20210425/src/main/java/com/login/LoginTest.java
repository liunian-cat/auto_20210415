package com.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author liangjunjun
 * @date 2021-04-27-22:02
 **/
public class LoginTest {
    public static void login(WebDriver webDriver,String email,String pwd){
        webDriver.switchTo().frame("/html/body/div[2]/div[3]/div[1]/div/div[4]/div[1]/div[1]/iframe");
        webDriver.findElement(By.name("email")).sendKeys(email);
        webDriver.findElement(By.name("password")).sendKeys(pwd);
        webDriver.findElement(By.id("dologin")).click();
    }
}
