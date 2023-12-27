package coreConcepts;

import org.junit.Test;

public class ConditionalStatements
{
	
	//Modifier   DataType  Name = value ;
	
	int num1 = 44;
	int num2 = 64;
	
	//Modifier  ReturnType Name(){ body  }
	
	//if(expression : boolean -> true / false){  task }
	@Test
	public void compareNumbers_if()
	{
		System.out.println("Compare Two Numbers");
		boolean result = (num1==num2); // true / false
		if(result == true)
		{
			int sum = num1+num2;
			System.out.println("Sum of two numbers :" + sum);
		}
	}
	
	@Test
	public void compareNumbers_ifelse()
	{
		System.out.println("Compare Two Numbers");
		boolean result = (num1==num2); // true / false
		if(result == true)
		{ //true
			int sum = num1+num2;
			System.out.println("Sum of two numbers :" + sum);
		}
		else
		{ //false
			int diff = num1-num2;
			System.out.println("Difference of two numbers :" + diff);
			
		}
	}
	
	@Test
	public void compareNumbers_ifelse_test()
	{
		compareNumbers_ifelse(20,20);
		compareNumbers_ifelse(70,20);
		compareNumbers_ifelse(120,20);
		compareNumbers_ifelse(60,60);
	}
	public void compareNumbers_ifelse(int num1,int num2)
	{
		System.out.println("Compare Two Numbers");
		boolean result = (num1==num2); // true / false
		if(result == true)
		{ //true
			int sum = num1+num2;
			System.out.println("Sum of two numbers :" + sum);
		}
		else
		{ //false
			int diff = num1-num2;
			System.out.println("Difference of two numbers :" + diff);
			
		}
	}
	
	//Write a program to read two integers as input and perform addition if they are equal , subtraction if a > b , multiplication if a < b
	@Test
	public void multipleDecisions_test()
	{
		multipleDecisions(40,40); // 6 / 20 
		multipleDecisions(60,40);
		multipleDecisions(60,80);
	}
	
	public void multipleDecisions(int a, int b)
	{
		System.out.println("Given Numbers : " + a + " , " + b);		
		if(a == b)
		{
			int sum = (a+b);
			System.out.println("Sum of two numbers :" + sum);
		}
		else if(a > b)
		{
			int diff = (a-b);
			System.out.println("Difference of two numbers :" + diff);
		}
		else if(a < b)
		{
			int prod = (a*b);
			System.out.println("Product of two numbers :" + prod);
		}
		
	}
	
	//Write a program to read two integers as input and perform the below task if and only if both the inputs are above 10
	
	//Task : addition if they are equal , subtraction if a > b , multiplication if a < b
	
	@Test
	public void nestedifCondition_test()
	{
		nestedifCondition(4,24);
		nestedifCondition(44,4);
		nestedifCondition(4,4);
		nestedifCondition(44,44);
		nestedifCondition(64,44);
		nestedifCondition(44,54);
	}
	
	
	public void nestedifCondition(int a,int b)
	{
		System.out.println("Given Numbers : " + a + " , " + b);	
		
		if((a>10) && (b>10))  // outer if  -   && - logical operator
		{ //true
			//Task
			if(a == b) //Nested if condition  - inner if  , > , == , < : Relational operators
			{
				int sum = (a+b);  // + , - , * : Arithmetic operators 
				System.out.println("Sum of two numbers :" + sum);
			}
			else if(a > b)
			{
				int diff = (a-b);  // = : Assignment operator
				System.out.println("Difference of two numbers :" + diff);
			}
			else if(a < b)
			{
				int prod = (a*b);
				System.out.println("Product of two numbers :" + prod);
			}
		}
		else
		{ //false
			System.out.println("Both A and B or anyone of them might be below 10");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
