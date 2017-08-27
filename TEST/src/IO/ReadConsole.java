package IO;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		 
		
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println(br.readLine());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
