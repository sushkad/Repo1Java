package com.oops;

public class IfElse {

	public static void main(String[] args) {
		
		int a = 27;
		int b = 34;
		
		if(a<b)
		{
			System.out.println("a is less than b");
			
		}
		else {
			System.out.println("a is greated than b");
		}
		
		int s = 10;
		int k = 27;
		 if (s==k)
		 {
			 System.out.println("s & k are equal");
			 
		 }
		 else {
			 System.out.println("s & k are not equal");
		 }
	
		 
		 //write a logic to find out the highest number
		 
		 int z1= 12;
		 int z2= 23;
		 int z3= 45;
		 
		 //nested if-else
		 
		 if(z1>z2 & z1>z3) //true & true = true
		 {
			 System.out.println("z1 is greatest");
		 }
		 else if(z2<z3) // true 
		 {
			 System.out.println("z3 is greatest");
			 
		 }
		 else
		 {
			 System.out.println("z2 is greatest");
			 
		 }
	}

}
