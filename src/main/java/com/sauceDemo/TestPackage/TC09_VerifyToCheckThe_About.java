package com.sauceDemo.TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMPackage.HomePOMClass;
import com.sauceDemo.UtilityPackage.SauceScreenshot;

public class TC09_VerifyToCheckThe_About extends TestBaseClass
{
	@Test(priority = 4)
	public void VerifyAbout() throws Exception
	{		
		HomePOMClass hp = new HomePOMClass(driver);

		hp.clickOnMenuButton();
		System.out.println("Clicked on menu Button");
		
		SauceScreenshot.Screenshots(driver, "MenuPage");
		System.out.println("MenuPage Screenshot");
		
		hp.clickOnAboutButton();
		System.out.println("Clicked on logOut Button");
		
		SauceScreenshot.Screenshots(driver, "About");
		System.out.println("About Screenshot");
		
//VALLIDATION
		System.out.println("Apply validation");		
		String expectedTitle = "Cross Browser Testing, Selenium Testing, Mobile Testing | Sauce Labs"; 	
		String actaulTitle   = driver.getTitle();	
		
		Assert.assertEquals(actaulTitle, expectedTitle);
		
		driver.navigate().back();			
	}
}
