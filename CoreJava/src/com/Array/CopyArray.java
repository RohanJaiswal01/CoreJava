package com.Array;

public class CopyArray {

	public static void main(String[] args) {
		
		char[] ch = {'a','e','i','o','u'};
		char[] copy = new char [3];
		
		System.arraycopy(ch, 1, copy, 0, 3);
		System.out.println(ch);
		System.out.println(copy);
	}
}
