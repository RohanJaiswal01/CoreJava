package file;

import java.io.*;

public class CopyText {
	
	public static void main(String[] args) throws Exception {
		
		String source = "D:\\Hello.txt";
		String target = "D:\\Test.txt";
		
		FileReader fr = new FileReader(source);
		FileWriter fw = new FileWriter(target);
		
		int ch = fr.read();
		
		while(ch!=-1) {
			fw.write(ch);
			ch = fr.read();
		}
		fr.close();
		fw.close();
		System.out.println(source +"is copied to"+ target);
		
	}
	
	
}
