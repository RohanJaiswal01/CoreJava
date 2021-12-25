package com.corejava;

public class Methodcmp {
public static void main(String[] args) {
	
	String s = "amar";
	
	String s1 = "rohan";
	boolean S2 = (s==s1);// compare refrence(address) of string
	System.out.println(S2);
	
	boolean str= s.equals(s1);// compare value of string
	System.out.println(str);
	 
}
}
