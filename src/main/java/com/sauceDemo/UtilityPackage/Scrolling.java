package com.sauceDemo.UtilityPackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Scrolling 
{
	WebDriver driver;
	JavascriptExecutor js;
	
	public void MinorScroll()
	{
		js.executeScript("window.scrollBy(0,100)");
	}
	
	public void MiniScroll()
	{
		js.executeScript("window.scrollBy(0,200)");
	}
	
	public void SmallScroll()
	{
		js.executeScript("window.scrollBy(0,300)");
	}
	
	public void MiddleScroll()
	{
		js.executeScript("window.scrollBy(0,400)");
	}
	
	public void MajorScroll()
	{
		js.executeScript("window.scrollBy(0,500)");
	}
	
	public void BigScroll()
	{
		js.executeScript("window.scrollBy(0,600)");
	}
	
	public void BiggerScroll()
	{
		js.executeScript("window.scrollBy(0,700)");
	}
	
	public void BiggestScroll()
	{
		js.executeScript("window.scrollBy(0,800)");
	}
	
	public void GreaterScroll()
	{
		js.executeScript("window.scrollBy(0,900)");
	}
	
	public void GreatestScroll()
	{
		js.executeScript("window.scrollBy(0,1000)");
	}
	
	
	public Scrolling(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		js = (JavascriptExecutor)driver;
	}
}
