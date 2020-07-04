package io.duotech.uiTests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestOrder {
	
	@BeforeSuite
	public void setUpBeforeEachTestSuite() {
		System.out.println("Before test suite");
		
	}
	
	@AfterSuite
	public void tearDownAfterEachTestSuite() {
		System.out.println("After test suite");
		
	}
	
	@BeforeTest
		public void setUpBeforeEachTestModule() {
		System.out.println("Before test module");
		
	}
	
	
	@AfterTest
	public void tearDownAfterEachtestModule() {
		System.out.println("After test module");
		
	}
	
	
	@BeforeClass
	public void setUpBeforeEachClass() {
		System.out.println("Before class");
		
	}
	
	@AfterClass
	public void tearDownAfterEachClass() {
		System.out.println("After class");
		
	}
	
	
	@BeforeMethod
	public void setUpBeforeEachMethod() {
		System.out.println("Before method -Logging in");
		
	}
	
	@AfterMethod
	public void tearDownAfterEachMethod() {
		System.out.println("After method - Quitting the driver");
		
	}
	
	
	@Test
	public void test1() {
		System.out.println("Doing test1 actions");
		
	}
	
	
	@Test
	public void test2() {
		System.out.println("Doing test2 actions");
		
	}
	

}
