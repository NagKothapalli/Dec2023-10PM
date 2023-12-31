package mySelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;
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
	ReadProperties rp;
	ActionUtilities au;
	public ApsrtcAutomation()
	{
		//System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win64-120-2\\chromedriver-win64\\chromedriver.exe");
		//ChromeOptions coptions = new ChromeOptions();
		//coptions.setBrowserVersion("Stable");
		cdriver = new ChromeDriver(); // abcd12345
		actions = new Actions(cdriver);
		cdriver.manage().window().maximize();
		System.out.println("Constructor executed");
		cdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		rp = new ReadProperties("TestData//QAEnv.properties");
		au = new ActionUtilities(cdriver);
		//sname = "Krishna";
		//System.out.println("Local sname :"+ sname);
	}
	
	@Before   //@Test
	public void launchApplication() throws IOException
	{
		System.out.println("Launch APSRTC Application ");
		//cdriver.get("https://www.apsrtconline.in/"); // Hardcoded
		//cdriver.get(readData("URL"));
	}
	
	public void allActions()
	{
		WebElement fcity = cdriver.findElement(By.xpath("//input[@name='source']"));
		au.doubleClick(fcity);
		au.rightClick(fcity);
		au.clickEnter();
		au.clickTab();
	}
	@Test
	public void bookBusTicket() throws InterruptedException, IOException
	{
		//rp.readData("");
		System.out.println("Test Case : Book Bus Ticket");
		//Thread.sleep(25000); //static wait / blind wait
		cdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		//cdriver.findElement(By.xpath("//input[@name='source']")).sendKeys("HYDERABAD"); //Hardcoded
		cdriver.findElement(By.xpath("//input[@name='source']")).sendKeys(rp.readData("FromCity"));
		Actions actions = new Actions(cdriver);
		//Thread.sleep(1000);
		//actions.sendKeys(Keys.TAB).build().perform();
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		//keyboard and mouse operations can be performed using Actions class in Webdriver
		cdriver.findElement(By.xpath("//input[@name='destination']")).sendKeys(rp.readData("ToCity"));
		//Thread.sleep(1000);
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		cdriver.findElement(By.xpath("//input[@name='txtJourneyDate']")).click();
		//cdriver.findElement(By.xpath("//a[text()='9']")).click();
		cdriver.findElement(By.xpath("//a[text()='"+rp.readData("JDate")+"']")).click();  // Dynamic XPATH
		cdriver.findElement(By.xpath("//input[@name='searchBtn']")).click();
	}
	
	@Test
	public void readProperties() throws IOException
	{
		// 1. bring the file in to Java context as a java object , 2. read the data from the object 
		
		FileInputStream myfile = new FileInputStream("TestData//DevEnv.properties");	// news paper	
		Properties prop = new Properties();  
		prop.load(myfile); //handover the news paper to
		String myval = prop.getProperty("FromCity");
		System.out.println("data one :"  + myval);
		System.out.println(prop.getProperty("ToCity"));
		System.out.println(prop.getProperty("JDate"));
		// Types of Exceptions in Java : Checked Exceptions / Compile Time    &  UnChecked / Run Time Exceptions
		
		// a/b -> divided by zero
	}
	
	
	
	@Test
	public void bookBusTicket_dataDriven() throws InterruptedException, IOException
	{
		System.out.println("Test Case : Book Bus Ticket");
		for(int i=1;i<=5;i++)
		{
			cdriver.findElement(By.xpath("//input[@name='source']")).sendKeys(rp.readData("FromCity"));
			Actions actions = new Actions(cdriver);
			actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
			cdriver.findElement(By.xpath("//input[@name='destination']")).sendKeys(rp.readData("ToCity"));
			actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
			cdriver.findElement(By.xpath("//input[@name='txtJourneyDate']")).click();
			cdriver.findElement(By.xpath("//a[text()='"+rp.readData("JDate")+"']")).click();  // Dynamic XPATH
			cdriver.findElement(By.xpath("//input[@name='searchBtn']")).click();
			Thread.sleep(2000);
			cdriver.findElement(By.xpath("//a[text()='Home']")).click();
		}
		
	}
	
	@Test
	public void bookBusTicket_dataDriven2() throws InterruptedException, IOException
	{
		String fc = rp.readData("FromCities");
		String[] fcs = fc.split(",");
		String[] tcs = rp.readData("ToCities").split(",");
		String[] jds = rp.readData("JDates").split(",");
		for(int i=0;i<fcs.length;i++)
		{
			System.out.println("Test Case : Book Bus Ticket");
			cdriver.findElement(By.xpath("//input[@name='source']")).sendKeys(fcs[i]); // fcs[0] fcs[1]
			Actions actions = new Actions(cdriver);
			actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
			cdriver.findElement(By.xpath("//input[@name='destination']")).sendKeys(tcs[i]);
			actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
			cdriver.findElement(By.xpath("//input[@name='txtJourneyDate']")).click();
			cdriver.findElement(By.xpath("//a[text()='"+jds[i]+"']")).click();  // Dynamic XPATH
			cdriver.findElement(By.xpath("//input[@name='searchBtn']")).click();
			Thread.sleep(2000);
			cdriver.findElement(By.xpath("//a[text()='Home']")).click();
		}
		
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
