package com.corejava;

import java.util.Scanner;

public class AvrOfOddEven {
	
	public static void main(String[] args) {
		
	   int i=1;
	   int countE = 0;
       int countO = 0;
	   int sumE = 0;
	   int sumO = 0;
	   
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Enter number to find average of consecutive N Odd numbbers and Even numbers");	   
	     int n = sc.nextInt();
	     
	     while(n != countE && n != countO) {
	    	 
	    	 if (i%2==0) {
	    		 
	    		sumE = sumE + i;
	    		countE++;
	    	 }else {
	    		 sumO = sumO + i;
	    		 countO++;
	    	 }i++;
	        	 
	     }
	     int avgE =sumE/countE;
	     System.out.println("Average of first "+ n +" even numbers = "+avgE );
	     
	     int avgO = sumO/countO;
	     System.out.println("Average of first "+ n +" odd numbers = "+ avgO);

		
	}
}
