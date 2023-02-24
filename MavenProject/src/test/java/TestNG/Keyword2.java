package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Keyword2 {

	@BeforeClass
	public void beforeClass() {
	
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	
	// invocationCount is used to repeat the test  method multiple time 
	// default  invocationCount =1
	
	@Test		(priority=2)								//**
	public void test1()
	{
		
		System.out.println("Test 1");
	}
								//invocationCount=3  ==repeat the test method multiple time
	@Test			(priority=0 ,invocationCount=1)			//default invocationcount						//**
	public void test2()
	{
		
		System.out.println("Test 2");
	}
	
	@Test		(priority=-1)											//**
	public void test3()
	{
		
		System.out.println("Test 3");
	}
	
	@Test		(priority= 3)												//**
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
