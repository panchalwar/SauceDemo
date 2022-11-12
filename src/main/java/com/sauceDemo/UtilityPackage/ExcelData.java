package com.sauceDemo.UtilityPackage;

//import java.io.FileInputStream;
//import java.io.IOException;
//
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.PageFactory;
//
//public class ExcelData 
//{
//	WebDriver driver;
//	FileInputStream file;
//	XSSFWorkbook book;
//	String Address;
//	String data;
//	
//	public void Address()
//	{
//		Address = "E:\\SELENIUM\\Raw Data.xlsx";
//		data = book.getSheet("Data").getRow(1).getCell(1).getStringCellValue();
//	}
//	
//	public ExcelData(WebDriver driver) throws IOException
//	{
//		this.driver = driver;
//		PageFactory.initElements(driver, this);
//		file = new FileInputStream(Address);
//		book = new XSSFWorkbook(file);
//	}
//
//}
