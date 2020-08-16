package session3;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollupandown {

	WebDriver driver;
	
	@Before
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://www.techfios.com/ibilling/?ng=admin/");
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	}
	@Test
	public void weblement() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;//casting when we want to change data type//
		js.executeScript("scroll(0,2000)");
			
			
	}
	
}     
