package mit.com.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import mit.com.base.WrapperFunction;
import mit.com.base.configReader;
import mit.com.base.resellerFunctionality;

public class loginpage extends resellerFunctionality{
	
	WrapperFunction objwrapper = new WrapperFunction();
	configReader config=new configReader();
	
	By username = By.xpath("//input[@name='login']");
	By password = By.xpath("//input[@name='password']");
	By submitbtn = By.xpath("//input[@name='submit']");
	By code1 = By.xpath("(//input[@name='greencode'])[1]");
	
	public void SetEmail(){
		objwrapper.setText(username, config.getUsername());
	}
	public void SetPassword() {
		objwrapper.setText(password, config.getPassword());
	}
	public void Submitbtn() throws Exception {
	    objwrapper.click(submitbtn);
	    Thread.sleep(3000);
	}
		
}
