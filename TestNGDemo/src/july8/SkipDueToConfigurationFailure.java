package july8;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SkipDueToConfigurationFailure {
	
WebDriver driver;
	
	@BeforeClass
	public void initializeDriverAndGoToUrl() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/adminz");
		assertTrue(driver.getTitle().equals("Administrator Login"));
		
	}
	
	
	
	
	
	@Test (alwaysRun = true) // it won't run in the case of Configuration failure in @Before methods
	public void positiveLogin() {
			
		 		
		//Type in correct Email Address and Password
		
		driver.findElement(By.name("email")).sendKeys("admin@phptravels.com");
		driver.findElement(By.name("password")).sendKeys("demoadmin");
		//Click login button
		driver.findElement(By.xpath("//span[.='Login']")).click();
		//Add explicit wait for title
		new WebDriverWait(driver, 10).until(ExpectedConditions.titleIs("Dashboard"));

		//Verify successful login
		assertEquals(driver.getTitle(), "Dashboard");
		assertTrue(driver.getTitle().contains("Dashboard"));
		//assertFalse(condition);
		
	
	}
	
	@Test 
	public void verifyUserDetails() {
		System.out.println("Verifying user details");
	}
	
	
	@Test 
	public void verifyUserPhoto() {
		
	}


}
