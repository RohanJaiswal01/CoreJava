package file;

import java.io.File;
import java.util.Date;

public class FileInfo {

	public static void main(String[] args) {
		
		File f = new File("C:\\workspace/Hello.txt");
		
		if(f.exists()) {
			System.out.println("Name"+ f.getName());
			System.out.println("Absolute path: "+ f.getAbsolutePath());
			System.out.println("Is writable "+ f.canWrite() );
			System.out.println("Is Readable " + f.canRead() );
			System.out.println("Is File "+ f.isFile());
			System.out.println("Is Directory "+ f.isDirectory());
			System.out.println("Last Modified at "+ new Date(f.lastModified()));
			//length of file
			long length = f.length();
			System.out.println("Length "+ length+ "byte long");
			System.out.println();
		}
	}
}
