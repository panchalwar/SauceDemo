package com.sauceDemo.TestPackage;

import org.testng.annotations.Test;

import com.sauceDemo.POMPackage.HomePOMClass;

public class TC08_VerifyToApplyTheFilter extends TestBaseClass
{
	@Test(priority = 3)
	public void VerifyFilters() throws Exception
	{
		HomePOMClass hp = new HomePOMClass(driver);
		
		hp.clickFilterDropDown1();
		System.out.println("A to Z is selected");
		
		hp.clickFilterDropDown2();
		System.out.println("Z to A is selected");
		
		hp.clickFilterDropDown3();
		System.out.println("Low to High is selected");
		
		hp.clickFilterDropDown4();
		System.out.println("High to Low is selected");
	}
	
}
