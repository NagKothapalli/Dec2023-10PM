package multilevelInheritance;

import org.junit.Test;

//           child              father        gf
//              A    extends      B        extends C ->    A inherits C also
public class TestSuites extends TestCases
{
	   //****************************Test Suites ********************************
			@Test
			public void smokeSuite()
			{
				//launchApplication();
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

}
