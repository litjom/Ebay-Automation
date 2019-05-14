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

public class MessagePageTest extends TestBase1{
	HomePage homepage;
    SigninPage signinpage;
    DealsPage dealspage;
    MessagePage messagepage;
    TestUtil testutil;

public MessagePageTest() {
	super();
	initialization();
	
}
@BeforeMethod
public void setup() {
	initialization();
	this.homepage=new HomePage();
	this.signinpage = new SigninPage();
	this.messagepage = new MessagePage();
	this.testutil = new TestUtil();
	
    homepage =	signinpage.login(prop.getProperty("username"), prop.getProperty("password"));
	
}
@Test(priority= 4, description = "Verifying the message text is present")
public void verifymessage() throws InterruptedException {
String messagetab =	messagepage.verifyMessagesEbay();
Assert.assertEquals(messagetab, "Messages (1)");
}

@AfterMethod
public void teardown() {
	driver.quit();

}
}
