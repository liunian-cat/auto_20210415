package com.cathy.tools;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author liangjunjun
 * @date 2020-05-20-15:43
 **/
public class DateFormate {
    public static final String ZH_DATE_FORMAT="yyyy-MM-dd HH:mm:ss";
    public static final String ZN_DATE_FORMAT="yyyy��MM��dd�� HH:mm:ss";
    public static final String ZC_DATE_FORMAT="yyyy��MM��dd��";
    public static final String SHORT_DATE_FORMAT = "yy-MM-dd HH:mm";
    public static final String CHECK_LOG_FORMAT = "yyyyMMdd";
    public static final String REPORT_CSV_FORMAT = "yyyyMMdd_HHmmss";
    private static SimpleDateFormat simpleDateFormat;

    public static String format(String type){
        simpleDateFormat=new SimpleDateFormat(type);
        String s=simpleDateFormat.format(new Date());
        System.out.println("��ǰʱ��Ϊ��"+s);
        return s;
    }
    public static String time(){
        long currtime= System.currentTimeMillis()/100;
        String randomNum=String.valueOf(currtime);
        System.out.println("11λ�������Ϊ��"+randomNum);
        return randomNum;
    }
}
