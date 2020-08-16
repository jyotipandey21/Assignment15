package session3;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFRAME {

	WebDriver driver;

	@Test
	public void webelement() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
      
		driver.switchTo().frame("SingleFrame");
		//driver.findElement(By.cssSelector("SingleFrame")).sendKeys("welcome");
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("jyoti");
	}

}
