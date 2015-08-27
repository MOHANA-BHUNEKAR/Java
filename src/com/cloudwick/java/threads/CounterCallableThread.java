package com.cloudwick.java.threads;

import java.util.concurrent.Callable;

public class CounterCallableThread implements Callable<Long> {
	
	
	private long counter;
	
	public CounterCallableThread(int num)
	{
		
		this.counter=num;
		
		
	}
	
	public void run()
	{
		System.out.println(counter-1000000);

	long sum=0;
		for(int i=1;i<=counter;i++)
		{
			
			sum=sum+i;
		}
		
		System.out.println(sum+"---->  "+Thread.currentThread());
	}

	@Override
	public Long call() throws Exception {
		// TODO Auto-generated method stub
		long sum=0;
		for(int i=1;i<=counter;i++)
		{
			
			sum=sum+i;
		}
		return sum;
	}

}
