package july3;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


 //@Test  annotations can be applied to a class
public class TestOrder {
	
	
	
	@Test (priority = 0, enabled = false)
	 public void dTest() {
		System.out.println("d test");
	} 
	
	
	@Ignore
	 public void gTest() {
		System.out.println("g test");
	} 
	
	
	@Test (priority = 10, alwaysRun = true)
	 public void aTest() {
		System.out.println("a test");
	} 
	
	
	@Test (priority = 20, description = "This test will check the API response", groups = {"smoke"})
	 public void zTest() {
		System.out.println("z test");
	} 
	
	
	@Test (priority = 1000)
	 public void xTest() {
		System.out.println("x test");
	} 

}
