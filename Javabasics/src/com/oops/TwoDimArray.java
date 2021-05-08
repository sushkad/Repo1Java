package com.oops;

public class TwoDimArray {

	public static void main(String[] args) {

		// How to declare 2D array

		String x[][] = new String[3][5];
		//System.out.println(x.length);  // 3 total number of rows
		//System.out.println(x.clone()[0].length);

		//store the data the values

		x[0][0] = "a" ;
		x[0][1] = "b" ;
		x[0][2] = "c" ;
		x[0][3] = "d" ;
		x[0][4] = "e" ;

		//2nd row

		x[1][0] = "f" ;
		x[1][1] = "g" ;
		x[1][2] = "h" ;
		x[1][3] = "i" ;
		x[1][4] = "j" ;

		//3 rd row

		x[2][0] = "k" ;
		x[2][1] = "l" ;
		x[2][2] = "m" ;
		x[2][3] = "n" ;
		x[2][4] = "o" ;

		//System.out.println(x.length);
		//System.out.println(x[2][0]);
		//System.out.println();

		//Print all the values of 2d array = user for loop

		for (int row=0;row<x.length;row++)
		{
			for(int col=0;col<x[0].length;col++)
			{
				System.out.println(x[row][col]);
			}

		}
	}

}
