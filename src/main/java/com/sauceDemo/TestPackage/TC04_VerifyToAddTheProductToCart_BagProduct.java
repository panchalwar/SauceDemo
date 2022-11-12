package com.sauceDemo.TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMPackage.HomePOMClass;
import com.sauceDemo.POMPackage.ProductPOMClass;
import com.sauceDemo.UtilityPackage.SauceScreenshot;

public class TC04_VerifyToAddTheProductToCart_BagProduct extends TestBaseClass
{
	@Test(priority = 6)
	public void VerifyToAddToCart_BagProduct() throws Exception
	{
//Bag select	
		HomePOMClass hp = new HomePOMClass(driver);

		hp.SauceBag();
		System.out.println("Bag product is selected");
						
		SauceScreenshot.Screenshots(driver, "4.SauceBag");
		System.out.println("SauceBag Screenshot");
				
//Bag Add To Cart
		ProductPOMClass Pp1 = new ProductPOMClass(driver);
		
		Pp1.selectSauceBag();
		System.out.println("Sauce Bag is Added to Cart");
		
		SauceScreenshot.Screenshots(driver, "5.SauceBagToCart");
		System.out.println("SauceBag Added to cart Screenshot");
						
		hp.addtoCartButton();
		System.out.println("Sauce Bag available in Added to Cart");
				
		SauceScreenshot.Screenshots(driver, "6.SauceBagPressent");
		System.out.println("SauceBag is present in cart Screenshot");
				
		System.out.println("Apply validation");		
		String expectedResult = "Sauce Labs Backpack"; 
		String actualresult = hp.SauceLabsBackpack();

		Assert.assertEquals(actualresult, expectedResult);
		Pp1.ClickOnContinue();
		
	}
}
