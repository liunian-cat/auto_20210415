package com.cathy.log4j;

import org.apache.log4j.PropertyConfigurator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.apache.log4j.Logger;

/**
 * @author liangjunjun
 * @date 2021-05-15-22:01
 **/
public class LoggerControler {
    private static Logger logger = null;
    private static LoggerControler logg = null;

    public static LoggerControler getLogger(Class<?> T){
        if(logger==null){
            //实例化Properties类，处理.properties格式的文件
            Properties properties = new Properties();
            try {
                String path = System.getProperty("user.dir");
                String filePath = path+"/configs/log4j.properties";
                InputStream in = new FileInputStream(filePath);
                properties.load(in);
            }catch (IOException e){
                e.printStackTrace();
            }
            PropertyConfigurator.configure(properties);
            logger = Logger.getLogger(T);
            logg = new LoggerControler();
        }
        return logg;
    }

    public void info(String msg){
        logg.info(msg);
    }

    public void debug(String msg){
        logg.debug(msg);
    }

    public void error(String msg){
        logg.error(msg);
    }

    public void warn(String msg){
        logg.warn(msg);
    }
}
