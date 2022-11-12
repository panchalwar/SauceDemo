package com.sauceDemo.TestPackage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMPackage.CheckOutPOMClass;
import com.sauceDemo.POMPackage.HomePOMClass;
import com.sauceDemo.POMPackage.ProductPOMClass;
import com.sauceDemo.UtilityPackage.SauceScreenshot;

public class TestSuit extends TestBaseClass
{
	@Test(priority = 1)
	public void Login() throws IOException
	{
		System.out.println("Apply validation");	

		String expectedTitle = "Swag Labs";       	
		String actaulTitle =driver.getTitle();	

		Assert.assertEquals(actaulTitle, expectedTitle);
	}

	@Test(priority = 2)
	public void SelectTheBagProduct() throws IOException, InterruptedException
	{
	HomePOMClass hp = new HomePOMClass(driver);

		hp.SauceBag();
		System.out.println("Bag product is selected");

		SauceScreenshot.Screenshots(driver, "4.SauceBag");
		System.out.println("SauceBag Screenshot");

		System.out.println("Apply validation");

		String expectedResult = "Sauce Labs Backpack"; 
		String actualresult = hp.SauceLabsBackpack();

		Assert.assertEquals(actualresult, expectedResult);
		hp.BackToProduct();

	}

	@Test(priority = 3)
	public void AddTheProductToCart_BagProduct() throws Exception
	{
	HomePOMClass hp = new HomePOMClass(driver);

		hp.SauceBag();
		System.out.println("Bag product is selected");

		SauceScreenshot.Screenshots(driver, "4.SauceBag");
		System.out.println("SauceBag Screenshot");

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
	}

	@Test(priority = 4)
	public void BuyTheProduct() throws Exception
	{
	HomePOMClass hp = new HomePOMClass(driver);

		hp.SauceBag();
		System.out.println("Bag product is selected");

		SauceScreenshot.Screenshots(driver, "4.SauceBag");
		System.out.println("SauceBag Screenshot");

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
	}

	@Test(priority = 5)
	public void Checkout() throws Exception
	{
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
		String actualresult = hp.SauceLabsBackpack();

		Assert.assertEquals(actualresult, expectedResult);
	}

	@Test(priority = 7)
	public void CheckThe_About() throws Exception
	{		
	HomePOMClass hp = new HomePOMClass(driver);

		hp.clickOnMenuButton();
		System.out.println("Clicked on menu Button");

		SauceScreenshot.Screenshots(driver, "MenuPage");
		System.out.println("MenuPage Screenshot");

		hp.clickOnAboutButton();
		System.out.println("Clicked on About Button");

		SauceScreenshot.Screenshots(driver, "About");
		System.out.println("About Screenshot");

		System.out.println("Apply validation");		
		String expectedTitle = "Cross Browser Testing, Selenium Testing, Mobile Testing | Sauce Labs";   //BA/dev		
		String actaulTitle = driver.getTitle();	

		Assert.assertEquals(actaulTitle, expectedTitle);

	}
}
