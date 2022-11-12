package com.sauceDemo.UtilityPackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class SauceScreenshot 
{
	public static void Screenshots(WebDriver driver,String name) throws IOException 
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/"+name+".jpg");
		FileHandler.copy(source, dest);
		System.out.println("Screenshot is taken and stored into the required folder");
	}
}
