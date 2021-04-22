package com.oops;

public class ArrayConcept {

	public static void main(String[] args) {
	
		// to store similar data type value in a array variable
		// sized is fixed // static array - to overcome this problem-- we use Collections --- Array list,Hashtable-- use Dynamic Array
		// stores similar data types --- to overcome this problem ,we use Object array
		
		// int array
		int i [] = new int[4] ;
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		System.out.println(i[2]);
		System.out.println(i[3]);
		//System.out.println(i[4]);
		
		//size of an array or length
		System.out.println(i.length);
		
		// print the values of array : use for loop
		for (int j =0;j<i.length;j++)
		{
			System.out.println(i[j]);
		}
		
		//double array
		
		double d[] = new double[4];
		d[0]= 12.00;
		d[1]= 25.22;
		d[2]= 45.25;
		d[3]= 58.25;
		System.out.println(d[3]);

		//char array
		
		char c[] = new char[3];
		 c[0] = 's';
		 c[1] = 'd';
		 System.out.println(c[1]);
		 

		 boolean b [] = new boolean[2];
		 b[0] = true;
		 b[1] = false;
		 System.out.println(b[1]);
		 
		 
		 //string array
		 String s[] = new String[3];
		 s[0] = "asdf";
		 System.out.println(s.length);
				 
		 //Object array
		 //object is a super class of all classes in java
		 //used to stored different data types values
		 
		 Object ob[] = new Object[3];
		 
		 ob[0] = "sush";
		 ob[1] =  30;
		 ob[2] = 's';
		 
		 System.out.println(ob[2]);
		 System.out.println(ob.length);
		
	}

}
