package file;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteToFile {
	
	public static void main(String[] args) throws Exception {
		
		FileWriter writer = new FileWriter("D:\\Hello.txt",true);
		PrintWriter pw = new PrintWriter(writer);
		
		for(int i = 0; i<=5; i++) {
			pw.println();
			pw.println("Hello Java");
		}
		writer.close();
		pw.close();
		System.out.println("Done");
		
		
		
	}
	

}
