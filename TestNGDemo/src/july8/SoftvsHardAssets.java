package july8;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftvsHardAssets {
	
	
	
	@Test
	public void testCase1() {
		
		SoftAssert sa = new SoftAssert();
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/admin");
	    sa.assertEquals(driver.getTitle(), "Administrator Login");
		
		driver.findElement(By.name("email")).sendKeys("admin@phptravels.com");
		driver.findElement(By.name("password")).sendKeys("demoadmin");
		//Click login button
		driver.findElement(By.xpath("//span[.='Login']")).click();
		//Add explicit wait for title
		new WebDriverWait(driver, 10).until(ExpectedConditions.titleIs("Dashboard"));

		//Verify successful login
		sa.assertEquals(driver.getTitle(), "Dashboar");
		
		System.out.println("Title verified");

		
		sa.assertTrue(driver.getPageSource().contains("Hi Admin!"));
		
		
		sa.assertAll(); //
		
		System.out.println("After assertAll");
		
		assertTrue(driver.getPageSource().contains("Hi Admi!"));
		
		
	}
	

}
