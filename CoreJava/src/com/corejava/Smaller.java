package com.corejava;
import java.util.Scanner;

public class Smaller {
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		 
		System.out.println("Enter first number");
		
		int a = obj.nextInt();
		
		System.out.println("Enter Sencond number");
		
		int b = obj.nextInt();
		
		 if (a<b)
		 {
			 System.out.println("First number is Smaller");
		 }else
		 {
			 System.out.println("Second number is Smaller");
		 }
	}

}
