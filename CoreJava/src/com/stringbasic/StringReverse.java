package com.stringbasic;

public class StringReverse {
	
	public static void main(String[] args) {
		
		String name = "Vijay Dinanath Chouhan";
		
		String[] name2 = name.split("");
		
     System.out.println("Split of name - ");
        
		for (String st:name2)
		{
			System.out.print(st+" ");
		}
		
		
		 int i= name.length()-1;
		
		 System.out.println("Reverse of name -");
		while ( i != -1)
		{
			System.out.print(name2[i]);
			i--;
		}
			
			//for ( int i=21 ; i>= 0; i--)
		//{
			//System.out.println("Reverse of name - " +name2[i]);
		//}
		//System.out.println("Reverse of name - " +name2[21]+name2[20]+name2[19]+name2[18]);
		
	}

}
