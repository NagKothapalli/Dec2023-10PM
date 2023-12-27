package inheritanceByObject;

import org.junit.Test;
//             child              parent
public class TestSuites //extends TestCases   //simple inheritance
{
	
	//Modifier ClassName  objName = new Constructor();
	  // public  TestCases    tc    = new TestCases(); // default constructor
	   public  TestCases    tc    = new TestCases("safari");
	/*
	 * private void launch() { System.out.println("Launch from Test Suites"); }
	 */
	   //****************************Test Suites ********************************
		@Test
		public void smokeSuite()
		{
			System.out.println("Test Suite : SMOKE");
			tc.composeAndSendAnEmail();
			tc.replyToAnEmail();
		}
		@Test
		public void regressionSuite()
		{
			System.out.println("Test Suite : REGRESSION");
			tc.composeAndSendAnEmail();
			tc.replyToAnEmail();
			tc.forwardAnEmail();
			tc.deleteAnEmail();
		}
	

}
