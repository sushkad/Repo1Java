package OOPConcept;

public class LocalvsGlobalVariables {

	//Global variables or class variables
	String name = "sush";
	int age  = 25 ;

	public static void main(String[] args) {

		int i = 10;  //Local variable
		System.out.println(i);

		LocalvsGlobalVariables obj  = new LocalvsGlobalVariables();
		System.out.println(obj.name);
		System.out.println(obj.age);

	}

	public void sum()
	{
		int i = 10; //local variable for sum method
		int j = 20;
		int age = 25;
		System.out.println(age);
		System.out.println(i);
		System.out.println(j);

	}
}
