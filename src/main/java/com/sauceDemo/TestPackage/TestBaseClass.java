package com.sauceDemo.TestPackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.log4testng.Logger;

import com.sauceDemo.POMPackage.HomePOMClass;
import com.sauceDemo.POMPackage.LoginPagePOMClass;
import com.sauceDemo.UtilityPackage.SauceScreenshot;

public class TestBaseClass 
{
	WebDriver driver;

	private Class MavenSauceDemo;
	
	Logger log = Logger.getLogger(MavenSauceDemo);		

	@Parameters("browserName")
	@BeforeClass
	public void SetUp(String browserName) throws IOException, InterruptedException
	{
		PropertyConfigurator.configure("log4j.properties");

		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./DriverFile/chromedriver.exe");

			driver = new ChromeDriver();	
			log.info("Chrome Browser is opened");
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./DriverFile/geckodriver.exe");

			driver = new FirefoxDriver();	
			log.info("Firefox Browser is opened");	
		}
		else if(browserName.equals("explorer"))
		{
			System.setProperty("webdriver.explorer.driver","./DriverFile/explorerdriver.exe");

			driver = new InternetExplorerDriver();	
			log.info("Internet-Explorer Browser is opened");
		}
		else
		{
			log.info("Browser not identify");
		}
		
		driver.manage().window().maximize();
		log.info("Browser is maximzed");

		driver.manage().deleteAllCookies();
		log.info("All cookies are deleted");

		driver.get("https://www.saucedemo.com/");

		log.info("Url is opened");
		log.info("Went on LoginPage");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		SauceScreenshot.Screenshots(driver,"1.LoginPage");
		log.info("LoginPage Screenshot");
	}

	

	@BeforeMethod
	public void LoginSetUp() throws IOException
	{
		PropertyConfigurator.configure("log4j.properties");

		LoginPagePOMClass lp = new LoginPagePOMClass(driver);

		lp.sendUsername();
		log.info("Username is entered");

		lp.sendPassword();
		log.info("Password is entered");

		SauceScreenshot.Screenshots(driver, "2.LoginPageCredential");
		log.info("LoginPageCredential Screenshot");

		lp.clickLoginButton();
		log.info("Clicked on login Button");

		log.info("Went on HomePage");

		SauceScreenshot.Screenshots(driver, "3.HomePage");
		log.info("HomePage Screenshot");
	}

	@AfterMethod
	public void LogoutSetUp() throws Exception
	{
		PropertyConfigurator.configure("log4j.properties");

		HomePOMClass hp = new HomePOMClass(driver);

		hp.clickOnMenuButton();
		log.info("Clicked on menu Button");

		SauceScreenshot.Screenshots(driver,"4.MenuPage");
		log.info("MenuPage Screenshot");

		hp.clickOnLogOutButton();
		log.info("Clicked on logOut Button");

		SauceScreenshot.Screenshots(driver,"5.Logout");
		log.info("LogOut Screenshot");

		log.info("Went on LoginPage");

		SauceScreenshot.Screenshots(driver,"6.LoginPage");
		log.info("LoginPage Screenshot");
	}

	@AfterClass
	public void TearDown()
	{
		PropertyConfigurator.configure("log4j.properties");

		driver.close();
		log.info("Browser is Closed");
		log.info("End Of The Program");
	}	
}
