package basicApi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.security.Key;

/**
 * @author liangjunjun
 * @date 2021-04-18-21:02
 **/
public class RobotApi {

    WebDriver webDriver = null;

    @BeforeMethod
    public void openPageTest(){
        System.setProperty("webdriver.firefox.bin","D:\\Mozilla_Firefox\\firefox.exe");
        webDriver = new FirefoxDriver();
    }

    @Test
    public void robotTest() throws AWTException{
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_S);
        int keyS = (int)new Character('S');
        robot.keyRelease(keyS);
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }

    @AfterMethod
    public void closedPageTest(){
        webDriver.quit();
    }
}
