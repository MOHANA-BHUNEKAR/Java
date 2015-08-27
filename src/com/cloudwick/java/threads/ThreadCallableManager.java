package com.cloudwick.java.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadCallableManager {

	public static void main(String[] args) throws InterruptedException {

		
		ExecutorService service=Executors.newFixedThreadPool(10);
		
		List<Future> datalist = new ArrayList<Future>();
		for(int i=0;i<501;i++)
		  {
			  CounterCallableThread obj = new CounterCallableThread(1000000+i);
		Future<Long> value =  service.submit(obj);
datalist.add(value);	

System.out.println(i);
		  
		  }
		
		for(Future data: datalist)
		{
			
			try {
				System.out.println(data.get());
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		service.shutdown();
		
		do {
			
			
		} while(! service.isTerminated());
		System.out.println("All threads are done");
		
	}

}
