package mit.com.testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import mit.com.base.resellerFunctionality;
import mit.com.pagefactory.loginpage;

public class loginpagetest extends resellerFunctionality {

	loginpage logpage;
	
	@BeforeClass
	public void setUp() throws Exception {
		setup();
	}
	
	@Test
	public void LoginDetails() throws Exception {
		
		logpage=new loginpage();
		logpage.SetEmail();
		logpage.SetPassword();
		logpage.Submitbtn();
	}
	
}
