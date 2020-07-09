package july8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	
	
	@Test
	@Parameters ({"browser"})
	public void login(String browser) {
		WebDriver driver = null;
		
		switch(browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
			
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Duotech\\Downloads\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
			
			
		case "edge":
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Duotech\\Downloads\\drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
			break;
			
			
		}
		
		
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		
		driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
		driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test" + Keys.ENTER);
		
		driver.quit();
		
	}

}
