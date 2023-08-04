package mit.com.base;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WrapperFunction extends resellerFunctionality
{

	resellerFunctionality functionality = new resellerFunctionality();
	
	public void waitForElementPresence(By locator, int waitInSeconds) 
	{
		try 
		{
			WebDriverWait wait = (WebDriverWait) new WebDriverWait(functionality.getDriver(), waitInSeconds).ignoring(StaleElementReferenceException.class);
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		} 
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
	} 
	
	public void waitForElementDisplayed(By locator, int waitInSeconds) 
	{
		try 
		{
			WebDriverWait wait = (WebDriverWait) new WebDriverWait(functionality.getDriver(), waitInSeconds).ignoring(StaleElementReferenceException.class);
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		} 
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
	} 
	
	
	public boolean click(By locator) 
	{
		waitForElementPresence(locator, 10);
		WebElement webElement = functionality.getDriver().findElement(locator);
		try
		{
			JavascriptExecutor executor = (JavascriptExecutor)functionality.getDriver();
			executor.executeScript("arguments[0].click();", webElement);
			return true;
		} 
		catch (Exception exception)
		{
			exception.printStackTrace();
			return false;
		}
	}
	
	public boolean doubleClick(By locator)
	{
		waitForElementPresence(locator, 10);
		WebElement webElement = functionality.getDriver().findElement(locator);
		try
		{
			Actions actionBuilder = new Actions(functionality.getDriver());
			actionBuilder.doubleClick(webElement).build().perform();
			return true;
		} 
		catch (Exception exception)
		{
			exception.printStackTrace();
			return false;
		}
	}
	
	
	public boolean setText(By locator, String fieldValue) 
	{
		waitForElementPresence(locator, 10);
		WebElement webElement = functionality.getDriver().findElement(locator);
		try
		{
			// replace the text
			JavascriptExecutor executor = (JavascriptExecutor)functionality.getDriver();
			executor.executeScript("arguments[0].click();", webElement);
			webElement.sendKeys(Keys.chord(Keys.CONTROL, "a"));
			webElement.sendKeys(Keys.DELETE);
			webElement.clear();
			webElement.sendKeys(fieldValue);
			//webElement.sendKeys(Keys.TAB);
			return true;
		} 
		catch (Exception exception)
		{
			exception.printStackTrace();
			return false;
		}
	}

	public void newTab()
	{
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
	      //switch to new tab
	      driver.switchTo().window(newTb.get(1));
	      System.out.println("Page title of new tab: " + driver.getTitle());
	}
	public String getText(By locator, String textBy) 
	{
		waitForElementPresence(locator, 10);
		WebElement webElement = functionality.getDriver().findElement(locator);
		try
		{
			String strText = "";
			if(textBy.equals("value"))
				strText = webElement.getAttribute("value");
			else if(textBy.equalsIgnoreCase("text"))
				strText = webElement.getText();
			return strText; 
		} 
		catch (Exception exception)
		{
			exception.printStackTrace();
			return null;
		}
	}
}
