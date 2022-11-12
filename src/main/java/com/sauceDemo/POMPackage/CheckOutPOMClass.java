package com.sauceDemo.POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPOMClass 
{
	WebDriver driver;
	
//CHECK-OUT
	@FindBy(xpath ="//button[text()='Checkout']")
	private WebElement checkout;
	
	public void CheckOutButton()
	{
		checkout.click();
	}
	
//FIRST-NAME	
	@FindBy(xpath ="//input[@id='first-name']")
	private WebElement firstName;
	
	public void FirstNameBox()
	{
		firstName.sendKeys("SAUCE");
	}

//LAST-NAME
	@FindBy(xpath ="//input[@id='last-name']")
	private WebElement lastName;
	
	public void LastNameBox()
	{
		lastName.sendKeys("DEMO");
	}
	
//PIN-CODE
	@FindBy(xpath ="//input[@id='postal-code']")
	private WebElement pincode;
	
	public void PinCodeBox()
	{
		pincode.sendKeys("1234");
	}
	
//CONTINUE
	@FindBy(xpath ="//input[@id='continue']")
	private WebElement Continue;
	
	public void ContinueButton()
	{
		Continue.click();
	}
	
//CONSTRUCTOR	
	public CheckOutPOMClass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	
}
