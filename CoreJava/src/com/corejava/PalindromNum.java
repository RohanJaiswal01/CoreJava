package com.corejava;
import java.util.Scanner;

public class PalindromNum {

	public static void main(String[] args) {
		
		int num;
		int reversenum = 0;
		
		Scanner n = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		num = n.nextInt();
		int num1 = num;
		
		if (num1==0) {
			System.out.println(num +" is palindrom number");
		}else {
			while (num1!=0){
			reversenum =reversenum*10;
			reversenum = reversenum + num1%10;
			num1 = num1/10;
		}
		}
	
		if (reversenum == num)
			{
			System.out.println(num+" is palindrom number");
		}else
			System.out.println(num+ " is not palindrom number");
	}
}
