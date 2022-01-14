package PrimitiveDataIO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class WritePremitiveData {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream("D:/Test/PremitiveData.dat");
		DataOutputStream out = new DataOutputStream(file);
	    
		out.writeInt(04);
		out.writeChar('A');
		out.writeBoolean(true);
		out.writeDouble(231.0);
		out.writeFloat(45.12f);
		
		out.close();
		file.close();
		System.out.println("Premitive Data successfully written");
	}
}
