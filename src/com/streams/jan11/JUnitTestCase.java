package com.streams.jan11;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JUnitTestCase 
{
	@Test
	public void isPresent()
	{
		EmployeeExistOrNot existOrNot = new EmployeeExistOrNot();
		long exist = existOrNot.isExist("Ram");
		assertEquals(exist,1);
	}
}
