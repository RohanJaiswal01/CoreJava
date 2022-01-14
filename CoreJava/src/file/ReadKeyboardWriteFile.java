package file;

import java.io.*;
import java.io.IOException;

public class ReadKeyboardWriteFile {
	
	public static void main(String[] args) throws Exception {
		
	
	String target = "D:\\Test1.txt";
	FileWriter fw = new FileWriter(target);
	PrintWriter pwriter = new PrintWriter(fw);
	
	InputStreamReader isreader = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isreader);
	
	String line = br.readLine();
    while(!line.equals("quit")) {
    	
    	pwriter.println(line);
    	line = br.readLine();
    }
	pwriter.close();
	isreader.close();
	
	}
}
