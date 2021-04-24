package basicApi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author liangjunjun
 * @date 2021-04-18-13:43
 **/
public class AssertApi {

    WebDriver webDriver = null;

    @BeforeMethod
    public void openPageTest(){
        System.setProperty("webdriver.firefox.bin","D:\\Mozilla_Firefox\\firefox.exe");
        webDriver = new FirefoxDriver();
    }

    @Test
    public void isDisplayedTest(){
        webDriver.get("http://www.baidu.com");
        boolean isDisplayed = webDriver.findElement(By.id("su")).isDisplayed();
        Assert.assertTrue(isDisplayed,"百度一下按钮展示");
        System.out.println("百度一下按钮展示");
    }

    @Test
    public void isSelectedTest(){
        webDriver.get("D:\\auto_20210415\\docs\\index.html");
        boolean isSelected = webDriver.findElement(By.xpath(".//*[@id='radio']/label[1]")).isSelected();
        Assert.assertTrue(isSelected,"Volvo未被选中");
    }

    @Test
    public void isEnabledTest(){
        webDriver.get("D:\\auto_20210415\\docs\\index.html");
        boolean isEnabled = webDriver.findElement(By.name("buttonhtml")).isEnabled();
        Assert.assertTrue(isEnabled,"submit按钮不可用");
    }

    @AfterMethod
    public void closedPageTest(){
        webDriver.quit();
    }
}
