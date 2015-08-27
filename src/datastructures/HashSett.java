package datastructures;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import com.sun.xml.internal.bind.v2.runtime.reflect.ListIterator;

public class HashSett {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		
		hs.add("3");
		hs.add("hi");
		hs.add("hello");

		hs.add("how");
		hs.add("are");
		hs.add("you");
	System.out.println(hs.add("hi"));
		hs.add("hi");

		System.out.println(hs);
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("hhi");
		java.util.ListIterator<String> lss = al.listIterator();
		
		LinkedHashSet<String> hs1 = new LinkedHashSet<String>();
		hs1.add("3");
		hs1.add("hi");
		hs1.add("hello");

		hs1.add("how");
		hs1.add("are");
		hs1.add("you");
	System.out.println(hs1.add("hi"));
		hs1.add("hi");

		TreeSet<String> hs2 = new TreeSet<String>();
		hs2.add("3");
		hs2.add("hi");
		hs2.add("hello");

		hs2.add("how");
		hs2.add("are");
		hs2.add("you");
	System.out.println(hs.add("hi"));
		hs.add("hi");

		
		Iterator ls = hs2.iterator();
		Iterator ls1 = hs.iterator();

		while(ls.hasNext())
		{
			
			System.out.println(ls.next());
		}
		
		System.out.println("--------------");
		while(ls1.hasNext())
		{
			
			System.out.println(ls1.next());
		}
	}

}
