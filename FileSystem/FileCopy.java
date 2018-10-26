package FileSystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;

public class FileCopy {

	public static void main(String[] args) {
		File s= new File("C:\\Users\\ybm8\\Desktop\\Source.txt");
		File d= new File("C:\\Users\\ybm8\\Desktop\\Destination1.txt");
		FileInputStream fis = null;
		FileOutputStream fos = null;
		 try {
			/*fis= new FileInputStream(s);
			fos= new FileOutputStream(d);
			
			byte[] buffer = new byte[1024];
			
            int length;
            while ((length = fis.read(buffer)) != -1){
                fos.write(buffer, 0, length);
                
            }
            */
			 Files.copy(s.toPath(), d.toPath());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
