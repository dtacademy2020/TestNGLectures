package testngdemo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class DatabaseTests {
	
	
	@Test (groups = {"smoke", "db"})
	public void testCase1DB() {
		System.out.println("Test case 1 DB");
	}
	
	
	@Test (groups = { "db"})
	public void testCase2DB() {
		System.out.println("Test case 2 DB");
		
		
	}

}
