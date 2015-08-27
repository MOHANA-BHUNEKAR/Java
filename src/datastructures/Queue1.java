package datastructures;


import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue1 {

	public static void main(String[] args) {

		Queue<String> qu = new PriorityQueue<String>();
		qu.add("a");
		qu.add("d");
		qu.add("c");
		qu.add("b");
		qu.add("e");
		/*qu.add("s");
		qu.add("d");
		qu.add("a");
		qu.add("k");
		qu.add("l");
		qu.add("m");
		qu.add("z");
		qu.add("y");
		*/
		//qu.poll();
	//	String s= qu.peek();
	//	System.out.println("peek:  "+s);
		
	//	System.out.println(qu.peek());
	//	System.out.println(qu.peek());
//	System.out.println("remove: "+qu.remove("c"));

	

	System.out.println("pool:"+qu.poll());
	
	System.out.println("element: "+qu.element());

		Iterator il = qu.iterator();
		
		while(il.hasNext())
		{
			
			System.out.print(il.next()+" ");
		}
		
System.out.println(qu);		
	}

}
