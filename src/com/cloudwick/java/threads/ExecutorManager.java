package com.cloudwick.java.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorManager {

	public static void main(String[] args) {

		
	ExecutorService service=Executors.newFixedThreadPool(10);
	
	for(int i=0;i<501;i++)
	  {
		  CounterThread obj = new CounterThread(1000000+i);
		  service.execute(obj);
		//  System.out.println("hi: "+i);
	}

	service.shutdown();
	
	do {
		
		
	} while(! service.isTerminated());
	System.out.println("All threads are done");
}}
