package simpleInheritance;

import org.junit.Test;

public class TestCases
{
	
	 protected void launch()
	 {
		 System.out.println("Launch from Test Cases");
	 }

	 // ****************************** Test Cases ************************************
		//@Test
		void composeAndSendAnEmail()
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
