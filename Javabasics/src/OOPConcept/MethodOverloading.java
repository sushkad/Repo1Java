package OOPConcept;

public class MethodOverloading {

	
	public static void main(String[] args) {
	
		MethodOverloading obj = new MethodOverloading();
		
		obj.sum();
		obj.sum(10);
		obj.sum(10, 20);
	
	}
	
	// can we overload main method  .. yes -- Should Create different main method with different parameter
	public static void main(int f)
	{
		System.out.println(f);
	}
	
	/*
	 * public static void main(int g) { System.out.println(f); }
	 */
	
	// can not create method inside a method
	// Different arguments with different data types are allowed
	// Duplicate method -- i.e - Same method name with same number of argument are not allowed
	// Method Overloading --When the method name is same with different (argument or input parameter) within the same class
	
	public void sum ()
	{
		System.out.println("Sum Method Zero parameter");
	}
	
	public void sum(int i)
	{
			System.out.println("one parameter");
			System.out.println(i);
	}

	public void sum(int j , int k)
	{
		System.out.println("Two Parameter");
		System.out.println(j+k);
	}
	
	//Same method name with different data types
	public void sum(double d) // different data type
	{
		System.out.println(d);
		System.out.println(d++);
	}
}
