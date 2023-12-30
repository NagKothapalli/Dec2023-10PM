package mySelenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ApsrtcAutomation 
{
	WebDriver cdriver; // null // instance variable
	String sname = "Ram";
	Actions actions;
	public ApsrtcAutomation()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win64-120-2\\chromedriver-win64\\chromedriver.exe");
		//ChromeOptions coptions = new ChromeOptions();
		//coptions.setBrowserVersion("Stable");
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
		cdriver.findElement(By.xpath("//input[@name='source']")).sendKeys("HYDERABAD"); //Hardcoded
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
	
	//org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
	
	@Test
	public void handleMultipleWindows() throws InterruptedException
	{
		System.out.println("First window title :" + cdriver.getTitle());
		cdriver.findElement(By.xpath("//a[@title='TimeTable / Track']")).click();
		cdriver.findElement(By.xpath("//a[text()='All services Time Table & Tracking']")).click();
		Set<String> windows = cdriver.getWindowHandles();
		ArrayList<String>  allwindows = new ArrayList<String>(windows);
		int count = allwindows.size();
		System.out.println(allwindows.get(0)); //efds53fdsf
		System.out.println(allwindows.get(1)); //hjh565gjhgfdg
		cdriver.switchTo().window(allwindows.get(1));
		Thread.sleep(2000);
		String title2 = cdriver.getTitle();
		System.out.println("Second window title :" + title2);
		cdriver.close();		
		cdriver.switchTo().window(allwindows.get(0));
		Thread.sleep(2000);
		cdriver.findElement(By.xpath("//a[text()='Home']")).click();
		cdriver.quit();
	}
	
	
	
	
	
	
	
	
	

}
