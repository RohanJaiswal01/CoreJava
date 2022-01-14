package PrimitiveDataIO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadPrimitiveData {

	public static void main(String[] args) throws IOException {
		
		String source = "D:/Test/PremitiveData.dat";
		FileInputStream file = new FileInputStream(source);
		DataInputStream in = new DataInputStream(file);
		//read data in same written format  o/w wrong data shows
		System.out.println(in.readInt());
		System.out.println(in.readChar());
		System.out.println(in.readBoolean());
		System.out.println(in.readDouble());
        System.out.println(in.readFloat());
        
        in.close();
		
		
	}
}
