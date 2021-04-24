package basicApi;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

/**
 * @author liangjunjun
 * @date 2021-04-15-20:51
 **/
public class BrowserApi {

    WebDriver webDriver = null;

    @Test
    public void openFireFoxTest(){
        System.setProperty("webdriver.firefox.bin", "D:\\Mozilla_Firefox\\firefox.exe");
        webDriver = new FirefoxDriver();
        //webDriver.close();
        webDriver.quit();
    }

    @Test
    public void openPageTest(){
        System.setProperty("webdriver.firefox.bin", "D:\\Mozilla_Firefox\\firefox.exe");
        webDriver = new FirefoxDriver();
        //webDriver.get("http://www.baidu.com");
        webDriver.navigate().to("http://www.baidu.com");
    }

    @Test
    public void backPageTest(){
        System.setProperty("webdriver.firefox.bin", "D:\\Mozilla_Firefox\\firefox.exe");
        webDriver = new FirefoxDriver();
        webDriver.get("http://www.baidu.com");
        webDriver.get("http://www.taobao.com");
        webDriver.navigate().back();
    }

    @Test
    public void forwardPageTest() throws InterruptedException{
        System.setProperty("webdriver.firefox.bin", "D:\\Mozilla_Firefox\\firefox.exe");
        webDriver = new FirefoxDriver();
        webDriver.get("http://www.baidu.com");
        webDriver.get("http://www.taobao.com");
        webDriver.navigate().back();
        webDriver.navigate().forward();
        Thread.sleep(3000);
    }

    @Test
    public void refreshPageTest() throws InterruptedException{
        System.setProperty("webdriver.firefox.bin", "D:\\Mozilla_Firefox\\firefox.exe");
        webDriver = new FirefoxDriver();
        webDriver.get("http://www.baidu.com");
        Thread.sleep(3000);
        webDriver.navigate().refresh();
        Thread.sleep(3000);
    }

    @Test
    public void maxBrowserTest() throws InterruptedException{
        System.setProperty("webdriver.firefox.bin", "D:\\Mozilla_Firefox\\firefox.exe");
        webDriver = new FirefoxDriver();
        webDriver.get("http://www.baidu.com");
        Thread.sleep(3000);
        webDriver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @Test
    public void setBrowserSizeTest() throws InterruptedException{
        System.setProperty("webdriver.firefox.bin", "D:\\Mozilla_Firefox\\firefox.exe");
        webDriver = new FirefoxDriver();
        webDriver.get("http://www.baidu.com");
        Dimension dimension = new Dimension(900,500);
        webDriver.manage().window().setSize(dimension);
        Thread.sleep(3000);
    }

    @Test
    public void getUrlTest() throws InterruptedException{
        System.setProperty("webdriver.firefox.bin", "D:\\Mozilla_Firefox\\firefox.exe");
        webDriver = new FirefoxDriver();
        webDriver.get("http://www.baidu.com");
        String url = webDriver.getCurrentUrl();
        System.out.println(url);
        Thread.sleep(3000);
    }

    @Test
    public void getTitleTest() throws InterruptedException{
        System.setProperty("webdriver.firefox.bin", "D:\\Mozilla_Firefox\\firefox.exe");
        webDriver = new FirefoxDriver();
        webDriver.get("http://www.baidu.com");
        String title = webDriver.getTitle();
        System.out.println(title);
        Thread.sleep(3000);
    }

    @Test
    public void clearTest() throws InterruptedException{
        System.setProperty("webdriver.firefox.bin", "D:\\Mozilla_Firefox\\firefox.exe");
        webDriver = new FirefoxDriver();
        webDriver.get("http://www.baidu.com");
        WebElement element = webDriver.findElement(By.id("kw"));
        element.sendKeys("selenium");
        Thread.sleep(3000);
        element.clear();//Çå¿ÕÎÄ±¾
        Thread.sleep(3000);
    }

    @Test
    public void getTagNameTest() throws InterruptedException{
        System.setProperty("webdriver.firefox.bin", "D:\\Mozilla_Firefox\\firefox.exe");
        webDriver = new FirefoxDriver();
        webDriver.get("http://www.baidu.com");
        WebElement element = webDriver.findElement(By.id("kw"));
        String tagName = element.getTagName();
        System.out.println(tagName);
        Thread.sleep(3000);
    }

    @Test
    public void getAttributeTest() throws InterruptedException{
        System.setProperty("webdriver.firefox.bin", "D:\\Mozilla_Firefox\\firefox.exe");
        webDriver = new FirefoxDriver();
        webDriver.get("http://www.baidu.com");
        WebElement element = webDriver.findElement(By.id("kw"));
        element.sendKeys("selenium");
        String attributeValue = element.getAttribute("value");
        System.out.println(attributeValue);
        Thread.sleep(3000);
    }

    @AfterMethod
    public void closedBrowser(){
        webDriver.close();
    }


}
