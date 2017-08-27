import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class TEST1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] data = {"A","B","E","B","D","A"};
		
		Set<String> s = new HashSet<String>();
		
		for (int i = 0; i < data.length; i++) {
			s.add(data[i]);
		}
		int i=0;
		System.out.println(s);
		
		String[] data1 = new String[s.size()];
		while(i<s.size()){
		for(String str:s){
			data1[i] =str;
			break;
		}
		i++;
		}
   
		for(int j=0;j<data1.length;j++){
			System.out.println(data1[j]);
		}
		
       		
		
	
		
		
		
		

	}

}
