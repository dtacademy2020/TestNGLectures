package july8;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class DatabaseTests {
	
	
	@BeforeGroups ("db")
	public void setUpGroups() {
		System.out.println("Open connection to DB");
	}
	
	
	@Test (groups = { "db"})
	public void testCase1DB() {
		System.out.println("Test case 1 DB");
	}
	
	
	@Test (groups = { "db"})
	public void testCase2DB() {
		System.out.println("Test case 2 DB");
		
		
	}
	
	@Test (groups = { "db"})
	public void testCase3DB() {
		System.out.println("Test case 3 DB");
		
		
	}

}
