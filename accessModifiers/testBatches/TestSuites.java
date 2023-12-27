package testBatches;

import org.junit.Test;

import testScenarios.TestCases;
//             child              parent
public class TestSuites extends TestCases   //simple inheritance
{
	/*
	 * private void launch() { System.out.println("Launch from Test Suites"); }
	 */
	   //****************************Test Suites ********************************
		@Test
		public void smokeSuite()
		{
			System.out.println("Test Suite : SMOKE");
			//launch();
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
	

}
