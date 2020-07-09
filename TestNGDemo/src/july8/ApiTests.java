package july8;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class ApiTests {
	
	
	@BeforeGroups ("api")
	public void setUpGroups() {
		System.out.println("Send request to test endpoint and verify the status code");
	}
	
	@AfterGroups ("api")
	public void teardownGroups() {
		System.out.println("Teardown actions");
	}
	
	
	@Test (groups = {"api"})
	public void testCase1API() {
		System.out.println("Test case 1 API");
	}
	
	
	@Test (groups = { "api"})
	public void testCase2API() {
		System.out.println("Test case 2 API");
		
		
	}
	
	@Test (groups = { "api"})
	public void testCase3API() {
		System.out.println("Test case 3 API");
		
		
	}

}
