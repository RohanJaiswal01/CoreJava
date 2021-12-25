package com.stringbasic;

public class CharCount {
	
       public static void main(String[] args) {
		
    	   String s = "Vijay Dinanath Chouhan";
    	   
    	   int count = 0;  	 
    	   
    	   for (char c = 'a';c<='z';c++) {
    		   count = 0;
    	   for(int j = s.length()-1;j>=0;j--) {
    		   if(s.charAt(j)==c) {
    			   	count ++;
    		   }
    	   }
    	   System.out.println("Char "+c+" "+count);
    	   }
    	   //System.out.println(count);
    	   
    	   /*
    	   for (int j = s.length()-1; j>=0;j--)
    	   {
    	   
    	   for (char i='a'; i<='z'; i++)  
           {  
    		   if (i==s.charAt(j))
    			   
    		   {
    			  count = count+1;
    		   }
    		  
    			   System.out.println(s.charAt(j)+" "+ count ); 
    				   
    			   
    		   }
    		   
    		   
    	   }
    	   */
	}
}
