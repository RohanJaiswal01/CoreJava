package com.corejava;

public class Array2d {
	public static void main(String[] args) {
		int a;
		int i;
		int j;
		int[][] table = new int[9][10];

		for (i = 0; i <table.length; i++)
			System.out.print("");
		{
			for ( j = 2; j<=table[i].length; j++) {

				a = (i+1)*j;
				System.out.print(a + "\t");
			}

		}
	}
}
