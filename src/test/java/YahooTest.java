import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ebay.qa.base.TestBase1;
import com.ebay.qa.pages.SigninPage;
import com.ebay.qa.pages.Yahoopage;

public class YahooTest extends TestBase1 {
Yahoopage yahoopage;
	
	
	
	
	@BeforeMethod
	public void setup()
	{
		
		initialization();
		this.yahoopage = new Yahoopage();
	}
	
	
	@Test(priority =1,description= "Validating the option 'Politics' is present'")
	public void PoliticsHeaderTest() {
		
	boolean logo= 	yahoopage.validatepoliticsheader();
	Assert.assertTrue(logo);
	}
	@Test(priority =2,description= "Validating the option 'Finance' is present'")
	public void FinanceHeaderTest() {
	boolean logo1	= yahoopage.validatefinanceheader();
	Assert.assertTrue(logo1);
	}
	@Test(priority=3,description= "Validating the option 'News' is present'")
	public void NewHeaderTest() {
	boolean logo2 =	yahoopage.validatenewsheader();
	Assert.assertTrue(logo2);
	}
	
}
