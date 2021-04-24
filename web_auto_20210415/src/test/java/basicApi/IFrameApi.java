package basicApi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author liangjunjun
 * @date 2021-04-18-15:09
 **/
public class IFrameApi {

    WebDriver webDriver = null;

    @BeforeMethod
    public void openPageTest(){
        System.setProperty("webdriver.firefox.bin","D:\\Mozilla_Firefox\\firefox.exe");
        webDriver = new FirefoxDriver();
    }

    @Test
    public void iframeTest(){
        webDriver.get("D:\\auto_20210415\\docs\\index.html");
        webDriver.switchTo().frame("aa");
        webDriver.findElement(By.id("user")).sendKeys("selenium");
        webDriver.switchTo().defaultContent();
    }

    @AfterMethod
    public void closedPageTest(){
        webDriver.quit();
    }
}
