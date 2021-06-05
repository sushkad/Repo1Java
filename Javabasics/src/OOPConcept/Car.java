package OOPConcept;

public class Car {

	// class variable
	int mod;
	int wheels;
	int door;

	public static void main(String[] args) {

		// new Car() is object of Car class
		// new keyword is used to create the object
		// wheel,engine,doors ---> object reference variable

		Car a = new Car();
		Car b = new Car();
		Car c = new Car();

		a.mod = 20;
		a.wheels = 30;
		a.door= 40;

		b.mod = 50;
		b.wheels = 60;
		b.door= 70;

		c.door = 80;
		c.mod = 90;
		c.wheels = 100;

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

		a.mod = 20;
		System.out.println(a.mod); //20
		c.mod= 90;
		System.out.println(a.mod); //90
		b.mod = 50;
		System.out.println(a.mod); //90

	}

}
