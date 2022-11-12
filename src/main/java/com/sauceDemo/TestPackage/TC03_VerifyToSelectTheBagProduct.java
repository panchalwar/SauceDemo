package com.sauceDemo.TestPackage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMPackage.HomePOMClass;
import com.sauceDemo.UtilityPackage.SauceScreenshot;

public class TC03_VerifyToSelectTheBagProduct extends TestBaseClass
{
	@Test(priority = 5)
	public void VerifyToSelectBagProduct() throws IOException, InterruptedException
	{
		HomePOMClass hp =new HomePOMClass(driver);
		
		hp.SauceBag();
		System.out.println("Bag product is selected");
		Thread.sleep(5000);
		
		SauceScreenshot.Screenshots(driver, "4.SauceBag");
		System.out.println("SauceBag Screenshot");
		
		System.out.println("Apply validation");
		
		String expectedResult = "Sauce Labs Backpack"; 
		String actualresult = hp.SauceLabsBackpack();
	
		Assert.assertEquals(actualresult, expectedResult);
		System.out.println("pass");
		hp.BackToProduct();
	}
}
