import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ebay.qa.base.TestBase1;
import com.ebay.qa.pages.DealsPage;
import com.ebay.qa.pages.HomePage;
import com.ebay.qa.pages.SigninPage;

public class DealsPageTest extends TestBase1 {

	HomePage homepage;
	SigninPage signinpage;
	DealsPage dealspage;
	public DealsPageTest(){
		super();
	}
	@BeforeMethod
	public void setup() {
		initialization();
		this.signinpage = new SigninPage();
		this.homepage = new HomePage();
		this.dealspage = new DealsPage();
	homepage = signinpage.login(prop.getProperty("username"), prop.getProperty("password"));
	homepage.clickonDeals();
	}
	
	@Test
	public void dealaLabelTest() {
		
		boolean label =dealspage.verifyDealsPageLabel();
		Assert.assertTrue(label);
	}
	/*@Test
	public void multiplecontactTest() {
		dealspage.selectingacheckbox("");
		dealspage.selectingacheckbox("");
	}*/
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
}
