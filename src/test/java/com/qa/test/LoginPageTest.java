package com.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest {

	
@BeforeMethod
	
	public void loginPageBM()
	{
		
		System.out.println("loginPageBM Before Method");
		
	}
	
	@Test
	
	public void test4() 
	{
		
		System.out.println("Test4");
	}

	
    @AfterMethod
	
	public void LoginPageAfterMethod()
	{
		
		System.out.println("LoginPageAfterMethod AfterMethod");
	}
	




}
