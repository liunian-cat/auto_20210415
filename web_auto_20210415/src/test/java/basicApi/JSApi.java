package basicApi;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author liangjunjun
 * @date 2021-04-18-21:27
 **/
public class JSApi {

    WebDriver webDriver = null;

    @BeforeMethod
    public void openPageTest(){
        System.setProperty("webdriver.firefox.bin","D:\\Mozilla_Firefox\\firefox.exe");
        webDriver = new FirefoxDriver();
    }

    @Test
    public void jsTest() throws InterruptedException{
        webDriver.get("http://www.baidu.com");
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)webDriver;
        javascriptExecutor.executeScript("document.getElementById(\"kw\").setAttribute(\"value\",\"Ö´ÐÐjs\")");
        Thread.sleep(3000);
    }

    @AfterMethod
    public void closedPageTest(){
        webDriver.quit();
    }
}
