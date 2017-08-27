package Loop;

import java.util.HashSet;



public class RemoveDuplicate {

	public static void main(String args[])
	
	{
											 
			String[] strArr ={"A","C","C","B","A","D"};
			HashSet s = new HashSet();
			String[] str = new String[strArr.length];
			str[0] = strArr[0];
			String[] s1 = (String[]) s.toArray();
			System.out.println("S! : "+s1);
			
			
			for(int i=0; i < strArr.length-1; i++){
				
				for(int j = 1; j < strArr.length; j++){
					if(strArr[i] == strArr[j]){
						
						j++;
					}
				}
			}
			System.out.println(s);
						
								
		}
						
											
		
	}

	


