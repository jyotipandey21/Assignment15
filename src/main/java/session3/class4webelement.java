package session3;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class4webelement {

	WebDriver driver;

	@Before
	public void webelement() {

		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.yahoo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	@Test
  public void webtest() throws InterruptedException {
	System.out.println(driver.getTitle());	
	System.out.println(driver.getWindowHandle());
	
	driver.findElement(By.xpath("//input[@id='header-search-input']")).sendKeys("xpath");	
	driver.findElement(By.xpath("//button[@id='header-desktop-search-button']")).click();

	
	Thread.sleep(2000);
	driver.findElement(By.linkText("XPath Tutorial - W3Schools")).click();
 
	//System.out.println(driver.getWindowHandles());
for(String i: driver.getWindowHandles()) {
System.out.println(i);
driver.switchTo().window(i);
}
System.out.println("hi");
//System.out.println(driver.getTitle());
driver.findElement(By.linkText("CSS")).click();
System.out.println("hello");
}
}




