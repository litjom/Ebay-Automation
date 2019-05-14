package com.ebay.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ebay.qa.base.TestBase1;

public class HomePage extends TestBase1
{
@FindBy(xpath="//b[contains(text(),'littin')]")
WebElement userNameLabel;

@FindBy(xpath = "//a[@class='gh-p'][contains(text(),'Daily Deals')]")
WebElement dealsLink;

@FindBy(xpath = "//a[contains(test(),'Gift Cards')]")
WebElement giftCardLink;

@FindBy(xpath="//a[@class='gh-p'][conatins(text(),'Help & Contact')]")
WebElement helpAndContactLink;

@FindBy(xpath ="//select[@id='gh-cat']")
WebElement dropDownBtn;

@FindBy(xpath ="//a[@class='gh-eb-li-a'][contains(text(),'My eBay')]")
WebElement myEbayMessageBtn;

@FindBy(xpath="//a[contains(text(),'Messages')]")
WebElement Message;




public HomePage(){
	PageFactory.initElements(driver, this);
}
public String homePageTitlePage() {
	return driver.getTitle();
}

public boolean verifycurrectusername() {
	return userNameLabel.isDisplayed();
	
}


public DealsPage clickonDeals() {
	dealsLink.click();
	return new DealsPage();//return new contacts page object
}
public GiftCardPage clickonGiftCardLin() {
	giftCardLink.click();
	return new GiftCardPage();
}
public HelpandContactPage HelpandContactPage () {
	helpAndContactLink.click();
	return new HelpandContactPage();
}
public MessagePage messagePage() {
	Message.click();
	return new MessagePage();
}


//driver.findElement(By.linkText("My eBay"));


public void clickonDropdownBtn() {
	dropDownBtn.click();
}

public void getTextofDropDown() {
	Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='gh-cat']")));
	//Get all options
	List <WebElement> dd = dropdown.getOptions();
	System.out.println(dd.size());
	for (int i=0;i<dd.size();i++) {
		System.out.println(dd.get(i).getText());
	}
}




}