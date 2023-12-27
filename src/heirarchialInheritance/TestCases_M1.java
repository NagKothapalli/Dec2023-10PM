package heirarchialInheritance;

import org.junit.Test;

public class TestCases_M1 extends ReusableComponents
{
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

}
