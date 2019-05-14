package com.ebay.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ebay.qa.base.TestBase1;
import com.relevantcodes.extentreports.model.Test;

public class MessagePage extends TestBase1 {
	@FindBy(xpath="//a[contains(text(),'Messages')]")
	WebElement Message;

	@FindBy(xpath="//a[@id='header-panel_1']")
	WebElement Messageinside;
	@FindBy(xpath ="//a[@class='gh-eb-li-a'][contains(text(),'My eBay')]")
	WebElement myEbayMessageBtn;
	
	public MessagePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Methods
	public String verifyMessagesEbay() throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.moveToElement(myEbayMessageBtn).build().perform();
		Thread.sleep(1000);
		actions.moveToElement(Message).build().perform();
		Message.click();
		actions.moveToElement(Messageinside).build().perform();
	return	Messageinside.getText();
}
	}
