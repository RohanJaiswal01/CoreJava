package com.corejava;
import java.util.Scanner;

public class PrimeNum {
	
	public static void main(String[] args) {
		
		int flag = 0;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number");
	
	int num = sc.nextInt();
	
  	if (num==0||num==1)
       {
  		System.out.println(num +" is not prime number");
      }else {
	   for (int i=2; i<num;i++)
	   {
		   if (num%i==0) {
             System.out.println(num +" is not prime number");
             flag = 1;
             break;
	      }
	   }
		if(flag==0)
			{System.out.println(num + "is prime number");}
        }
   
 }
}
