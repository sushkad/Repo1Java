package OOPConcept;

public class Functioninjava {

	public static void main(String[] args)
	{
		//function and methods both are same thing

		Functioninjava obj  = new Functioninjava();  //object created

		// object name = new object
		// obj - is only reference variable

		//obj.test();
		String k = obj.QA();
		System.out.println(k);

		int l = obj.test1();
		System.out.println(l);

		int i = obj.division(10, 5);
		System.out.println(i);

		//main method is void  - never returns a value  //never write returns statement in main method 
	}

	//non static method


	//how to return from a method
	//void does not return any value

	//return type = void
	public void test()  //no input  , no output
	{
		System.out.println("test method");
	}

	// return type  = int
	public int test1() //no input  , some output
	{
		int a = 10;
		int b = 20;
		int c = a+b;

		return c;
		//return is keyword
	}

	//return type= String 
	public String QA() //no input  , some output
	{
		System.out.println("Qa Method");
		String s = "Selenium"; //declare one variable
		return s;
	}


	//return type= int
	public int division(int x,int y)
	{
		System.out.println("division method");
		int d = x/y;
		return d;
	}


}
