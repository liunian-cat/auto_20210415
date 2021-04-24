package basicApi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * @author liangjunjun
 * @date 2021-04-18-16:15
 **/
public class WaitApi {

    WebDriver webDriver = null;

    @BeforeMethod
    public void openPageTest(){
        System.setProperty("webdriver.firefox.bin","D:\\Mozilla_Firefox\\firefox.exe");
        webDriver = new FirefoxDriver();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);//ȫ�ֵȴ�
    }

    @Test
    public void threadTest() throws InterruptedException{
        webDriver.get("http://www.baidu.com");
        Thread.sleep(3000);//�̵߳ȴ�
    }

    @Test
    public void showTest(){
        webDriver.get("http://www.baidu.com");
        //��ʾ�ȴ�   ��ȡԪ�ض�λ
        new WebDriverWait(webDriver,3).until(ExpectedConditions.presenceOfElementLocated(By.id("kw")));
    }

    @AfterMethod
    public void closedPageTest(){
        webDriver.close();
    }
}
