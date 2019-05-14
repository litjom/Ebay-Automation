import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ebay.qa.base.TestBase1;
import com.ebay.qa.pages.DealsPage;
import com.ebay.qa.pages.HomePage;
import com.ebay.qa.pages.MessagePage;
import com.ebay.qa.pages.SigninPage;
import com.ebay.qa.util.TestUtil;

public class HomePageTest extends TestBase1{

	HomePage homepage;
    SigninPage signinpage;
    DealsPage dealspage;
    MessagePage messagepage;
    TestUtil testutil;
	
	public HomePageTest(){
		super();//Super class constructor can be called
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		this.homepage=new HomePage();
		this.signinpage = new SigninPage();
		this.messagepage = new MessagePage();
		this.testutil = new TestUtil();
		
	    homepage =	signinpage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}//this prop thing in base class connecting to config file
	
	@Test(priority =1)
	public void verifyHomePageTitleTest() {
		String homePagetitle = homepage.homePageTitlePage();
		Assert.assertEquals(homePagetitle, "Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay","HomePage title is matched");
	}
	@Test(priority =2)
	public void verifyusernamelabel() {
	boolean correctusername= homepage.verifycurrectusername();
	Assert.assertTrue(correctusername);
	}
	@Test(priority =3)
	public void verifycontactlink() {
	 dealspage  = homepage.clickonDeals();
	}

	/*@Test(priority= 4)
	public void verifymessage() throws InterruptedException {
	String messagetab =	messagepage.verifyMessagesEbay();
	Assert.assertEquals(messagetab, "Messages (1)");
	}*/
	
	@Test(priority =4)
	public void testGetTextFromDropDown() {
		homepage.getTextofDropDown();
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
