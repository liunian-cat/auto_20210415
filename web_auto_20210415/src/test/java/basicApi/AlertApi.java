package basicApi;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author liangjunjun
 * @date 2021-04-18-14:53
 **/
public class AlertApi {

    WebDriver webDriver = null;

    @BeforeMethod
    public void openFireFoxTest(){
        System.setProperty("webdriver.firefox.bin", "D:\\Mozilla_Firefox\\firefox.exe");
        webDriver = new FirefoxDriver();
    }

    @Test
    public void alertTest() throws InterruptedException{
        webDriver.get("D:\\auto_20210415\\docs\\index.html");
        webDriver.findElement(By.xpath(".//*[@id='alert']/input")).click();
        Thread.sleep(3000);
        Alert alert = webDriver.switchTo().alert();
        alert.accept();
        System.out.println("alert弹框结束");
    }

    @Test
    public void confirmTest() throws InterruptedException{
        webDriver.get("D:\\auto_20210415\\docs\\index.html");
        webDriver.findElement(By.xpath(".//*[@id='confirm']/input")).click();
        Thread.sleep(3000);
        Alert alert = webDriver.switchTo().alert();
        alert.accept();
        System.out.println("confirm弹框确定按钮");
    }

    @Test
    public void confirmTest1() throws InterruptedException{
        webDriver.get("D:\\auto_20210415\\docs\\index.html");
        webDriver.findElement(By.xpath(".//*[@id='confirm']/input")).click();
        Thread.sleep(3000);
        Alert alert = webDriver.switchTo().alert();
        alert.dismiss();
        System.out.println("confirm弹框取消按钮");
    }

    @Test
    public void promptTest() throws InterruptedException{
        webDriver.get("D:\\auto_20210415\\docs\\index.html");
        webDriver.findElement(By.xpath(".//*[@id='prompt']/input")).click();
        Thread.sleep(3000);
        Alert prompt = webDriver.switchTo().alert();
        prompt.sendKeys("this is prompt");
        Thread.sleep(1000);
        prompt.accept();
        System.out.println("prompt弹框确认按钮");
    }

    @Test
    public void promptTest1() throws InterruptedException{
        webDriver.get("D:\\auto_20210415\\docs\\index.html");
        webDriver.findElement(By.xpath(".//*[@id='prompt']/input")).click();
        Thread.sleep(3000);
        Alert prompt = webDriver.switchTo().alert();
        //prompt.sendKeys("this is prompt");
        //Thread.sleep(1000);
        prompt.dismiss();
        System.out.println("prompt弹框取消按钮");
    }

    @AfterMethod
    public void closedPageTest(){
        webDriver.quit();
    }
}
