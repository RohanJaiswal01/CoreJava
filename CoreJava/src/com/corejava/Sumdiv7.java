package com.corejava;

public class Sumdiv7 {
	
	public static void main(String[] args) {
		
		int a=0;
	    
	    for (int i = 100 ; i <200; i ++ )
	    {
	    	if (i%7 == 0 ){
	    		
	    		System.out.println(i+"+");
	    		
	    		a= a+i;
	 
	    	}
	    }
    	System.out.println("="+a);

	}

}
