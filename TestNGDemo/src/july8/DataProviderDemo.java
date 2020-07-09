package july8;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	
	
	@Test (dataProvider = "presidents")
	
	public void search(String searchTerm) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duotech\\Downloads\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys(searchTerm + Keys.ENTER);
		
		assertTrue(driver.getTitle().contains(searchTerm));
		
		driver.quit();
		
		
	}
	
	
	@DataProvider (name = "presidents")
	
	public Object [][] get(){
		
		
		return new Object[][] {
			{"Laptop"},
			{"Phone"},
			{"Trump"},
			{"Путин"},
			{"أَلِفْ مَدَّة"},
			{"김"}
			
		};
	}

}
