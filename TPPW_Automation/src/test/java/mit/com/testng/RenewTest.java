package mit.com.testng;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import mit.com.pagefactory.loginpage;
import mit.com.base.resellerFunctionality;
import mit.com.pagefactory.RenewPage;;
public class RenewTest extends resellerFunctionality {

	loginpage logpage;
	RenewPage renewpage;
	@BeforeClass
	public void setUp() throws Exception {
		setup();
	}
	
	@Test
	public void RenewDomain() throws Exception {
		
		logpage=new loginpage();
		renewpage=new RenewPage();
		logpage.SetEmail();
		logpage.SetPassword();
		logpage.Submitbtn();
		renewpage.findWorkflow();
		
	}
	
}