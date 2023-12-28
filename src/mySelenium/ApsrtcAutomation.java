package mySelenium;

import java.time.Duration;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ApsrtcAutomation 
{
	ChromeDriver cdriver; // null // instance variable
	String sname = "Ram";
	Actions actions;
	public ApsrtcAutomation()
	{
		cdriver = new ChromeDriver(); // abcd12345
		actions = new Actions(cdriver);
		cdriver.manage().window().maximize();
		System.out.println("Constructor executed");
		//sname = "Krishna";
		//System.out.println("Local sname :"+ sname);
	}
	
	@Before   //@Test
	public void launchApplication()
	{
		System.out.println("Launch APSRTC Application ");
		cdriver.get("https://www.apsrtconline.in/");
	}
	
	@Test
	public void bookBusTicket() throws InterruptedException
	{
		System.out.println("Test Case : Book Bus Ticket");
		cdriver.findElement(By.xpath("//input[@name='source']")).sendKeys("HYDERABAD");
		Actions actions = new Actions(cdriver);
		//Thread.sleep(1000);
		//actions.sendKeys(Keys.TAB).build().perform();
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		//keyboard and mouse operations can be performed using Actions class in Webdriver
		cdriver.findElement(By.xpath("//input[@name='destination']")).sendKeys("GUNTUR");
		//Thread.sleep(1000);
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		cdriver.findElement(By.xpath("//input[@name='txtJourneyDate']")).click();
		cdriver.findElement(By.xpath("//a[text()='29']")).click();
		cdriver.findElement(By.xpath("//input[@name='searchBtn']")).click();
	}
	
	@Test
	public void handleWebAlert() throws InterruptedException
	{
		cdriver.findElement(By.xpath("//input[@name='source']")).sendKeys("HYDERABAD");
		Actions actions = new Actions(cdriver);
		Thread.sleep(1000);
		//actions.sendKeys(Keys.TAB).build().perform();
		actions.sendKeys(Keys.ENTER).build().perform();
		cdriver.findElement(By.xpath("//input[@name='searchBtn']")).click();
		cdriver.switchTo().alert().accept();
		cdriver.findElement(By.xpath("//input[@name='destination']")).sendKeys("GUNTUR");
		Thread.sleep(1000);
		actions.sendKeys(Keys.ENTER).build().perform();
		cdriver.findElement(By.xpath("//input[@name='searchBtn']")).click();
	}
	
	@Test
	public void keyboardActions()
	{
		WebElement fromCity = cdriver.findElement(By.xpath("//input[@name='source']"));
		actions.moveToElement(fromCity).build().perform();  // MouseHover
		actions.moveToElement(fromCity).click().sendKeys("KURNOOL").pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).doubleClick().contextClick().build().perform();
	}
	
	public void handleMultipleWindows()
	{
		cdriver.findElement(By.xpath("//a[@title='TimeTable / Track']")).click();
	}
	
	
	
	
	
	
	
	
	

}
