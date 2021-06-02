package OOPConcept;

public class CallbyValueAndRefer {

	int p;
	int q;

	public static void main(String[] args) {

		CallbyValueAndRefer obj = new CallbyValueAndRefer();
		int x = 10;
		int y = 20;
		obj.testsum(x,y); //call by value or pass bu value

		obj.p= 40;
		obj.q= 50;

		obj.swap(obj);

		//after swap
		System.out.println(obj.p);
		System.out.println(obj.q);

	}

	public int testsum(int a ,int b)
	{
		int c = a+b;
		return c;

	}

	// QN . Yes possible - Pass object reference
	// call by reference
	public void swap(CallbyValueAndRefer t)
	{

		int temp;
		temp = t.p;
		t.p = t.q;
		t.q = temp;

	}
}



