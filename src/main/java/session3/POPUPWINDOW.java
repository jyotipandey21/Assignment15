package session3;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POPUPWINDOW {

	WebDriver driver;

	@Before
	public void webelement() {

		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test
	public void test() throws InterruptedException {
		driver.findElement(By.xpath("//html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id='OKTab']/button")).click();
		// driver.findElement(By.xpath(""//html/body/div[1]/div/div/div/div[2]/div[1]/button")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//html/body/div[1]/div/div/div/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//html//body/div[1]/div/div/div/div[2]/div[2]/button")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//html/body/div[1]/div/div/div/div/ul/li[3]/a")).click();
		driver.findElement(By.xpath("html/body/div[1]/div/div/div/div/div[3]/button")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("jyoti");
		
		driver.switchTo().alert().accept();
		
		driver.switchTo().frame("Frames");
		
		
	}
}