package com.sauceDemo.POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePOMClass 
{
	WebDriver driver;
	Select s;

//MENUBUTON
	@FindBy(xpath ="//button[text()='Open Menu']")
	private WebElement menuButton;

	public void clickOnMenuButton()
	{
		menuButton.click();
	}

//ALL ITEM
	@FindBy(xpath ="//a[@id='inventory_sidebar_link']")
	private WebElement allitemButton;

	public void clickOnAllitemButton()
	{
		allitemButton.click();
	}

//ABOUT
	@FindBy(xpath ="//a[@id='about_sidebar_link']")
	private WebElement aboutButton;

	public void clickOnAboutButton()
	{
		aboutButton.click();
	}

//LOGOUTBTN
	@FindBy(xpath ="//a[@id='logout_sidebar_link']")
	private WebElement logOutButton;

	public void clickOnLogOutButton()
	{
		logOutButton.click();	
	}		

//RESET APP STATE		
	@FindBy(xpath ="//a[@id='logout_sidebar_link']")
	private WebElement resetappButton;

	public void clickOnResetAppButton()
	{
		resetappButton.click();	
	}	

//ADD TO CART		
	@FindBy(xpath ="//a[@class='shopping_cart_link']")
	private WebElement addToCart;

	public void addtoCartButton()
	{
		addToCart.click();	
	}

//GET TEXT		
	@FindBy(xpath ="//a[@class='shopping_cart_link']")
	private WebElement addToCartLink;

	public String getTextOfAddToCartButton()
	{
		String actualCount= addToCartLink.getText();	
		return actualCount;
	}

//ALL PRODUCT SELECT
//	@FindBy(xpath ="//button[text()='Add to cart']")
//	private List<WebElement> allProducts;
//
//	public void clickAllProducts()
//	{
//		//assignment
//		//use for each loop
//
//		Object i;
//		for(WebElement i:allProducts)
//		{
//			allProducts.get(i).click();
//		}		
//	}

//SAUCE-BAG

	@FindBy(xpath ="//div[text()='Sauce Labs Backpack']")
	WebElement SBag;

	public void SauceBag()
	{
		SBag.click();
	}

//BIKELIGHT

	@FindBy(xpath ="//div[text()='Sauce Labs Bike Light']")
	WebElement SBikeLihgt;

	public void BikeLihgt()
	{
		SBikeLihgt.click();
	}

//BLACK-TSHIRT

	@FindBy(xpath ="//div[text()='Sauce Labs Bolt T-Shirt']")
	WebElement SBlackTshirt;

	public void BlackTshirt()
	{
		SBlackTshirt.click();
	}

//JACKET

	@FindBy(xpath ="//div[text()='Sauce Labs Fleece Jacket']")
	WebElement SJacket;

	public void Jacket()
	{
		SJacket.click();
	}

//ONESIE

	@FindBy(xpath ="//div[text()='Sauce Labs Onesie']")
	WebElement SOnesie;

	public void Onesie()
	{
		SOnesie.click();
	}

//RED-TSHIRT

	@FindBy(xpath ="//div[text()='Test.allTheThings() T-Shirt (Red)']")
	WebElement SRedTshirt;

	public void RedTshirt()
	{
		SRedTshirt.click();
	}

//filter dropdown
	@FindBy(xpath ="//select[@class='product_sort_container']")
	private WebElement filterDropDown;

	public void clickFilterDropDown1()
	{
		filterDropDown.click();
		s.selectByValue("az");    	
	}

	public void clickFilterDropDown2()
	{
		filterDropDown.click();
		s.selectByValue("za");    	
	}

	public void clickFilterDropDown3()
	{
		filterDropDown.click();
		s.selectByValue("lohi");    	
	}

	public void clickFilterDropDown4()
	{
		filterDropDown.click();
		s.selectByValue("hilo");    	
	}
	
	
//TEXT
	@FindBy(xpath ="//div[text()='Sauce Labs Backpack']")
	private WebElement bagpack;

	public String SauceLabsBackpack()
	{
		return bagpack.getText();
	}
	
//BACK	
	@FindBy(xpath ="//button[text()='Back to products']")
	private WebElement back;

	public void BackToProduct()
	{
		 back.click();
	}
	
	
	
	

//CONSTRUCTOR
	public HomePOMClass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
		s = new Select(filterDropDown);

	}



}
