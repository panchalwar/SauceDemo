package com.sauceDemo.POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOMClass 
{
	WebDriver driver;
	Actions act;

//USERNAME
	@FindBy(xpath ="//input[@id='user-name']")
	private WebElement userName;

	public void sendUsername()
	{
		boolean resDis = userName.isDisplayed();
		System.out.println(resDis);

		if(resDis == true) 
		{
			System.out.println("present");
			userName.sendKeys("standard_user");
			System.out.println("Username TextBox IsDisplay TestCase is PASS");
		}
		else
		{
			System.out.println("Absent");
			System.out.println("Username TextBox IsDisplay TestCase is FAIL");
		}
	}

//PASSWORD		
	@FindBy(xpath ="//input[@id='password']")
	private WebElement password;

	public void sendPassword()
	{
		password.sendKeys("secret_sauce");
	}

//LOGIN 		
	@FindBy(xpath ="//input[@id='login-button']")
	private WebElement loginButton;

	//click method-webElement interface		
	public void clickLoginButton()
	{
		loginButton.click();
	}
	//---------OR-----------------

	//MOUSE	CLICK	
	//click method-mouse action
	//	public void clickLoginButton()
	//	{
	//		act.click(loginButton).perform();
	//	}


	public LoginPagePOMClass(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		act = new Actions(driver);
	}
}
