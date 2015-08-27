package com.cloudwick.junit;

public class Calculator {
	
	public int calculate(int num1,int num2)
	{
		
		if(num1<5)
		return num1+num2;
		else if(num2<5)
		return num1-num2;
		else
		return num1*num2;
	}

}
