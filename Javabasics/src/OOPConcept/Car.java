package OOPConcept;

public class Car {

	// two class variable
	 int mod;
	 int wheels;
	 
	 
	public static void main(String[] args) {
		
		// new Car() is object of Car class
		// new keyword is used to create the object
		// wheel,engine,doors ---> object reference variable
		
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.mod = 27;
		a.wheels = 6;
		
		b.mod = 24;
		b.wheels = 45;
		
		c.mod = 11;
		c.wheels = 12;
		
		System.out.println(a.mod);
		System.out.println(b.wheels);
		System.out.println(c.mod);
	
		System.out.println("Befor assigning the refernece");
		
		System.out.println(a.mod);
		System.out.println(b.mod);
		System.out.println(c.mod);
	
		System.out.println("After shifting the refernece");
		
		a=b;
		b=c;
		c=a;
		
		a.mod = 10;
		System.out.println(a.mod);
		
		c.mod= 20;
		System.out.println(a.mod);
		
		b.mod = 10;
		System.out.println(a.mod);
		
	}

}
