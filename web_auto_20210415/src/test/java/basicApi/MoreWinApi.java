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
 * @date 2021-04-18-15:51
 **/
public class MoreWinApi {

    WebDriver webDriver = null;

    @BeforeMethod
    public void openPageTest(){
        System.setProperty("webdriver.firefox.bin","D:\\Mozilla_Firefox\\firefox.exe");
        webDriver = new FirefoxDriver();
    }

    @Test
    public void moreWinTest() throws InterruptedException{
        webDriver.get("D:\\auto_20210415\\docs\\index.html");
        webDriver.findElement(By.xpath(".//*[@id='open']/a")).click();
        String handle = webDriver.getWindowHandle();
        for(String handles:webDriver.getWindowHandles()){
            if(handles.equals(handle)){
                continue;
            }else {
                webDriver.switchTo().window(handles);
            }
        }
        Thread.sleep(3000);
        webDriver.findElement(By.id("user")).sendKeys("selenium");
        Thread.sleep(3000);
        webDriver.close();
        webDriver.switchTo().window(handle);
        Thread.sleep(3000);
        webDriver.findElement(By.id("user")).sendKeys("appinum");
        Thread.sleep(3000);
    }

    @AfterMethod
    public void closedPageTest(){
        webDriver.quit();
    }
}
