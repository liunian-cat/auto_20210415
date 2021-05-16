package com.steps;

import com.login.LoginTest;
import cucumber.api.PendingException;
import cucumber.api.java.es.Y;
import cucumber.api.java.zh_cn.假如;
import cucumber.api.java.zh_cn.并且;
import cucumber.api.java.zh_cn.当;
import cucumber.api.java.zh_cn.那么;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author liangjunjun
 * @date 2021-04-25-21:51
 **/
public class Steps1 {
    WebDriver webDriver;

    @当("^打开163网站$")
    public void openUrl() {
        System.setProperty("webdriver.firefox.bin","D:\\Mozilla_Firefox\\firefox.exe");
        webDriver = new FirefoxDriver();
        webDriver.get("https://mail.163.com/");
        System.out.println("打开163网站\n");
    }

    @并且("^在email文本框中输入\"(.*?)\"$")
    public void inputEmail(String arg0){
        System.out.println("输入email:"+arg0+"\n");
    }

    @并且("^在密码框输入\"(.*?)\"$")
    public void inputPwd(String arg0){
        System.out.println("输入密码:"+arg0+"\n");
    }

    @当("^点击登录按钮$")
    public void clickLoginButton() {
        System.out.println("点击登录按钮\n");
    }

    @那么("^登录成功$")
    public void loginSuccess() {
        System.out.println("登录成功\n");
    }

    @假如("^用\"(.*?)\"账号，密码\"(.*?)\"登录$")
    public void login(String username, String pwd) {
        LoginTest.login(webDriver,username,pwd);
    }
}
