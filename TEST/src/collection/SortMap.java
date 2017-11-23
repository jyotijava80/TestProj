package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Comparator;
import java.util.Map.Entry;


public class SortMap {
	
	public static void main(String args[])
	{
	Map<Integer,String> student = new HashMap<Integer,String>();
	student.put(10, "sam");
	student.put(15, "brent");
	student.put(5, "robert");
	
	List<Entry<Integer, String>> studentList = new ArrayList<Entry<Integer,String>>();
    for(Entry<Integer, String> e1:student.entrySet())
    {
    	studentList.add(e1);
    	
    }
	
    System.out.println(studentList);
	
    // sort by values:
    
   
    Collections.sort(studentList, new Comparator<Entry<Integer, String>>()
    		{
    	
    		public int compare(Entry<Integer, String> obj1,Map.Entry<Integer, String> obj2)
    		{
    			
    			return (obj1.getValue().compareTo(obj2.getValue()));
    		}
    		}
    
    		
    		);
    
    // use the insertion order by help of linkedHashmap
    
    Map<Integer,String> sortedMap = new LinkedHashMap<Integer, String>();
    
    for(Map.Entry<Integer, String> a1:studentList)
    {
    	sortedMap.put(a1.getKey(), a1.getValue());
    }
    
    System.out.println("Sorted Map>>>>"+ sortedMap);
    
    
    
   /* Collections.sort( studentList, new Comparator<Map.Entry<Integer,String>>()
            {
                public int compare( Entry<Integer,String> o1, Map.Entry<Integer,String> o2 )
                {
                    return (o1.getValue()).compareTo( o2.getValue() );
                }
            } );*/

    System.out.println(studentList);
    
    for(Map.Entry<Integer, String> sortValue: studentList)
    {
    	System.out.println("key is-->"+sortValue.getKey()+ "    value is-->"+sortValue.getValue());
    }

	}
	

}
