package mySelenium;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionUtilities
{
	
	//click Enter , Tab , Double click , Right click
	
	Actions actions;
	
	public ActionUtilities(WebDriver driver)
	{
		actions = new Actions(driver);
	}
	
	
	public void clickEnter()
	{
		actions.sendKeys(Keys.ENTER).build().perform();
	}
	
	public void clickTab()
	{
		actions.sendKeys(Keys.TAB).build().perform();
	}
	
	public void doubleClick(WebElement element)
	{
		actions.moveToElement(element).doubleClick().build().perform();
	}
	
	public void rightClick(WebElement element)
	{
		actions.moveToElement(element).contextClick().build().perform();
	}
	
	//Take a screenshot
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
