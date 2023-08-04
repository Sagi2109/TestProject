package mit.com.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import mit.com.base.WrapperFunction;
import mit.com.base.configReader;
import mit.com.base.resellerFunctionality;

public class RenewPage extends resellerFunctionality{
	
	WrapperFunction objwrapper = new WrapperFunction();
	configReader config=new configReader();
	
	By viewAllWorkflow = By.xpath("//a[@href='/admin/execute/mainMenu']");
	By domainRenewal90DaysToGo = By.xpath("//a[@href='/admin/execute/workflow/getWorkflows?type=renewal2&step=90+days+to+go']");
	By renealWorkflow = By.xpath("//a[@href='/admin/execute/workflow/getWorkflow?workflow_id=14227281']");
	By executeRenealWorkflow = By.xpath("//a[@href='/admin/execute/workflow/getActionForm?action_id=4&workflow_id=14227281']");
	By executeAction = By.xpath("//input[@value='Execute Action']");
	
	
	
	public void findWorkflow() throws Exception {
		Thread.sleep(5000);
	    objwrapper.click(viewAllWorkflow);
	  //  objwrapper.click(viewAllWorkflow);
	    Thread.sleep(5000);
	    objwrapper.click(domainRenewal90DaysToGo);
	    Thread.sleep(10000);
	    objwrapper.click(renealWorkflow);
	    Thread.sleep(3000);
	    objwrapper.click(executeRenealWorkflow);
	    	    Thread.sleep(3000);
	    	    objwrapper.click(executeAction);
	    	    Thread.sleep(10000);
	    	    
	}
		
}
