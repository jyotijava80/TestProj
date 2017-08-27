package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileWriter {
	
	public static void main(String[] args) {
		
		
			try {
				/*FileOutputStream fout = new FileOutputStream("C:\\JYOTI\\sample.txt");
				fout.write(65);
				fout.close();*/
				
			FileInputStream fin = new FileInputStream("C:\\JYOTI\\sample.txt");
			
			 int i=0;    
	            while((i=fin.read())!=-1){    
	             System.out.print((char)i);    
	            }    
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}


