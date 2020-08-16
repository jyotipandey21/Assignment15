package session3;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ALERTPOP {

	WebDriver driver;

	@Before
	public void element() {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test
	public void webelement() {
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		driver.switchTo().alert().accept();
		
		
		//for get text we create string//
		//String alertMessage = driver.switchTo().alert().getText();// string variable created//switchto and alert//
		//System.out.println(alertMessage);
		

	}
}
