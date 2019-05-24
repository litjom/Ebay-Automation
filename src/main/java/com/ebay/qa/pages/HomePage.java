package com.ebay.qa.pages;

import java.lang.reflect.Array;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ebay.qa.base.TestBase1;

public class HomePage extends TestBase1 {
	@FindBy(xpath = "//b[contains(text(),'littin')]")
	WebElement userNameLabel;

	@FindBy(xpath = "//a[@class='gh-p'][contains(text(),'Daily Deals')]")
	WebElement dealsLink;

	@FindBy(xpath = "//a[contains(test(),'Gift Cards')]")
	WebElement giftCardLink;

	@FindBy(xpath = "//a[@class='gh-p'][conatins(text(),'Help & Contact')]")
	WebElement helpAndContactLink;

	@FindBy(xpath = "//select[@id='gh-cat']")
	WebElement dropDownBtn;

	@FindBy(xpath = "//a[@class='gh-eb-li-a'][contains(text(),'My eBay')]")
	WebElement myEbayMessageBtn;

	@FindBy(xpath = "//a[contains(text(),'Messages')]")
	WebElement Message;

	public HomePage() {
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
		return new DealsPage();// return new contacts page object
	}

	public GiftCardPage clickonGiftCardLin() {
		giftCardLink.click();
		return new GiftCardPage();
	}

	public HelpandContactPage HelpandContactPage() {
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
		// int count = 0;
//String [] exp = {"All Categories","Antiques","Art","Baby","Books","Business & Industrial"};
		Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='gh-cat']")));
		// Get all options
		List<WebElement> dd = dropdown.getOptions();
		System.out.println(dd.size());
		for (int i = 0; i < dd.size(); i++) {
			System.out.println(dd.get(i).getText());
			// trying to verify against the values above
			/*
			 * if(count == exp.length) { count++; System.out.println("Match"); } else {
			 * System.out.println("We have a problem"); }
			 */
		}
	}

	public void verifydropdownresults() {
		Select dropdown1 = new Select(driver.findElement(By.xpath("//select[@id='gh-cat']")));
		// count = 0;
		String[] exp = { "Alll Categories", "Antiques", "Art", "Baby", "Boooks", "Business & Industrial",
				"Cameras & Photo", "Cell Phones & Accessories", "Clothing, Shoes & Accessories", "Coins & Paper Money",
				"Collectibles", "Computers/Tablets & Networking", "Consumer Electronics", "Crafts", "Dolls & Bears",
				"DVDs & Movies", "eBay Motors", "Entertainment Memorabilia", "Gift Cards & Coupons", "Health & Beauty",
				"Home & Garden", "Jewelry & Watches", "Music", "Musical Instruments & Gear", "Pet Supplies",
				"Pottery & Glass", "Real Estate", "Specialty Services", "Sporting Goods",
				"Sports Mem, Cards & Fan Shop", "Stamps", "Tickets & Experiences", "Toys & Hobbies", "Travel",
				"Video Games & Consoles", "Everything Else" };
		List<WebElement> dd = dropdown1.getOptions();
		// String arr[] = dropdown1.getOptions();
		int i = 0;
		for (WebElement we : dd) {
			
			
			//for (int i = 0; i < exp.length; i++) {
				if (we.getText().equals(exp[i])) {
					//count++;

					
					
						System.out.println("Matched :: " + we.getText());
						
						
					}
				else {
					System.out.println("Not Matched  :: " + we.getText());
				}
			i++;	
		}
				
			
		//}
		}
	

	public void openNewEbay() throws InterruptedException {
		// to click on open link on new tab
		Actions rightclick = new Actions(driver);
		WebElement elementlocator = driver
				.findElement(By.xpath("//li[@class='hl-cat-nav__js-tab']//a[contains(text(),'Electronics')]"));
		Thread.sleep(2000);
		rightclick.contextClick(elementlocator).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
		;

	}

}
