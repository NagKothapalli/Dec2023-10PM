package multilevelInheritance;

import org.junit.Test;

public class TestCases extends ReusableComponents
{
		
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
		    

}
