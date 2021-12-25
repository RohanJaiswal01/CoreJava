package com.corejava;
import java.util.*;

public class Armstrong {
	
	public static void main(String[] args) {
		
				
		Scanner s = new Scanner(System.in);
		   
		System.out.println("Enter the number");
		
		int armst = s.nextInt();
		int num = armst;
		
		int temp= 0;
		int temp2 = 0;
		int add = 0;
		
		while(num!=0) {
			
			temp = num%10;
			temp2 = temp*temp*temp;
			add = add+temp2;
			num=num/10;
		}
		if (add == armst) {
			System.out.println("This is Armstrong number");
		}else
			System.out.println("This is not Armstrong number");
					
	}

}
