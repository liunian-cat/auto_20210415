package basicApi;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author liangjunjun
 * @date 2021-04-15-20:27
 **/
public class EqualsApi {

    @Test
    public void test1(){
        Assert.assertEquals(2,2,"相等");
    }

    @Test
    public void test2(){
        Assert.assertNotEquals(2,3,"不相等");
    }

    @Test
    public void test3(){
        Assert.assertNull("");
    }

    @Test
    public void test4(){
        Assert.assertNull(null);
    }

    @Test
    public void test5(){
        Assert.assertNotNull("");
    }

    @Test
    public void test6(){
        Assert.assertNotNull(null);
    }
}
