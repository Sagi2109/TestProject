package mit.com.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import mit.com.base.WrapperFunction;
import mit.com.base.configReader;
import mit.com.base.resellerFunctionality;

public class AdvanceReferancePage  extends resellerFunctionality{
	
	WrapperFunction objwrapper = new WrapperFunction();
	configReader reader = new configReader();
	
	By code1 = By.xpath("(//input[@name='greencode'])[1]");
	By submitbtn = By.xpath("(//input[@name='submit'])[2]");
	By resellerId = By.xpath("//a[@href='/admin/execute2/reseller/login-as-reseller?resellerId=59129']");
	By products = By.xpath("//h3[contains(text(), 'Products')]");
	By editCreditcard = By.xpath("//a[contains(text(),'edit')]");
	By editCreditcardFirstOption = By.xpath("(//input[@name='defaultBillingAccountId'])[1]");
	By editCreditcardUpdate = By.xpath("//input[@name='updateDefaultBillingAccount']");
	
	
	
	public void CodePage() {
		objwrapper.setText(code1, "TPP-60053");
		//objwrapper.setText(code1, ""+Keys.ENTER);
		objwrapper.click(submitbtn);
				
	}
	public void resellerId() {
		objwrapper.click(resellerId);
		objwrapper.newTab();
		objwrapper.click(products);
		objwrapper.click(editCreditcard);
		objwrapper.click(editCreditcardFirstOption);
		objwrapper.click(editCreditcardUpdate);
	}
}
