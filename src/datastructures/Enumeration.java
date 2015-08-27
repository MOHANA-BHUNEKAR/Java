package datastructures;

import java.util.*;

public class Enumeration {

	public static void main(String[] args) {

		
		java.util.Enumeration en;
		
		Vector al = new Vector();
		
		al.add("ab");
		al.add("bc");
		al.add("bcd");

		al.add("ebc");

		al.add("fbc");
		
		en =al.elements();
		
		while(en.hasMoreElements())
		{
			
			System.out.println(en.nextElement());
			
		}

		
		
	}

}
