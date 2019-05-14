package com.ebay.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ebay.qa.base.TestBase1;

public class SigninPage extends TestBase1{
	
	//define page factory or Object repository
	@FindBy(xpath = "//input[@id='userid']")
	WebElement username;
	@FindBy(xpath = "//input[@id='pass']")
	WebElement password;
	@FindBy(xpath="//button[@id='sgnBt']")
	WebElement submitBtn;
	
	
	@FindBy (xpath = "//a[@id='InLineCreateAnAccount']")
	WebElement createanAccount;
	
	@FindBy(xpath ="//img[contains(@id='gh-logo')]")
	WebElement ebaylogo;
	
	public SigninPage() {
		PageFactory.initElements(driver, this);
		//this means current class objects
		
	}
	
	public String valiadateSigninPagetitle() 
	{
		return driver.getTitle();
	}
	public boolean ebayimage()
	{
		return ebaylogo.isDisplayed();
	}
	public HomePage login(String un, String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		submitBtn.click();
		return new HomePage();
	}
	
	
	
	
	

}
