package datastructures;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeeMapp {

	public static void main(String[] args) {

		
		Map<Integer,String> mp = new TreeMap<Integer,String>();
		
		
		mp.put(11,"6");
		mp.put(7, "7");
		mp.put(12,"7");
		mp.put(8, "8");
		mp.put(1,"1");
		mp.put(2, "2");
		mp.put(3,"3");
		mp.put(4, "4");
		mp.put(6,"5");
	System.out.println(mp.put(6, "6"));
		System.out.println("Key"+"\t"+"value");
		for(Entry<Integer, String> e : mp.entrySet())
		{
			System.out.println(e.getKey()+"\t"+e.getValue());
			
		}
	}

}
