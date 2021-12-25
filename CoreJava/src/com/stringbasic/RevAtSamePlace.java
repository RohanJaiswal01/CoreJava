package com.stringbasic;

public class RevAtSamePlace {
	
	public static void main(String[] args) {
		
		  String name = "Vijay Dinanath Chouhan";
		  
		  String[] name2 = name.split(" ");
		  
		//  System.out.println(name2[2]);
		  
		  String[] name3 = name2[0].split("");
		 
		for (int i = name2[0].length()-1; i>=0; i--)
		{
			System.out.print(name3[i]+"");
		}
		
		String[] name4 = name2[1].split("");
		
		System.out.print(" ");
		for (int j = name2[1].length()-1; j>=0; j--)
			{
			  System.out.print(name4[j]);
			}
		
		String[] name5 = name2[2].split("");
		 System.out.print(" ");
		for (int f = name2[2].length()-1; f>=0; f--)
		{
			System.out.print(name5[f]);
		}
		
		//for (String st:name3)
		//{
		//	System.out.print(st+" ");
		//}
        // for (String st : name2)
         //{
        //	 String[] st2 = st.split("");
        //	  for (String st3: st2)
        //	  {
        //	 System.out.println(st3);
        //	  }
        // }
		//System.out.println(name2[0]);
		
	}

}
