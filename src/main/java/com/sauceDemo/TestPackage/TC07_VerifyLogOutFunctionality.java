package com.sauceDemo.TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC07_VerifyLogOutFunctionality extends TestBaseClass
{	
	@Test(priority = 2, invocationCount = 2)
	public void VerifyLogout() throws Exception
	{	
		System.out.println("Apply validation");	
		
		String expectedTitle = "Swag Labs"; 	
		String actaulTitle =driver.getTitle();	
		
		Assert.assertEquals(actaulTitle, expectedTitle);
	}
}
