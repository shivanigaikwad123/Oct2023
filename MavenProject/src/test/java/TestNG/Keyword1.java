package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Keyword1 {

	@BeforeClass
	public void beforeClass() {
	
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	
	//priority keyword is use to maintain the execution sequence of test method
	//if priority of 2 or more test method is  same then execution in between that method will be depends on
	// alphabetical order of method name 
	
	@Test		(priority=1)								//**
	public void test1()
	{
		
		System.out.println("Test 1");
	}
	
	@Test			(priority=22)									//**
	public void test2()
	{
		
		System.out.println("Test 2");
	}
	
	@Test		(priority=0)											//**
	public void test3()
	{
		
		System.out.println("Test 3");
	}
	
	@Test		(priority= -13)												//**
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
