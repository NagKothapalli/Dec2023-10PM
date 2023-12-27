package inheritanceByObject;

import org.junit.Test;

public class TestCases
{
	public TestCases()
	{
		System.out.println("Delete all temp test records in the Data Base");
		System.out.println("Open Google Chrome as Default Browser");
	}
	public TestCases(String browser)
	{
		//if browser = chrome then open chrome else if ff then open ff else if edge then open edge 
		//chrome , Chrome , CHROME 
		if(browser.equalsIgnoreCase("Chrome")) {
			System.out.println("Open Google Chrome Browser");
		}
		else if(browser.equalsIgnoreCase("fireFOX")) {
			System.out.println("Open Firefox Browser");
		}
		else if(browser.equalsIgnoreCase("EdGE"))
		{
			System.out.println("Open MS Edge Browser");
		}
		else  //default
		{
			System.out.println("Given browser is not supported :" + browser);
			System.out.println("Open Google Chrome as Default Browser");
		}
	}
	
	public void TestCases1(String browser)
	{
		//if browser = chrome then open chrome else if ff then open ff else if edge then open edge 
		if(browser.equals("CHROME")) {
			System.out.println("Open Google Chrome Browser");
		}
		else if(browser.equals("FIREFOX")) {
			System.out.println("Open Firefox Browser");
		}
		else if(browser.equals("EDGE"))
		{
			System.out.println("Open MS Edge Browser");
		}
		else  //default
		{
			System.out.println("Open Google Chrome as Default Browser");
		}
	}
	
	public void TestCases2(String browser)
	{
		//if browser = chrome then open chrome else if ff then open ff else if edge then open edge 
		//chrome , Chrome , CHROME 
		if(browser.toUpperCase().equals("CHROME")) {
			System.out.println("Open Google Chrome Browser");
		}
		else if(browser.toUpperCase().equals("FIREFOX")) {
			System.out.println("Open Firefox Browser");
		}
		else if(browser.toUpperCase().equals("EDGE"))
		{
			System.out.println("Open MS Edge Browser");
		}
		else  //default
		{
			System.out.println("Open Google Chrome as Default Browser");
		}
	}
	
	
	 // ****************************** Test Cases ************************************
		@Test
		public void composeAndSendAnEmail()
		{
			System.out.println("Test Case : ComposeAndSendAnEmail ");
			//launch , login , gotoInbox , compose , send , logout , close
		}
		//Reply to Mail
	    @Test
		public void replyToAnEmail()
		{
			System.out.println("Test Case : ReplyToAnEmail ");
			//launch , login , gotoInbox , compose , send , logout , close
		}
		//Forward Mail
	    @Test
		public void forwardAnEmail()
		{
			System.out.println("Test Case : ForwardAnEmail ");
			//launch , login , gotoInbox , compose , send , logout , close
		}
		//Delete Mail
	    @Test
		public void deleteAnEmail()
		{
			System.out.println("Test Case : DeleteAnEmail ");
			//launch , login , gotoInbox , compose , send , logout , close
		}

}
