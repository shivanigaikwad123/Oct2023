package TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KeywordDependsopmethod {

	
	
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
		
		
		@Test		(priority=2)								//**
		public void test1()
		{
			
			System.out.println("Test 1");
		}
		
		//test3 is depends on method test4
		// test3 will be execute if test4 is passed
		// test3 will be SKIPS If tested is failed
		
									
		@Test			(priority=0,dependsOnMethods = {"test4"} )								//**
		public void test2()			
		{
			
			System.out.println("Test 2");
		}
		
		@Test		(priority=-1)											//**
		public void test3()
		{
			
			System.out.println("Test 3");
			Assert.fail();   // test fail
		}
		
		@Test		(priority= 3)												//**
		public void test4()
		{
			
			System.out.println("Test 4");
			Assert.fail();   // test fail
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
}


