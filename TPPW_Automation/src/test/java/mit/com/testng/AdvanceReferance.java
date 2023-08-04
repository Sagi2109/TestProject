package mit.com.testng;

import org.testng.annotations.Test;

import mit.com.base.resellerFunctionality;
import mit.com.pagefactory.AdvanceReferancePage;

public class AdvanceReferance extends resellerFunctionality {
	
	AdvanceReferancePage advrefpage;
	
	@Test
	public void advanceReferanceTest() {
		advrefpage = new AdvanceReferancePage();
		advrefpage.CodePage();
		advrefpage.resellerId();
	}
}
