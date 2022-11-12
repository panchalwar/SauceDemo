package com.sauceDemo.TestPackage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01_VerifyLoginFunctionality extends TestBaseClass
{
	@Test(priority = 1, invocationCount = 2)
	public void VerifyLogin() throws IOException
	{
		System.out.println("Apply validation");	
		
		String expectedTitle = "Swag Labs";       	
		String actaulTitle =driver.getTitle();
		
		Assert.assertEquals(actaulTitle, expectedTitle);
	}	
}
