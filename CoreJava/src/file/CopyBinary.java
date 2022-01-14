package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class CopyBinary {
	
	public static void main(String[] args) throws Exception {
		
		String source = "D:\\cat.png";
		String target = "D:\\meow.png";
		
		FileInputStream reader = new FileInputStream(source);
		FileOutputStream writer = new FileOutputStream(target);
		int ch = reader.read();
		
		while(ch!=-1) {
			
			writer.write(ch);
			ch = reader.read();
		}
		writer.close();
		reader.close();
		System.out.println("Image copied");
	}

}
