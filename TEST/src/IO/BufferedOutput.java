package IO;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BufferedOutput {
	
	public static void main(String[] args) {
		
		
			try {
				/*FileOutputStream fout = new FileOutputStream("C:\\JYOTI\\sample.txt");
				fout.write(65);
				fout.close();*/
				
			FileOutputStream fout = new FileOutputStream("C:\\JYOTI\\sample.txt");
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			String s = "Jyoti prakash Jena";
			
			byte[] b = s.getBytes();
			
			bout.write(b);
			bout.flush();
			bout.close();
			fout.close();
			System.out.println("success!!!");
			
		
			
			 
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}


