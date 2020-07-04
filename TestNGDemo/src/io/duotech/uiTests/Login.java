package io.duotech.uiTests;

import static org.testng.Assert.*;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Login {
	
	WebDriver driver;
	
	
	
	
	@BeforeSuite
	public void beforeSuite() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");

	
	}
	
	@BeforeMethod
	public void beforeMethod() {
		
		driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/admin");
		
	}
	
	
	
	
	
	@Test
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
	public void negativeLogin() throws InterruptedException {
			
		 		
		//Type in wrong Email Address and Password
		
		driver.findElement(By.name("email")).sendKeys("ad@phptravels.com");
		driver.findElement(By.name("password")).sendKeys("demo");
		//Click login button
		driver.findElement(By.xpath("//span[.='Login']")).click();
		
	
		Thread.sleep(3000);
		//Verify unsuccessful login
		assertEquals(driver.findElement(By.xpath("//div[.='Invalid Login Credentials']")).getText(), 
				"Invalid Login Credentials");
		
	
	}
	
	
	
	
	@AfterMethod
	
	public void teardownMethod() {
		driver.quit();
	}

}
