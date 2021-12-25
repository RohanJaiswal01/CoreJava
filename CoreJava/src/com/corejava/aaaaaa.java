package com.corejava;

public class aaaaaa {
public static void main(String[] args) {
	int [][] a=new int [9][10];
	int i;
	int j;
	int p;
	
	for ( i = 0; i < a.length; i++) {
		System.out.println("");
		for ( j = 2; j <= a[i].length; j++) {
			p=((i+1)*j);
			System.out.print(p+"\t");
		}
	}
}
}
