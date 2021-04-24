package basicApi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author liangjunjun
 * @date 2021-04-18-16:38
 **/
public class ActionsApi {

    WebDriver webDriver = null;

    @BeforeMethod
    public void openPageTest(){
        System.setProperty("webdriver.firefox.bin","D:\\Mozilla_Firefox\\firefox.exe");
        webDriver = new FirefoxDriver();
    }

    @Test
    public void clickTest() throws InterruptedException{
        webDriver.get("http://www.baidu.com");
        WebElement element = webDriver.findElement(By.id("su"));
        Actions actions = new Actions(webDriver);
        actions.contextClick(element).perform();//右击
        Thread.sleep(3000);
        actions.doubleClick(element).perform();//双击
        Thread.sleep(3000);
    }

    @Test
    public void movetoElementTest() throws InterruptedException{
        webDriver.get("http://www.baidu.com");
        WebElement element = webDriver.findElement(By.name("tj_briicon"));
        Actions actions = new Actions(webDriver);
        actions.moveToElement(element).perform();//移动到某个元素
        Thread.sleep(3000);
    }

    @Test
    public void dragTest() throws InterruptedException{
        webDriver.get("D:\\auto_20210415\\docs\\dragAndDrop.html");
        WebElement element = webDriver.findElement(By.xpath("/html/body/div[1]"));
        Actions actions = new Actions(webDriver);
        actions.dragAndDropBy(element,300,400).perform();//拖动元素
        Thread.sleep(3000);
    }

    @Test
    public void dragToAnotherTest() throws InterruptedException{
        webDriver.get("D:\\auto_20210415\\docs\\dragAndDrop.html");
        WebElement oneElement = webDriver.findElement(By.id("drag"));
        WebElement anotherelement = webDriver.findElement(By.xpath("/html/body/h1"));
        Actions actions = new Actions(webDriver);
        actions.clickAndHold(oneElement).moveToElement(anotherelement).release(anotherelement).perform();//拖动元素到另一个元素上
        Thread.sleep(3000);
    }

    @Test
    public void selectTest() throws InterruptedException{
        webDriver.get("D:\\auto_20210415\\docs\\index.html");
        WebElement element = webDriver.findElement(By.id("selectWithMultipleEqualsMultiple"));
        List<WebElement> options = element.findElements(By.tagName("option"));
        Actions actions = new Actions(webDriver);
        actions.keyDown(Keys.SHIFT).click(options.get(0)).click(options.get(2)).build().perform();//下拉框多选
        Thread.sleep(3000);
    }

    @AfterMethod
    public void closedPageTest(){
        webDriver.close();
    }
}
