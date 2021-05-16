package com.cathy.tools;

import com.sun.jna.platform.win32.WinBase;
import org.jboss.netty.util.internal.ReusableIterator;
import org.testng.annotations.Test;

import java.util.Random;

/**
 * @author liangjunjun
 * @date 2021-05-16-10:43
 **/
public class RandomNum {

    //生成n位数的一个随机数
    public static String getNumRandom(int length){
        String num = "";
        //随机生成[0,1)期间的随机数
        num = String.valueOf((long) (Math.random()*Math.pow(10,length)));
        return num;
    }

    //min-max之间的随机数
    public static int getNumRandom(int min,int max){
        int num = 0;
        Random random = new Random();
        num = random.nextInt(max-min+1)+min;
        return num;
    }

    public static String getStringRandom(int length){
        String val = "";
        Random random = new Random();
        for (int i=0;i<length;i++){
            String charNum = random.nextInt(2)%2 == 0 ? "char" : "num";
            if(charNum.equals("char")){
                int tem = random.nextInt(2)%2 == 0 ? 65 : 97;
                char a = (char)(random.nextInt(26)+tem);
                val = val+a;
            }else if(charNum.equals("num")){
                int tem = random.nextInt(10);
                val = val+tem;
            }
        }
        return val;
    }

}
