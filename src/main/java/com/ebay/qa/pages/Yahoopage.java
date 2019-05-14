package com.ebay.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ebay.qa.base.TestBase1;

public class Yahoopage extends TestBase1
//Yahoo locators
{
@FindBy(xpath = "//a[contains(text(),'News')]")
WebElement newsHeader;

@FindBy(xpath = "//a[contains(text(),'Finance')]")
WebElement financeHeader;

@FindBy(xpath = "//a[contains(text(),'Politics')]")
WebElement politicsHeader;


public Yahoopage(){
	PageFactory.initElements(driver, this);
}

//yahoo methods
public boolean validatenewsheader() {
	return newsHeader.isDisplayed();
}
public boolean validatefinanceheader() {
	return financeHeader.isDisplayed();
}
public boolean validatepoliticsheader() {
	return politicsHeader.isDisplayed();
}

}
