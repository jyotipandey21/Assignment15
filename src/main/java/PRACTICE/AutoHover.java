package PRACTICE;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoHover {

	WebDriver driver;
	
	@Before
	public void  init() {
	
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe" );
		driver=new ChromeDriver();	
		driver.get("http://demo.automationtesting.in/Alerts.html");	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}
	@Test
	public void TestHover() throws InterruptedException {
		
		WebElement Switch_To_Locator=driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]"));
		
		WebElement Interaction_Locator=driver.findElement(By.xpath("//a[contains(text(),'Interactions')]"));	
		WebElement Drag_Drop_Locator=driver.findElement(By.xpath("//a[contains(text(),'Drag and Drop ')]"));
		WebElement Drag_Drop_Static_Locator=driver.findElement(By.xpath("//a[contains(text(),'Static ')]"));
		
		Actions action=new Actions(driver);
		action.moveToElement(Interaction_Locator).build().perform();
		action.moveToElement(Drag_Drop_Locator).build().perform();
		Thread.sleep(2000);
		action.moveToElement(Drag_Drop_Static_Locator).build().perform();
		//action.sendKeys(Keys.ENTER).build().perform();
	}
	
}