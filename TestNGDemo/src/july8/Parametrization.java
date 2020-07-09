package july8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrization {
	
	
	@Test
	@Parameters ({"url", "username", "pass"})
	public void login( String URL,  String USR,  String PASS) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get(URL);
		
		driver.findElement(By.name("ctl00$MainContent$username")).sendKeys(USR);
		driver.findElement(By.name("ctl00$MainContent$password")).sendKeys(PASS + Keys.ENTER);
		
	}

}
