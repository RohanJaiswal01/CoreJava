package com.corejava;
import java.util.Scanner;

public class Reversenum {

	public static void main(String[] args) {
		int num;
		int reversenum=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number then press enter ");
	
				num = sc.nextInt();
					
		while (num!=0)
		{
			
			reversenum = reversenum*10;
			reversenum = reversenum+ num%10;
			num = num/10;
		}
		System.out.println("Reverse of given number = "+reversenum);
	}
	
}
