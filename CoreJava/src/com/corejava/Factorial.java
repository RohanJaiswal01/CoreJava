package com.corejava;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		
		int fact = 1;
		Scanner num = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int n = num.nextInt();
		
		for (int i = 1;i<=n; i++)
		{
			fact = fact*i;
						
		}
		System.out.println("Factorial of number = "+ fact);
	}
}
