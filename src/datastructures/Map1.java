package datastructures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Map1 {

	public static void main(String[] args) {

		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		
		hm.put("a",1);
		hm.put("b",2);
		hm.put("c",3);
		hm.put("d",4);
		hm.put("e",5);
		hm.put("f",6);
		hm.put("g",7);
		hm.put("h",8);
		
	Integer a=	hm.get("a");
	System.out.println(a);
	
	System.out.println(hm.containsKey("d"));
	System.out.println(hm.containsKey("i"));
	System.out.println(hm.containsKey("g"));
	System.out.println(hm.containsKey("a"));
	System.out.println(hm.containsKey("n"));

	System.out.println(hm.containsValue(7));
	System.out.println(hm.containsValue(4));
	System.out.println(hm.containsValue(8));
	System.out.println(hm.containsValue(90));
	System.out.println(hm.containsValue(4));
	
	System.out.println(hm.entrySet());
	
	Set<String> s= hm.keySet();
	
	Iterator itt = s.iterator(); //iterator.next returns Object type
	
	while(itt.hasNext())
	{
		
		String key = (String) itt.next();
		System.out.print(" Key: "+ key+ "--------->");
		
		Integer value = hm.get(key);
		System.out.println("Value: "+ value);
		
	}
	
	 for(Entry<String, Integer> m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
	
	}

}
