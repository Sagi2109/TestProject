package mit.com.base;

import java.util.ArrayList;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class resellerFunctionality {
	
	public static WebDriver driver;
	
	 
	public void setup() 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://theconsole.uat.a2development.net/admin/");
		System.out.print(driver.getTitle());
	}
	
	public WebDriver getDriver()
	{
		return driver;
	}

	public void teardown(){
		driver.close();
	}
	
//		driver.findElement(By.xpath("(//input[@name='greencode'])[1]")).sendKeys("tpp-60053");
//		driver.findElement(By.xpath("(//input[@name='greencode'])[1]")).sendKeys(Keys.ENTER);
//		//driver.findElement(By.xpath("//input[@name='submit']")).click();
//		//Thread.sleep(3000);
//		driver.findElement(By.xpath("//a[@href='/admin/execute2/reseller/login-as-reseller?resellerId=59129']")).click();
//		newTab();
//		
//		driver.findElement(By.xpath("//h3[contains(text(),'Products')]")).click();
//		
//		
//	}
//	
	/*public void login()
	{
		
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("fnurani");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("comein22");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
}*/
//	public void newTab()
//	{
//		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
//	      //switch to new tab
//	      driver.switchTo().window(newTb.get(1));
//	      System.out.println("Page title of new tab: " + driver.getTitle());
//	}

}
