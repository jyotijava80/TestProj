import java.util.*;
import java.util.Set;
import java.util.ArrayList;
public class Test {
	
	public static void main (String args[]) {
		
		int i = 5;
		System.out.println(++ i);  //output
		
		System.out.println(i++);  //output
		
		System.out.println( ++i); //output
		
		System.out.println("Adding more line");
		
		System.out.println("adding second change");
		
		System.out.println("Third change");
		
		
		List<Integer> al = new ArrayList<Integer>();
		al.add(8);
		al.add(9);
		al.add(10);
		al.add(8);
		al.add(9);
		al.add(10);
		for(Integer g:al)
		{
			System.out.println("values from arrayList-->"+ g);
		}
		 Collections.sort(al);
		 
		 
		System.out.println("sorted arrayList-->"+ al);
		Set<Integer> set8 = new HashSet<Integer>(al);
		
		System.out.println("after duplicates are removed:-->"+ set8);
		
		Iterator itAr = al.iterator();
		while(itAr.hasNext())
		{
			System.out.println("values from arrayList through iterator-->"+ itAr.next());
		}
		
		
		
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		hMap.put(10, "Jyoti");
		hMap.put(20, "Aarish");
		hMap.put(30, "Ranu");
		
	  Set set1 = hMap.keySet();
	  Set set2=hMap.entrySet();
	  
	  Iterator itr = set1.iterator();
	  Iterator itr2 = set2.iterator();
	  
	  for(Map.Entry<Integer, String> m : hMap.entrySet())
	  
	  {
		  System.out.println("key is-->"+ m.getKey() + " and value is-->"+ m.getValue());
		  
	  }
	  
	  Set<String> set5 = new HashSet<String>();
	  set5.add("uber");
	  set5.add("OLA");
	  set5.add("zibco");
	  
	  for(String cab:set5)
	  {
		  System.out.println("Cab type->"+cab);
	  }
	  
	  Iterator cabItr = set5.iterator();
	  while(cabItr.hasNext())
	  {
		  
		  System.out.println("cab iterator values-->"+ cabItr.next());
		 
	  }
	  
	  Set<String> TSCab = new TreeSet<String>(set5);
	  System.out.println("values from treeset-->"+TSCab);
	  System.out.println("values from set-->"+set5);
	  
	  
	 /* while(itr2.hasNext())
	  {
		  
		 // System.out.println("keys are" + itr.next());
		  System.out.println("values are "+itr2.next());
		  
	  }
	  */
	 
	  }
		
		
		
	

		
		
		
	}


