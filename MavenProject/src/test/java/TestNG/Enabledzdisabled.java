package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Enabledzdisabled {


	@BeforeClass
	public void beforeClass() {
	
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	
	 
	
	@Test		(priority=1)								//**
	public void test1()
	{
		
		System.out.println("Test 1");
		//Assert.fail();  //test fail
	}
	
	@Test			(priority=22,timeOut=3000)			//3000ms=3 sec						//**
	public void test2() throws InterruptedException
	{
		
		System.out.println("Test 2");
		Thread.sleep(5000);
		System.out.println("Hello");
		
		
	}
	
	@Test		(priority=0,enabled=true)											//**
	public void test3()
	{
		
		System.out.println("Test 3");
	}
	
	@Test		(priority= -13,enabled = false)												//**
	public void test4()
	{
		
		System.out.println("Test 4");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class");
	}
}

		

	


