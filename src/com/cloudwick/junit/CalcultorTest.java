package com.cloudwick.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalcultorTest {

	Calculator obj;
	
	@Before
	public void setUp() throws Exception {
		obj = new Calculator();
		
		
	}

	@After
	public void tearDown() throws Exception {
		
		obj=null;
		
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		int data = obj.calculate(3,24);
		assertEquals(data,27);
		assertNotNull(data);
	}

}
