package IO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_FileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			FileReader fr = new FileReader("C:\\JYOTI\\sample.txt");
	
			//FileInputStream fir = new FileInputStream("C:\\JYOTI\\sample.txt");
			//BufferedReader br = new BufferedReader(new InputStreamReader(fir));
			BufferedReader br = new BufferedReader(fr);
			String line=null;
		
			
		try {
		
			//System.out.println(br.readLine());
			while((line=br.readLine())!=null)
			{
				System.out.println(line);
				
				
			}
			fr.close();
			br.close();
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
					
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
