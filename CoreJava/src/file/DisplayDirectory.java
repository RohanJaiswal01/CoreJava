package file;

import java.io.File;

public class DisplayDirectory {
	public static void main(String[] args) {
		
		File directory = new File("C:\\Program Files\\Java\\jdk1.8.0_311");
		
		String[] list = directory.list();
		
		for(String i : list) {
			System.out.println(i);
		}
		System.out.println("");
				
		// display only files
		
		for(int i = 0 ; i < list.length; i++) {
			
			File f = new File("C:\\Program Files\\Java\\jdk1.8.0_311",list[i]);
			
			if(f.isFile()) {
			System.out.println((i+1) + ":" + list[i]);
			}
		}
		
		
		
		
	}

}
