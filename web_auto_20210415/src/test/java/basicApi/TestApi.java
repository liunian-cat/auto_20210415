package basicApi;

import org.testng.annotations.*;

/**
 * @author liangjunjun
 * @date 2021-04-15-20:13
 **/
public class TestApi {

    @BeforeGroups
    public void test10(){
        System.out.println("this is @beforeGroups");
    }

    @BeforeSuite
    public void test8(){
        System.out.println("this is @beforeSuite");
    }

    @BeforeClass
    public void test6(){
        System.out.println("this is @beforeClass");
    }

    @BeforeMethod
    public void test4(){
        System.out.println("this is @beforeMethod");
    }

    @BeforeTest
    public void test2(){
        System.out.println("this is @beforeTst");
    }

    @Test
    public void test1(){
        System.out.println("this is @test1");
    }

    @Test
    public void test11(){
        System.out.println("this is @test2");
    }

    @AfterTest
    public void test3(){
        System.out.println("this is @afterTest");
    }

    @AfterMethod
    public void test5(){
        System.out.println("this is @afterMethod");
    }

    @AfterClass
    public void test7(){
        System.out.println("this is @afterClass");
    }

    @AfterSuite
    public void test9(){
        System.out.println("this is @afterSuite");
    }

    @AfterGroups
    public void test12(){
        System.out.println("this is @afterGroups");
    }

}
