package session3;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class KEYBOARDACTION {
	WebDriver driver;

	@Before
	public void element() {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.techfios.com/ibilling/?ng=admin/"); 
				
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
	}

	@Test
	public void datatest() {

		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");

		// we are using Action class for keyboard press in keyword//
		Actions act= new Actions(driver);
		act.sendKeys(Keys.RETURN).build().perform();
		
		
	}
}

	
		
		

	




