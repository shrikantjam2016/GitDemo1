package com.sele;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTests {
	@Test
	public void test1()
	{
		System.out.println("This is First test");
		Assert.assertTrue(false);
	}
	@Test
	public void test2()
	{
		System.out.println("This is second test");
		Assert.assertEquals(false, false);
	}
	
	@Test
	public void test3()
	{
		System.out.println("This is second test");
		Assert.assertEquals(false, true);
	}

}
