package com.oops;

public class LoopsConcept {

	public static void main(String[] args) {

		// while loop  -- will generate infinite loop if you don't give incremental / decremental part
		
		int i = 1; //declare one variable ..initialization
		while(i<=10) //conditional part
		{
			System.out.println(i);
			i= i+1; //incremental/decremental  part
		}
	
		System.out.println("//////////////////////////////////////////");
		
		//For loop
		// j++ means j =j+1
		
		for(int j=1;j<=10;j++) //initialization;conditional;incremental/decremental
		{
			System.out.println(j);
		}
		
		System.out.println("............................................");
		//Print 10 to 1
		
		for(int k=10;k>=-10;k--) ////initialization;conditional;decremental
		{
			System.out.println(k);
		}
		
		
		
	}

}
