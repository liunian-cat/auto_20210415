package com.cathy.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * @author liangjunjun
 * @date 2021-05-13-22:03
 **/
public class SeleniumDriver {

    public static WebDriver driver;

    public static WebDriver open(String browser){
        String path = System.getProperty("user.dir");
        if(browser.equals("chrome")){
            driver = new ChromeDriver();
        }else if(browser.equals("ie")){
            driver = new InternetExplorerDriver();
        }else if(browser.equals("firefox")){
            System.setProperty("webdriver.firefox.bin","D:\\Mozilla_Firefox\\firefox.exe");
            driver = new FirefoxDriver();
        }else{
            System.out.println("你传入的浏览器名称有误:"+browser);
        }
        return driver;
    }

    public static void closedAll(){
        if(driver == null){
            driver.quit();
        }
    }

    public static void closed(){
        driver.close();
    }
}
