package com.Array;

public class Array1D {
	public static void main(String[] args) {
		
		int[] a = {8,2,6,4,5};
		// Static Array direct initilize value in array
		char[] ch = {'a','b','c'};
		// Static Array direct initilize value in array
		
		int [] arr = new int[5];// Dynamic array - value intialize later
			
		arr[0]=1;
		arr[1]=5;
		arr[2]=6;
		arr[4]=8;
		for (int i = 0 ;i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		/*for(int x:a) {
		System.out.println(x);
		};*/
		
		for ( int i =0 ;i <a.length;i++)
           {
	        System.out.println(a[i]);
           }
		System.out.println(ch);
	}

}
