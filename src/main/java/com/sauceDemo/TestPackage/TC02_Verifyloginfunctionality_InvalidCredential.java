package com.sauceDemo.TestPackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauceDemo.POMPackage.InvalidLoginPOMClass;
import com.sauceDemo.UtilityPackage.SauceScreenshot;

public class TC02_Verifyloginfunctionality_InvalidCredential
{
	static WebDriver driver;
	@BeforeMethod
	public void SetUp() throws IOException
	{
//Test Steps
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();	
		System.out.println("Browser is opened");
		
		driver.manage().window().maximize();
		System.out.println("Browser is maximzed");
		
		driver.manage().deleteAllCookies();
		System.out.println("All cookies are deleted");
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("Url is opened");
		System.out.println("Went on LoginPage");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		SauceScreenshot.Screenshots(driver, "loginPage");
		System.out.println("LoginPage Screenshot");
		
//loginActivity
		InvalidLoginPOMClass lp = new InvalidLoginPOMClass(driver);
		
		lp.sendUsername();
		System.out.println("Username is entered");
		
		lp.sendPassword();
		System.out.println("Password is entered");
		
		SauceScreenshot.Screenshots(driver, "LoginPageCredential");
		System.out.println("LoginPageCredential Screenshot");
		
		lp.clickLoginButton();
		System.out.println("Clicked on login Button");
		
		System.out.println("Error message should be popUp");
		
		SauceScreenshot.Screenshots(driver, "ErrorMessage");
		System.out.println("ErrorMessage Screenshot");
		
	}
	
	@Test
	public void Validation() throws IOException
	{
//validation
		System.out.println("Apply validation");		
		String expecterror = "Epic sadface: Username and password do not match any user in this service";  
		
		InvalidLoginPOMClass lp = new InvalidLoginPOMClass(driver);
		
		String actualerror = lp.GetErrorText();
		
		Assert.assertEquals(actualerror, expecterror);
	}
	
	@AfterMethod
	public void Close()
	{
		driver.quit();
		System.out.println("Browser is closed");
	}
}
