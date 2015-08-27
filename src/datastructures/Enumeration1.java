package datastructures;

import java.util.*;

public class Enumeration1 {

	public static void main(String[] args) {

		java.util.Enumeration e; // Used to iterate elements in a collection
		
		Vector v = new Vector(); //java.util
		
		v.add("a");
		v.add(0,"b");
		v.add("c");
		
		System.out.println(v.add("a"));
		v.add("d");
		v.add("e");
		v.add("f");
		
		e = v.elements();
		
		while(e.hasMoreElements())
		{
			
			System.out.println(e.nextElement());
		}
		
	}

}
