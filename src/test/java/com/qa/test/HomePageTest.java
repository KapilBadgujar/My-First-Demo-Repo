package com.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest {
	
@BeforeMethod
	
	public void setup()
	{
		
		System.out.println("Before Method");
		
	}
	
	@Test (priority=2)
	
	public void test2() 
	{
		
		System.out.println("Test2");
	}
	
	@Test (priority=1)
	
	public void test1() 
	{
		
		System.out.println("Test1");
	}
	
	@Test (priority=3, enabled=false)
	
	public void test3() 
	{
		
		System.out.println("Test3");
	}
	
	@AfterMethod
	
	public void delete()
	{
		
		System.out.println("AfterMethod");
	}



}
