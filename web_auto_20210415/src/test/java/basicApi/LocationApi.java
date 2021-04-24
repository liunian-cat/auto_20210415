package basicApi;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

/**
 * @author liangjunjun
 * @date 2021-04-17-17:10
 * 八种定位方式
 **/
public class LocationApi {

    WebDriver webDriver = null;

    @BeforeMethod
    public void openPageTest(){
        System.setProperty("webdriver.firefox.bin","D:\\Mozilla_Firefox\\firefox.exe");
        webDriver = new FirefoxDriver();
    }

    /*@Test
    public void byIdTest() throws InterruptedException{
        webDriver.get("http://www.baidu.com");
        WebElement element = webDriver.findElement(By.id("kw"));
        element.sendKeys("selenium");
        Thread.sleep(3000);
    }*/

    /*@Test
    public void byNameTest() throws InterruptedException{
        webDriver.get("http://www.baidu.com");
        WebElement element = webDriver.findElement(By.name("wd"));
        element.sendKeys("selenium");
        Thread.sleep(3000);
    }*/

    /*@Test
    public void byClassNameTest() throws InterruptedException{
        webDriver.get("http://www.baidu.com");
        WebElement element = webDriver.findElement(By.className("s_ipt"));
        element.sendKeys("selenium");
        Thread.sleep(3000);
    }*/

    /*@Test
    public void byLinkTextTest() throws InterruptedException{
        webDriver.get("http://www.baidu.com");
        WebElement element = webDriver.findElement(By.linkText("新闻"));
        element.click();
//        Thread.sleep(3000);
    }*/

    /*@Test
    public void byPartialLinkTextTest() throws InterruptedException{
        webDriver.get("http://www.baidu.com");
        WebElement element = webDriver.findElement(By.partialLinkText("hao"));
        element.click();
        Thread.sleep(3000);
    }*/

    /*@Test
    public void byTagNameTest() throws InterruptedException{
        webDriver.get("http://www.baidu.com");
        List<WebElement> element = webDriver.findElements(By.tagName("input"));
        System.out.println(element.size());
        Thread.sleep(3000);
    }*/

    /*@Test
    public void byXpathTest() throws InterruptedException{
        webDriver.get("http://www.baidu.com");
        WebElement element = webDriver.findElement(By.xpath(".//*[@id='kw']"));
        element.sendKeys("selenium");
        Thread.sleep(3000);
    }*/

    @Test
    public void byCssSelectorTest() throws InterruptedException{
        webDriver.get("http://www.baidu.com");
        WebElement element = webDriver.findElement(By.cssSelector("#kw"));
        element.sendKeys("selenium");
        Thread.sleep(3000);
    }

    @AfterMethod
    public void closePage(){
        webDriver.quit();
    }
}
