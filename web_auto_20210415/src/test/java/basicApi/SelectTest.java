package basicApi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author liangjunjun
 * @date 2021-04-18-15:32
 **/
public class SelectTest {

    WebDriver webDriver = null;

    @BeforeMethod
    public void openPageTest(){
        System.setProperty("webdriver.firefox.bin","D:\\Mozilla_Firefox\\firefox.exe");
        webDriver = new FirefoxDriver();
    }

    @Test
    public void selectTest() throws InterruptedException{
        webDriver.get("D:\\auto_20210415\\docs\\index.html");
        WebElement element = webDriver.findElement(By.id("moreSelect"));
        Select select = new Select(element);
        select.selectByIndex(0);
        Thread.sleep(2000);
        select.selectByValue("vivo");
        Thread.sleep(2000);
        select.selectByVisibleText("meizu");
        Thread.sleep(2000);
    }

    @AfterMethod
    public void closedPageTest(){
        webDriver.quit();
    }
}
