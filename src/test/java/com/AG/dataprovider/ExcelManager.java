package com.AG.dataprovider;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelManager {

	static FileInputStream fis;
	static XSSFWorkbook wb;
	static XSSFSheet sh;
	static XSSFRow row;
	static XSSFCell cell;

	public ExcelManager() throws Exception{
		FileInputStream fis = new FileInputStream("Files\\Book1.xlsx");
		wb = new XSSFWorkbook(fis);
		
	}
	
	public String ExcelRead(int rowNum,int cell) throws Exception{
		int noOfRows = sh.getPhysicalNumberOfRows()-1;
		System.out.println(noOfRows);
		row = sh.getRow(rowNum);
		String value = row.getCell(cell).getStringCellValue();
		return value;
	}
	
	
	public static ArrayList<Object[]> getDataFromExcel()throws Exception{
		ArrayList<Object[]> dataFeed = new ArrayList<Object[]>();
		FileInputStream fis = new FileInputStream("Files\\Book1.xlsx");
		wb = new XSSFWorkbook(fis);
		sh = wb.getSheet("data_Customers");
		int rowCount= sh.getPhysicalNumberOfRows()+1;
		
		System.out.println("%%%%%%%%%%%$$$$##########@@@@@@@@@@@@@@@@@@@"+rowCount);
		for(int rows=1;rows<=rowCount;rows++){
			String xemail = sh.getRow(rows).getCell(0).getStringCellValue();
			String xfname = sh.getRow(rows).getCell(1).getStringCellValue();
			String xlname = sh.getRow(rows).getCell(2).getStringCellValue();
			Object[] obj = {xemail,xfname,xlname};
			dataFeed.add(obj);
		}
		return dataFeed;
		
	}
}
