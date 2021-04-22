package com.oops;

public class StringConcatenation {

	public static void main(String[] args) {
		
		
		int a = 100 ;
		int b = 200;
		
		String x = "asdf";
		String y = "zxcv";
		
		double d = 12.22 ;
		double d1 = 12.45;
		
		System.out.println(d+d1);
		System.out.println(a+b);
		System.out.println(x+y);
		
		System.out.println(x+y+a+b);  //x+y+a is one b is different
		System.out.println(x+y+(a+b));

		System.out.println(x+y+d+d1);
		
		System.out.println("The value of a is:"+a);
		System.out.println("The value of a & b is:"+(a+b));
		//+ is a concatenation operator
		
		System.out.print("qwer");
		System.out.println("asdf");
	
	}

}
