package com.cathy.tools;

import org.testng.annotations.Test;

import java.util.Random;

/**
 * @author liangjunjun
 * @date 2021-05-16-10:53
 **/
public class RandomNumTest {

    @Test
    public void getNumRandomTest(){
        String num = (RandomNum.getNumRandom(10));
        System.out.println("num:"+num);
    }

    @Test
    public void getNumRandomTest1(){
        int a = RandomNum.getNumRandom(3,5);
        System.out.println("num:"+a);
    }

    @Test
    public void getStringRandomTest(){
        String val = RandomNum.getStringRandom(10);
        System.out.println("val:"+val);
    }
}
