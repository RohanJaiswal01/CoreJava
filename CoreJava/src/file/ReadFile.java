package file;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFile {
	public static void main(String[] args) throws Exception {
		
	
	FileReader reader = new FileReader ("C:\\workspace/Hello.txt");
	//read a char as ASCII or UniCode
	int ch = reader.read();
	
	char c;
	
	while(ch!=-1) {
		c = (char) ch;
		System.out.println(c);
		ch = reader.read();//Read next character
		
	}
	}
}
