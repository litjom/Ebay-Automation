package com.ebay.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ebay.qa.base.TestBase1;

public class DealsPage extends TestBase1{
@FindBy(xpath ="//h1//a[contains(text(),'Deals')]")
WebElement DealsPageLabel;



public DealsPage() {
	PageFactory.initElements(driver, this);
}

public boolean verifyDealsPageLabel() {
boolean label=	DealsPageLabel.isDisplayed();
return label;
//return DealsPageLabel.isDisplayed();
}

//selecting a check box
public void selectingacheckbox(String name) {
	driver.findElement(By.xpath("")).click();
}


}