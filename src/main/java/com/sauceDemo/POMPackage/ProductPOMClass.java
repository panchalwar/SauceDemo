package com.sauceDemo.POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPOMClass 
{
	WebDriver driver;
	
//BAG
	@FindBy(xpath ="//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement Bag;
	
	public void selectSauceBag()
	{
		Bag.click();
	}
	

//BIKELIGHT
	@FindBy(xpath ="//button[@id='add-to-cart-sauce-labs-bike-light']")
	private WebElement BikeLihgt;
	
	public void selectBikeLihgt()
	{
		BikeLihgt.click();
	}
	
	
//BLACK-TSHIRT
	@FindBy(xpath ="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
	private WebElement BlackTshirt;
	
	public void selectBlackTshirt()
	{
		BlackTshirt.click();
	}
	
	
//JACKET
	@FindBy(xpath ="//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
	private WebElement Jacket;
	
	public void selectJacket()
	{
		Jacket.click();
	}
	
	
//ONESIE
	@FindBy(xpath ="//button[@id='add-to-cart-sauce-labs-onesie']")
	private WebElement Onesie;
	
	public void selectOnesie()
	{
		Onesie.click();
	}
	
	
//RED-TSHIRT
	@FindBy(xpath ="//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
	private WebElement RedTshirt;
	
	public void selectRedTshirt()
	{
		RedTshirt.click();
	}
	
//CONTINUE
		@FindBy(xpath ="//button[text()='Continue Shopping']")
		private WebElement Conti;
		
		public void ClickOnContinue()
		{
			Conti.click();
		}
	
//CANCEL
		@FindBy(xpath ="//button[text()='Cancel']")
		private WebElement cancel;
		
		public void ClickOnCancel()
		{
			cancel.click();
		}
	
	
//CONSTRUCTOR		
	public ProductPOMClass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
}
