package datastructures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class List {

	public static void main(String[] args) {

		
	     ArrayList<String> al = new ArrayList<String>();	
	      al.add("12");
	      al.add("14");
	      al.add("19");

	      al.add("14");
	      al.add("15");
	      al.add("16");
	      al.add("17");
	      al.add("18");

	      al.add(2,"34");
	      System.out.println(al);
	      
	      Iterator iterator = al.iterator();
	      System.out.println(al.isEmpty());
	    System.out.println(al.getClass());
	    System.out.println("---"+al.indexOf("14"));
	    al.indexOf(2);
	      while( iterator.hasNext())
	      {
	    	  
	    	  System.out.println(iterator.next());
	      }
	      
	      
	      
	LinkedList<String> ll = new LinkedList<String>();
	ll.add("2");
	ll.add("3");
	ll.add(0, "4");
	
	  iterator = ll.iterator();
	
	  while( iterator.hasNext())
      {
    	  
    	  System.out.println(iterator.next());
      }
	}

}
