package heirarchialInheritance;

import org.junit.Test;

public class TestCases_M2 extends ReusableComponents
{
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
