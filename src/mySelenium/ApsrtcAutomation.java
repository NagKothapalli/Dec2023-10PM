package mySelenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApsrtcAutomation 
{
	ChromeDriver cdriver; // null // instance variable
	String sname = "Ram";
	public ApsrtcAutomation()
	{
		cdriver = new ChromeDriver(); // abcd12345
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
	public void bookBusTicket()
	{
		System.out.println("Test Case : Book Bus Ticket");
		cdriver.findElement(By.xpath("//input[@name='source']")).sendKeys("HYDERABAD");
		//keyboard and mouse operations can be performed using Actions class in Webdriver
		cdriver.findElement(By.xpath("//input[@name='destination']")).sendKeys("GUNTUR");
	}

}
