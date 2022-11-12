package com.sauceDemo.TestPackage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMPackage.HomePOMClass;
import com.sauceDemo.POMPackage.ProductPOMClass;
import com.sauceDemo.UtilityPackage.SauceScreenshot;

public class TC05_VerifyToBuyTheProduct extends TestBaseClass
{
	@Test(priority = 7)
	public void VerifyBuyProduct() throws Exception
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
		System.out.println("Expected result is --> "+expectedResult);
		String actualresult = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).getText();
		System.out.println("Actual result is   --> "+actualresult);

		Assert.assertEquals(actualresult, expectedResult);
		Pp1.ClickOnContinue();

	}
}
