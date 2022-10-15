package com.BankingProject.Utilities;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class getDataFromExel 
{
    public static String getData(int A, int B) throws IOException, InterruptedException
    {
    	Thread.sleep(2000);
        File file = new File("C:\\Users\\hp\\Documents\\exel 1.xlsx");	
        FileInputStream inputstream = new FileInputStream(file);
        @SuppressWarnings("resource")
        XSSFWorkbook wb = new XSSFWorkbook(inputstream);
        XSSFSheet sheet = wb.getSheet("Sheet3");
        XSSFRow row = sheet.getRow(A);
        XSSFCell cell = row.getCell(B);
        String data = cell.getStringCellValue();
        return data;
        
        
        
       
    }
}
