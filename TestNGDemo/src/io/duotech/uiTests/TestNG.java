package io.duotech.uiTests;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class TestNG {
	
	@Test
	public void testCase2() {
		System.out.println("Test case 2");
	}
	
	
	@Test
	public void testCase3() {
		System.out.println("Test case 3");
		
		assertTrue(false);
	}
	
	
	@Test
	public void positiveLogin() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		      
       
		driver.get("https://www.phptravels.net/admin");
		
			
		//Type in Email Address and Password
		
		driver.findElement(By.name("email")).sendKeys("admin@phptravels.com");
		driver.findElement(By.name("password")).sendKeys("demoadmin");
		//Click login button
		driver.findElement(By.xpath("//span[.='Login']")).click();
		//Add explicit wait for title
		new WebDriverWait(driver, 10).until(ExpectedConditions.titleIs("Dashboard"));

		//Verify successful login
		assertEquals(driver.getTitle(), "Dashboard");
		
	
	}
	

}
