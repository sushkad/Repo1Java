package com.oops;

public class IncrementDecrementOperator {

	public static void main(String[] args) {
		
		//++
		//--
		
		int i =1;
		int j = i++; // post increment
		
		System.out.println(i);
		System.out.println(j);
		
		System.out.println(".....................................................");
		int a =1;
		int b = ++a; // pre increment
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(".....................................................");
		int s = 2;
		int k = s--; // post decrement
		System.out.println(s);
		System.out.println(k);
		
		int q = 2;
		int p = --q; //pre decrement
		System.out.println(q);
		System.out.println(p);

	}

}
