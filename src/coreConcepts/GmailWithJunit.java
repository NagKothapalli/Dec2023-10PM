package coreConcepts;

import org.junit.Test;

public class GmailWithJunit 
{
	  // A Junit Test Method should be public , should not be static , should return only void , should not have any input parameters
	    //Compose Mail
	   //****************************Test Suites ********************************
		@Test
		public void smokeSuite()
		{
			System.out.println("Test Suite : SMOKE");
			composeAndSendAnEmail();
			replyToAnEmail();
		}
		@Test
		public void regressionSuite()
		{
			System.out.println("Test Suite : REGRESSION");
			composeAndSendAnEmail();
			replyToAnEmail();
			forwardAnEmail();
			deleteAnEmail();
		}
	
	 // ****************************** Test Cases ************************************
		@Test
		public void composeAndSendAnEmail()
		{
			System.out.println("Test Case : ComposeAndSendAnEmail ");
			//launch , login , gotoInbox , compose , send , logout , close
			launchApplication();
			loginToApplication();
			compose();
			send();
			logoutFromApplication();
			closeApplication();
		}
		//Reply to Mail
	    @Test
		public void replyToAnEmail()
		{
			System.out.println("Test Case : ReplyToAnEmail ");
			//launch , login , gotoInbox , compose , send , logout , close
			launchApplication();
			loginToApplication();
			open();
			reply();
			logoutFromApplication();
			closeApplication();
		}
		//Forward Mail
	    @Test
		public void forwardAnEmail()
		{
			System.out.println("Test Case : ForwardAnEmail ");
			//launch , login , gotoInbox , compose , send , logout , close
			launchApplication();
			loginToApplication();
			open();
			forward();
			logoutFromApplication();
			closeApplication();
		}
		//Delete Mail
	    @Test
		public void deleteAnEmail()
		{
			System.out.println("Test Case : DeleteAnEmail ");
			//launch , login , gotoInbox , compose , send , logout , close
			launchApplication();
			loginToApplication();
			open();
			delete();
			logoutFromApplication();
			closeApplication();
		}
	    
	    //************************************ Reusable Components *******************
	    public void launchApplication()
	    {
	    	System.out.println("RC : Launch Application");
	    }
	    
	    private void loginToApplication()
	    {
	    	System.out.println("RC : Login To Application");
	    }
	    
	    void logoutFromApplication()
	    {
	    	System.out.println("RC : Logout From Application");
	    }
	    
	    protected void closeApplication()
	    {
	    	System.out.println("RC : Close Application");
	    }
	    
	    public void compose()
	    {
	    	System.out.println("RC : Compose Mail");
	    }
	    
	    public void send()
	    {
	    	System.out.println("RC : Send Mail");
	    }
	    
	    private void open()
	    {
	    	System.out.println("RC : Open Mail");
	    }
	    
	    public void reply()
	    {
	    	System.out.println("RC : Reply Mail");
	    }
	    public void forward()
	    {
	    	System.out.println("RC : Forward Mail");
	    }
	    public void delete()
	    {
	    	System.out.println("RC : Delete Mail");
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

}
