package com.sauceDemo.TestPackage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMPackage.CheckOutPOMClass;
import com.sauceDemo.POMPackage.HomePOMClass;
import com.sauceDemo.POMPackage.ProductPOMClass;
import com.sauceDemo.UtilityPackage.SauceScreenshot;

public class TC06_VerifyToProceedForCheckout extends TestBaseClass
{
	@Test(priority = 8)
	public void VerifyCheckout() throws Exception
	{
//Bag Add To Cart
		ProductPOMClass Pp1 = new ProductPOMClass(driver);
		
		Pp1.selectSauceBag();
		System.out.println("Sauce Bag is Added to Cart");

		SauceScreenshot.Screenshots(driver, "4.SauceBagToCart");
		System.out.println("SauceBag Added to cart Screenshot");

		HomePOMClass hp = new HomePOMClass(driver);

		hp.addtoCartButton();
		System.out.println("Sauce Bag available in Added to Cart");

		SauceScreenshot.Screenshots(driver, "5.SauceBagPressent");
		System.out.println("SauceBag is present in cart Screenshot");

//CHECKOUT
		CheckOutPOMClass Cp = new CheckOutPOMClass(driver);
		
		Cp.CheckOutButton();
		System.out.println("We are 0n CheckOut Page");

		SauceScreenshot.Screenshots(driver, "7.CheckOut");
		System.out.println("CheckOut Screenshot");

		Cp.FirstNameBox();
		System.out.println("First name is enter");

		Cp.LastNameBox();
		System.out.println("Last name is enter");

		Cp.PinCodeBox();
		System.out.println("Pin Code is enter");

		SauceScreenshot.Screenshots(driver, "8.CheckOut Details");
		System.out.println("CheckOut Details Screenshot");

		Cp.ContinueButton();
		System.out.println("Click on Continue button");

		System.out.println("We are on Billing Page");

		SauceScreenshot.Screenshots(driver, "9.Billing Page");
		System.out.println("Billing Page Screenshot");

		System.out.println("Apply validation");		
		String expectedResult = "Sauce Labs Backpack"; 
		String actualresult = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).getText();

		Assert.assertEquals(actualresult, expectedResult);
		Pp1.ClickOnCancel();
	}
}
