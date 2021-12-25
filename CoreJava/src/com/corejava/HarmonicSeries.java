package com.corejava;
import java.util.*;

public class HarmonicSeries {

	/*public HarmonicSeries() {
    }
	public HarmonicSeries(int a, int b) {
		
		
	}*/
	
	public static void main(String[] args) {
		
		int a,b,c;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter fisrt number to print harmonic series");
		a = s.nextInt();
		System.out.println("Enter second number to print harminc series");
		b = s.nextInt();
		System.out.println("Enter harmonic series length");
		c = s.nextInt();
		
		System.out.println("Harmonic Series is = ");
		for (int i=0; i<c; i++)
		{
			if (i==0) {
				System.out.print(1/a+"+");
			}else {
			double series = (double) 1/(a+i*b);
			 System.out.print(series + "+");
			}
		}
		
	}
}
