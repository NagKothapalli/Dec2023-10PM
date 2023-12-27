package coreConcepts;

import org.junit.Test;

public class LoopingStatements
{
	//Apply color to staircase - 100 steps
	//print first 100 numbers 
	
	//for(iterator;count;step size){  task - apply color , temple round , print number }
	
	@Test
	public void printNumbers()
	{
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("8"); //...............
		
	}
	@Test
	public void printMyNumbers()
	{
		//for(int i=1;i<101;i=i+1) // Definite loop
		for(int i=1;i<=100;i++)
		{ //true
			System.out.println(i); // i=1 1<100 , i=2 2<100 , i=3 3<100 ,.... i=99 99<100 , i=100 100<100
			// 1   2  3 .......99 , 
		}
		System.out.println("Came out from the FOR loop");
	}
	
	@Test
	public void printMyNumbers_Odd()
	{
		//for(int i=1;i<101;i=i+1) // Definite loop
		for(int i=1;i<=100;i=i+2)
		{ //true
			System.out.println(i); // 
			// 1   2  3 .......99 , 
		}
		System.out.println("Came out from the FOR loop");
	}
	@Test
	public void printMyNumbers_Even()
	{
		//for(int i=1;i<101;i=i+1) // Definite loop
		for(int i=2;i<=100;i=i+2)
		{ //true
			System.out.println(i); // 
			// 1   2  3 .......99 , 
		}
		System.out.println("Came out from the FOR loop");
	}
	
	@Test
	public void applyColor()
	{
		System.out.println("Apply Color to step : 1");
		System.out.println("Apply Color to step : 2");
		System.out.println("Apply Color to step : 3");
		System.out.println("Apply Color to step : 4");
		System.out.println("Apply Color to step : 5"); //......................
	}
	@Test
	public void applyColorToSteps()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println("Apply Green Color to step :" + i);
		}
	}
	@Test
	public void applyColorToSteps_Even()
	{
		for(int i=2;i<=100;i=i+2)
		{
			System.out.println("Apply Green Color to step :" + i);
		}
	}
	@Test
	public void applyColorToSteps_Odd()
	{
		for(int i=1;i<=100;i=i+2)
		{
			System.out.println("Apply Red Color to step :" + i);
		}
	}
	
	
	//  num % 2 = 0   -> num will be even 
	@Test
	public void FindEven_test()
	{
		FindEven(22);
		FindEven(23);
		FindEven(52);
		FindEven(221);
	}
	
	public boolean FindEven(int num) // 0 or 1 -> int   , true or false -> boolean  , even or odd -> string , Y or N -> char
	{
		//System.out.println("Given Number :" + num);
		
		int reminder = (num % 2) ;
		if(reminder == 0)
		{ //true
			//System.out.println("Given Number is Even");
			return true;
		}
		else
		{
			//System.out.println("Given Number is Odd");
			return false;
		}
	}
	
	//WAP to print all even numbers in the range of 1-100
	@Test
	public void printAllEvenNumbers()
	{
		for(int i=1;i<=100;i++)
		{
			boolean result = FindEven(i);
			if(result == true)
			{
				System.out.println(i);
			}
		}
		
	}
	
	//WAP to print all odd numbers in the range of 1-100
	@Test
	public void printAllOddNumbers()
	{
		for(int i=1;i<=100;i++)
		{
			boolean result = FindEven(i);
			if(result == false)
			{
				System.out.println(i);
			}
		}
		
	}
	
	//WAP to find given number in the range of 1-100
	@Test
	public void findStudent()  // 22 
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println("Students Numbers :" + i);
			if(i==22)
			{ //true
				System.out.println("Found the student");
				break;
			}
		}
	}
	
	@Test
	public void findStudent_array() //67
	{
		//                 0  1  2  3 4
		int[] students = {23,34,56,12,33,67,89,66,99,31,65};
		boolean result = false;  //flag
		int len = students.length;
		
		for(int i=0;i<len;i++)
		{
			int std = students[i]; // i = 0 1 2 3 4 5
			if(std == 64) // 23==67 , 34 == 67 , 56==67 12==67 , 33==67 67==67
			{ //true
				result = true;
				break;
			}
		}
		System.out.println(result);
	}
	
	@Test
	public void findStudent_array_test()
	{
		int[] students = {23,34,56,12,33,67,89,5435,656,3322,454,3434,454,3424,898,656,453,4324,324,66,99,31,65};
		int[] students2 = {23,34,56,12,303,67,89,5435,6506,33322,454,3434,454,3424,898,656,4543,40324,3024,66,909,301,6985};
		findStudent_array(students2,3434);
	}
	
	public void findStudent_array(int[] studentList , int num) //67
	{		
		boolean result = false;  //flag
		int len = studentList.length;		
		for(int i=0;i<len;i++)
		{
			int std = studentList[i]; // i = 0 1 2 3 4 5
			if(std == num) // 23==67 , 34 == 67 , 56==67 12==67 , 33==67 67==67
			{ //true
				result = true;
				break;
			}
		}
		System.out.println(result);
	}
	
	//Nested loop
	//Building with 10 floors each floor having 20 steps
	@Test
	public void nestedForLoop()
	{
		for(int fc=1;fc<=10;fc++) //outer loop
		{
			System.out.println("**************Applying color in the Floor :" + fc);
			for(int sc=1;sc<=20;sc++) //inner loop  - fc=1 then sc=1 .... 20  , fc=2 sc=1...20 , fc=3 sc=1....20
			{
				System.out.println("Apply color to step :" + sc);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
