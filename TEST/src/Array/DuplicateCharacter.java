package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacter {

	public static void main(String[] args) {
		
		String s = "JyotiPrakashJenadddd";
		List<String> ll = new ArrayList<String>();
		ll.add("hello");
		ll.add("hi");
		ll.add("welcome");
		
		// using forloop:
		System.out.println("using for loop");
		for(String lv : ll)
		{
			
			
			System.out.println(lv); 
		}
		
		// using iterator:
		
		Iterator<String> itr = ll.iterator();
		System.out.println("using for Iterator");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		char []chararr = s.toCharArray();
		
		Map<Character,Integer> hm1 = new HashMap<Character,Integer>();
		
		for(Character x: chararr)
		{
			
			if(!(hm1.containsKey(x)))
			{
				hm1.put(x, 1);
			}
			else 
			{
				hm1.put(x, hm1.get(x)+1 );
				
			}
		}
		
		for(Map.Entry<Character, Integer> m1: hm1.entrySet())
		{
			if(m1.getValue() > 1)
			{
				System.out.println("duplicate element-->" + m1.getKey() + "  and no. of occurence-->" + m1.getValue());
			}
			
		}
		
		
		int i,j;
		int k = 0;
		j=2;
		k=j=i=1;
		System.out.println("value of k: "+ k);
		
		

	}

}
