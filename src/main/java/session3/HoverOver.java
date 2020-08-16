package session3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver {
	WebDriver driver;

	@Before
	public void webelement() {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dell.com/en-us");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test
	public void test() {

		WebElement PRODUCTS_MENU_LOCATOR = driver.findElement(By.xpath("//*[@id=\"l1\"]"));
		WebElement MONITOR_MENU_LOCATOR = driver.findElement(By.xpath("//*[@id=\"l1_6\"]/span"));
//		WebElement MONITOR_FOR_HOME_LOCATOR = driver
//				.findElement(By.xpath(("//*[@id=\"dell-masthead\"]/div[3]/nav/ul/li[1]/ul/li[10]/ul/li[1]/a/img")));
		WebElement MONITOR_FOR_HOME_LOCATOR=driver.findElement(By.xpath(("//*[@id=\"category-bar\"]/div[4]/div\"]")));
		
		Actions action = new Actions(driver);
		action.moveToElement(PRODUCTS_MENU_LOCATOR).build().perform();
		action.moveToElement(MONITOR_MENU_LOCATOR).build().perform();	
		
		//WebElement MONITOR_FOR_HOME_LOCATOR=driver.findElement(By.xpath(("//*[@id=\"category-bar\"]/div[4]/div\"]")));
		 driver.switchTo().frame(MONITOR_FOR_HOME_LOCATOR);
		action.click(MONITOR_FOR_HOME_LOCATOR).click();
		
		
       //action.moveToElement(MONITOR_FOR_HOME_LOCATOR).build().perform();
//		driver.findElement(By.xpath("//iframe[@name='destination_publishing_iframe_dell_0_name']"));
		

	}
}