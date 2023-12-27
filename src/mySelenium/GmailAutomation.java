package mySelenium;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailAutomation 
{
	
	String eTitle = "Gmail";
	//ChromeDriver driver = new ChromeDriver(); //Inside the constructor they wrote the required code to open an empty google chrome browser
	ChromeDriver driver; //null
	public GmailAutomation()
	{
		System.out.println("Inside Constructor");
		driver = new ChromeDriver();
	}
	
	@Before         //@Test
	public void launchApplication()
	{
		System.out.println("Test Case : Launch Applicatin");
		//Need an empty browser ie/chrome/ff
		//call gmail.com URL		
		//FirefoxDriver driver = new FirefoxDriver();
		//EdgeDriver driver = new EdgeDriver();
		driver.get("https://gmail.com");
		String curl = driver.getCurrentUrl();
		System.out.println("My current url :" + curl);
		System.out.println(driver.getWindowHandle());
		String cTitle = driver.getTitle();
		System.out.println("Current Title :" + cTitle);
		if(eTitle.equals(cTitle))
		{
			System.out.println("Title Validation Passed");
		}
		else
		{
			System.out.println("Title Validation Failed");
		}
		driver.manage().window().maximize();
		
		

		//driver.close();
	}
	
	//selenium webdriver 
	//ChromeDriver - get(url) , getTitle() , getCurrentUrl() , refresh() , close() , minimize(),maximize() , findElement(ravi) , findStudents()
	
	//Selectors / Locators : By : ID,Name,ClassName,LinkText,PartialLinkText,TagName,CssSelector,Xpath
	
	//org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"*[name='identifier']"}
	
	//java.lang.NullPointerException: Cannot invoke "org.openqa.selenium.chrome.ChromeDriver.get(String)" because "this.driver" is null
	
	//   XPATH :    
	
	// Absolute / static / fixed 
	//   /html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input
	
	//Relative xpath
	
	//tagName[@attributetype = value ]    ->  //input[@type='email']      ,     //input[@name='identifier']   
	
	//*[@attributetype = value ]   -> //*[@type='email']
	
	//tagName[text()= value ]
	
	//tagName[contains(text(), value) ]
	
	//*[text()= value ]	
	
	//tagName[@attributetype = value   and  @att2= value ] 
	
	//tagName[@attributetype = value  and text()= value] 
	
	//tagName[@attributetype = value   or  @att2= value ] 
	
		//tagName[@attributetype = value  or text()= value] 
	
	//*[@attributetype = value   and  @att2= value ] 
	
	//*[@attributetype = value  and text()= value] 
	
	
	
	@Test
	public void loginToApplication_absoluteXpath()
	{
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input")).sendKeys("nag022@gmail.com");
		
	
	}
	@Test
	public void loginToApplication_relativeXpath()
	{
		//driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("nag022");  // select ename from employees where eid=22
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("nag022");
	
	}
	@Test   // Execution Sequence : Instance variables -> Constructor of the class -> if any Before  -> Test Method
	public void loginToApplication()
	{
		//launchApplication();
		System.out.println("Test Case : Login TO Application");
		//WebElement element = driver.findElement(By.name("identifier"));
		//WebElement element = driver.findElement(By.id("identifierId"));
		WebElement element = driver.findElement(By.tagName("input"));
		element.click();
		element.sendKeys("dlsjadslkfjdkf");
		element.clear();
		element.sendKeys("nag022@gmail.com");
		//element.clear();		
		//driver.findElements(By.className("VfPpkd-vQzf8d")).get(1).click();  // index : 0 1 2 
		List<WebElement> elements = driver.findElements(By.className("VfPpkd-vQzf8d"));
		//WebElement myelement = elements.get(1);
		//myelement.click();
		for(int i=0;i<elements.size();i++)
		{
			WebElement myelement = elements.get(i); // i=0 1 2
			String txt = myelement.getText();
			System.out.println("text on the object :" + txt);
			if(txt.equals("Next"))
			{
				myelement.click();
				break;
			}
			
			
		}
		
		
		
	}
	@Test
	public void createAccount()
	{
		List<WebElement> elements = driver.findElements(By.className("VfPpkd-vQzf8d"));
		for(int i=0;i<elements.size();i++)
		{
			WebElement myelement = elements.get(i); // i=0 1 2
			String txt = myelement.getText();
			System.out.println("text on the object :" + txt);
			if(txt.equals("Create account"))
			{
				myelement.click();
				break;
			}			
		}
	}
	
	@Test
	public void createAccount_relativexpath()
	{
		driver.findElement(By.xpath("//span[text()='Create account']")).click();
	}
	
	@Test
	public void forgotEmail()
	{
		//driver.findElement(By.tagName("button")).click();
		/*
		 * List<WebElement> elements = driver.findElements(By.tagName("button"));
		 * for(int i=0;i<elements.size();i++) { WebElement myelement = elements.get(i);
		 * // i=0 1 2 String txt = myelement.getText();
		 * System.out.println("text on the object :" + txt);
		 * if(txt.equals("Forgot email?")) { myelement.click(); break; } }
		 */
		
		
		//driver.findElement(By.xpath("//button[text()='Forgot email?']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Forgot')]")).click();
	}
	
	@Test
	public void learnMore_linkText()
	{
		
		By byobj = By.linkText("Learn more");
		WebElement element = driver.findElement(byobj);
		element.click();
		
		//driver.findElement(By.linkText("Learn more")).click();
	}
	
	@Test
	public void learnMore_partiallinkText()
	{
		
		driver.findElement(By.partialLinkText("Learn")).click();
	}
	
	@Test
	public void learnMore()
	{
		//driver.findElement(By.tagName("a")).click();
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		for(int i=0;i<elements.size();i++)
		{
			WebElement myelement = elements.get(i); // i=0 1 2
			String txt = myelement.getText();
			System.out.println("text on the object :" + txt);
			if(txt.equals("Learn more"))
			{
				myelement.click();
				break;
			}			
		}
	}
	
	
	
	

}
