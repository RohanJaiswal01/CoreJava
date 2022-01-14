package Scanner;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileBySacnner {

	public static void main(String[] args) throws IOException {
		
		FileReader reader = new FileReader("D:/Hello.txt");
		Scanner sc = new Scanner (reader);
		
		while(sc.hasNext()) {
		System.out.println(sc.nextLine());
		
		}
		reader.close();
	}
}
