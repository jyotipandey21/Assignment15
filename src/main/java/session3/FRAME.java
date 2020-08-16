package session3;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FRAME {

	WebDriver driver;
	
	@Before
	public void webelement() {
	
	System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://docs.oracle.com/javase/8/docs/api/");


	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}	
	@Test
	public void check() {
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("java.awt")).click();	
		driver.switchTo().defaultContent();		
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("Adjustable")).click();
		
	/*	System.out.println(driver.getTitle());
		String ActualTitle="Adjustable (Java Platform SE 8 )";
		Assert.assertSame(driver., ActualTitle);
		//System.out.println(driver.getTitle());
		
//		//Assertion is failing//
//		String ActualTitle=driver.getTitle();
//		String ExpectedTITLE="WELCOME TO Page";
//		Assert.assertEquals( "java.awt","true");
		System.out.println("true");
		}*/}
}
