package coreConcepts;

public class BasicConcepts
{
	public BasicConcepts()
	{
		
	}
	//Signature : CLASS
	
		//Modifier[opt]  class  Name{  members:variables / functions  }
	
	      //Access Modifiers : private , default , public , protected
		  //Non Access Modifiers : static , final
			// class name must start with  upper case , no special chars in class name  , no space in class name
	//Signature : VARIABLE
		//Modifier[opt]   DataType Name ; - Declaration  //Modifier   DataType Name = value; - Assignment
	//Student number- int , name - string , grade - char , marks % - floating , result - boolean
	
	public static final  String collegeName = "JNTU";
	public static int collegeCode = 123 ;
	public static double collegePercentage = 88;
	public static char collegeGrade = 'A';
	
	String xyz = collegeName;
	//student 
	public int stdNum1 ; 
	public String stdName;
	char stdGrade ; //default
	protected double stdPercentage;
	boolean stdResult = true;
	
	//Signature : FUNCTION  / METHOD
	
	  //Modifier[opt]   ReturnType   Name(){  body }
	
	
	 //Modifier[opt]   ReturnType   Name(arguments...){  body }
										//DataType arg1,DataType arg2 ....
	
	//Naming convention for a member of a class : variable / function 
	
	 // Member of a class can be started with   _ , $ , a-z  , A-Z 
	   //  Can not have a space , no other special char is allowed , 
	  // should follow camelCasing
	
	int _stdNum;   int $stdNum;  int stdNum; int StdNum; 
	int std_Num; int stdNUm_;
	int std1Num;   int stdNumber1;
	
	public void composeMail()
	{
		
	}
	//main method - psvm
	public static void main(String[] args)
	{
		//body
		System.out.println("Welcome to Selenium Java - Original");
		addition();
		addition(22,66);
		addition(52,66);
		addition(88);
		//subtraction();
	}
	public static void main(String[] args,int abc)
	{
		//body
		System.out.println("Welcome to Selenium Java - two inputs");
		addition();
		addition(22,66);
		addition(52,66);
		addition(88);
		//subtraction();
	}
	public static void Main(String[] args)
	{
		//body
		System.out.println("Welcome to Selenium Java - Capital");
		addition();
		addition(22,66);
		addition(52,66);
		addition(262,66);
		addition(52,6346);
		addition(2762,66);
		addition(52,6896);
		addition(2342,66);
		addition(52,67686);
		addition(266562,66);
		addition(52,64456);
		addition(88);
		//subtraction();
	}
	
	
	// input - arguments  /  output - return type
	public static void addition(){		
		//code here
		System.out.println("This will perform Sum of numbers");
		int sum = 22+44; //static
		//int+int = int ,  int+string / string+int / string+string : string
		System.out.println("Sum of two numbers :+sum");
		System.out.println("Sum of two numbers :"+sum);
	}
	
	public static void addition(int a){
		int sum = 44 + a;
		System.out.println("SUm of the numbers :" + sum);
	}
	
	public static void addition(int a,int b)
	{
		int sum = a+b;
		System.out.println("Sum of A and B :" + sum);
	}
	public static void subtraction(){		
		//code here
		System.out.println("This will perform Difference of numbers");
	}
	
	public static void sendMail()	{
		//code here
		System.out.println("This will Send an Email");
	}
	
	public static void login() {
		//code here
		System.out.println("This will do a Login to Application");
	}
}


class Amazon
{
	String cName = BasicConcepts.collegeName;
	String abcd = BasicConcepts.collegeName;
	//print cName ;
}

class Flipkart
{
	
}
