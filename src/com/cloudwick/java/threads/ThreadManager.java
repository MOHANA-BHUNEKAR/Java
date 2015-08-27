package com.cloudwick.java.threads;

import java.util.ArrayList;
import java.util.List;

public class ThreadManager {

	public static void main(String[] args) throws InterruptedException {

		
		List<Thread> threadlist = new ArrayList<Thread>();
	  for(int i=1;i<501;i++)
	  {
		  CounterThread obj = new CounterThread(1000000+i);
		  
		  obj.setName("cloudwick"+i);
		  
		//  if(i>50 && i<101)
		//	  obj.setPriority(Thread.MAX_PRIORITY);
		  obj.start();
		//  obj.join();
		  threadlist.add(obj);
	  }
	  
	  int running=0;
	  do
	  {
		   running=0;
		  
		  for(Thread thread: threadlist)
		  {
			  if(thread.isAlive())
			  {
				  
				  running++;
			  }
		  }
		  
	  }  while(running !=0);
		  
	  
		
	  System.out.println("All threads are done");
		
	}

}
