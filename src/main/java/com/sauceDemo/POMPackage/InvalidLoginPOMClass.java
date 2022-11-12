package com.sauceDemo.POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvalidLoginPOMClass 
{
	WebDriver driver;
				
//USERNAME		
	@FindBy(xpath ="//input[@id='user-name']")
	WebElement userName;
			
	public void sendUsername()
	{
		userName.sendKeys("standard_users");	
	}
			
//PASSWORD		
	@FindBy(xpath ="//input[@id='password']")
	WebElement password;
	
	public void sendPassword()
	{
		password.sendKeys("secret_sauces");	
	}
			
//LOGIN 		
	@FindBy(xpath ="//input[@id='login-button']")
	WebElement loginButton;
	
	public void clickLoginButton()
	{
		loginButton.click();	
	}
			
//ERROR			
	@FindBy(xpath ="//h3[text()='Epic sadface: Username and password do not match any user in this service']")
	private WebElement error;
	
	public String GetErrorText()
	{
		return error.getText();
	}
	
//Const declared
	public InvalidLoginPOMClass(WebDriver driver)
	{
		this.driver = driver;	
		PageFactory.initElements(driver,this);
	}

}
