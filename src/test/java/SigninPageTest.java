import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ebay.qa.base.TestBase1;
import com.ebay.qa.pages.HomePage;
import com.ebay.qa.pages.SigninPage;

public class SigninPageTest extends TestBase1 {

	SigninPage signinPage;
	HomePage homePage;
	public WebDriver driver;
	public SigninPageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setup() {
		initialization();
		//SigninPage signinPage = new SigninPage();
		this.signinPage = new SigninPage();
	}
	
	@Test
	
	public void SigninPageTitleTest() throws InterruptedException {
	String title =	signinPage.valiadateSigninPagetitle();
	Thread.sleep(3000);
	Assert.assertEquals(title, "Sign in or Register | eBay");
	}
	/*@Test
		public void EbaylogoimgTest() {
		boolean logo = signinPage.ebayimage();
		Assert.assertTrue(logo);
		}*/
	@Test
	public void SigninTest() throws InterruptedException {
		Thread.sleep(2000);
   homePage =   signinPage.login(prop.getProperty("username"), prop.getProperty("password"));
      
	}
	
	
	
	
	@AfterMethod
	public void teardown() {
		if (driver != null) 
		{
	        
	        driver.quit();
	        }
		
	}
	
	
	}
