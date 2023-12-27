package coreConcepts;

import org.junit.Test;

public class ArraysConcept 
{
	// Array : Collection of memory locations , with similar data type .
	//Fixed array 
	
	//Modifier     DataType[]   name = { values } ;
	
	//Array Definition , types of arrays , where to use which array , signature of array , length of the array , read values from the array 
	 // write values in to the array , array index out of bounds exception , default value for int - 0  , default value for string - null
	@Test
	public void fixedIntegerArray()
	{
		int num = 22;
		  // index          0  1  2  3 4  5   6  7
		int[]  numbers  = {22,44,34,26,28,88,32,82};		
		int len = numbers.length;
		System.out.println("Length of the array :" + len);
		int fm = numbers[5];  // Reading the data from an array
		for(int i=0;i<len;i++)  // 0<8 , 1<8 , 2<8 , 7<8 , 8<=8 -> t
		{
			System.out.println(numbers[i]); //[8]
		}
		
		numbers[4] = 98; // Writing the data in to the array
		for(int i=0;i<len;i++)
		{
			numbers[i] = 222+i; // [0] = 222 , [1] = 222 , [2] = 222 , [3] = 222
			System.out.println("Elements after writing :" + numbers[i]);
		}
	}
	
	//java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
	

	
	//Dynamic array 
	
	//Modifier     DataType[]   name = new int[10] ;
	
	
	@Test
	public void dynamicIntegerArray()
	{
		int num = 22;
		  //               0  1   2  3
		//int[]  numbers  = {22,44,34,26,28,88,32,82};	
		int[]  numbers = new int[60];
		int len = numbers.length;
		System.out.println("Length of the array :" + len);
		int fm = numbers[0];
		for(int i=0;i<len;i++)
		{
			System.out.println(numbers[i]);
		}
		
		for(int i=0;i<len;i++)
		{
			numbers[i] = 222+i; // [0] = 222 , [1] = 222 , [2] = 222 , [3] = 222
			System.out.println("Elements after writing :" + numbers[i]);
		}
	}
	
	@Test
	public void dynamicStringArray()
	{
		int num = 22;
		  //               0  1   2  3
		//int[]  numbers  = {22,44,34,26,28,88,32,82};	
		String[]  names = new String[60];
		int len = names.length;
		System.out.println("Length of the array :" + len);
		String fm = names[0];
		for(int i=0;i<len;i++)
		{
			System.out.println(names[i]);
		}
		
		for(int i=0;i<len;i++)
		{
			names[i] = "Selenium-"+i; // [0] = 222 , [1] = 222 , [2] = 222 , [3] = 222
			System.out.println("Elements after writing :" + names[i]);
		}
	}
	//Array List - Collections 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
