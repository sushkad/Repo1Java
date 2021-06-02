package OOPConcept;

public class StaticAndNonStatic {


	//Global variable - the scope of - will be available across all the function with some condition

	String name = "sush"; //non static global variable
	static int age = 25; // static global variable

	public void sendmail() //non static method
	{
		System.out.println("Send mail method");
	}

	public static void sum() //static method
	{
		System.out.println("Sum method");
	}
	public static void main(String[] args) {

		//how to call static methods & variable
		//1. Direct calling
		sum();

		//2. Calling by class name1
		StaticAndNonStatic.sum();
		System.out.println(age);
		
		////////////////////////////////////////////////////////////////////////////////

		//how to call Non-static methods & variable

		StaticAndNonStatic obj = new StaticAndNonStatic();
		obj.sendmail();
		//System.out.println(name);  // not access
		System.out.println(obj.name);
		//Can Access Age because of static
		System.out.println(age);

		//Qn.//can i access static method by using obj reference - Yes
		obj.sum(); // warning will be given 

	}

}
