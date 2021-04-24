package basicApi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author liangjunjun
 * @date 2021-04-20-19:48
 **/
public class SeleniumGrid {

    @DataProvider(name="data1")
    public Object[][] dataT(){
        return new Object[][]{
                {"http://192.168.1.107:5555","chrome"},
                {"http://192.168.153.131:5555","firefox"},
        };
    }

    @Test(dataProvider = "data1")
    public void testGrid2(String url,String browser) throws MalformedURLException,InterruptedException{
        DesiredCapabilities desiredCapabilities;
        if(browser == "chrome"){
            desiredCapabilities = DesiredCapabilities.chrome();
        }else if (browser == "firefox"){
            desiredCapabilities = DesiredCapabilities.firefox();
        }else {
            desiredCapabilities = DesiredCapabilities.internetExplorer();
        }
        String uri = url+"/wd/hub";
        WebDriver driver = new RemoteWebDriver(new URL(uri),desiredCapabilities);
        driver.get("http://www.baidu.com");
        Thread.sleep(3000);
        driver.quit();
    }
}
