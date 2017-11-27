package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacter {

	public static void main(String[] args) {
		
		String s = "JyotiPrakashJena";
		List ll = new ArrayList();
		
		
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
		
		

	}

}
