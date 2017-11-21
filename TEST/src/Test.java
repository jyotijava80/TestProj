import java.util.*;
public class Test {
	
	public static void main (String args[]) {
		
		int i = 5;
		System.out.println(++ i);  //output
		
		System.out.println(i++);  //output
		
		System.out.println( ++i); //output
		
		System.out.println("Adding more line");
		
		System.out.println("adding second change");
		
		System.out.println("Third change");
		
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		hMap.put(10, "Jyoti");
		hMap.put(20, "Aarish");
		hMap.put(30, "Ranu");
		
	  Set set1 = hMap.keySet();
	  Set set2=hMap.entrySet();
	  
	  Iterator itr = set1.iterator();
	  Iterator itr2 = set2.iterator();
	  
	  while(itr.hasNext())
	  {
		  
		 // System.out.println("keys are" + itr.next());
		  System.out.println("values are "+hMap.get(itr.next()));
		  
	  }
	  
	  while(itr2.hasNext())
	  {
		  System.out.println("key and value is-->"+ itr2.next());
	  }
	  }
		
		
		
		
	}


