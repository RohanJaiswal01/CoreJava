package file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindEmails {

	public static void main(String[] args) throws Exception {
		
		FileReader read = new FileReader("D:/Test/TestEmails.txt");
	    Scanner sc = new Scanner(read);
	    
	    Pattern pattern = Pattern.compile("[a-zA-Z0-9+_.-]+@[a-z]+.[com]+");
	    
	    boolean found = false;
	   while (sc.hasNext()) {
	    Matcher matcher = pattern.matcher(sc.nextLine());
	        
	    while(matcher.find()) {
	    	System.out.print("emails :"+matcher.group());
	    	System.out.println();
	    	found = true;
	    }
	   }
	   //System.out.println(!found);
	    
	    if(!found) {
	    	System.out.println("no match found");
	    }
	}
}
