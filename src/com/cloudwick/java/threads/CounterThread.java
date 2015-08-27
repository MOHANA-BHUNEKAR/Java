package com.cloudwick.java.threads;

public class CounterThread extends Thread {
	
	
	private long counter;
	
	public CounterThread(int num)
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

}
