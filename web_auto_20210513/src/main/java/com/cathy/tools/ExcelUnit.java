package com.cathy.tools;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author liangjunjun
 * @date 2021-05-16-12:25
 **/
public class ExcelUnit {

    public static Workbook getWorkbook(String filePath){
        Workbook wb = null;
        try {
            if(filePath.endsWith(".xls")){
                File file = new File(filePath);
                InputStream is = new FileInputStream(file);
                wb = new HSSFWorkbook(is);
            }else if(filePath.endsWith(".xlsx")){
                wb = new XSSFWorkbook(filePath);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return wb;
    }
}
