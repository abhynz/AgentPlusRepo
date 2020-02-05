package com.AG.test.automation.testscripts.basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AnotherTest {

	XSSFWorkbook wb;
	XSSFSheet sh;
	XSSFRow row;
	XSSFCell cell;

	public void exceldupcheck() throws Exception{
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Home\\Desktop\\Book1.xlsx");
			wb = new XSSFWorkbook(fis);
			sh = wb.getSheet("Sheet1");
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
