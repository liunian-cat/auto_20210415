package basicApi;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author liangjunjun
 * @date 2021-04-22-19:01
 **/
public class DataProviderApi {

    @DataProvider(name = "data1")
    public Object[][] data(){
        return new Object[][]{{"1","a"},{"2","b"},{"3","c"}};
    }

    @Test(dataProvider = "data1")
    public void dataProviderTest(String i,String j){
        System.out.println("i:"+i+",j:"+j);
    }
}
