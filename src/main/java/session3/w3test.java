package session3;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class w3test {
	
	WebDriver driver;


@Before
public void test() {
	System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe" );
	driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/");
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}
@Test
public void school() throws InterruptedException {
	driver.findElement(By.xpath("//a[@id='navbtn_tutorials']")).click();
	
	driver.findElement(By.xpath("//*[@id=\"nav_tutorials\"]/div/div[2]/a[9]")).click();
	driver.findElement(By.xpath("//a[@id='topnavbtn_tutorials']")).click();
	
	driver.findElement(By.cssSelector("#nav_tutorials > span")).click();
	
	driver.findElement(By.name("ex1")).sendKeys("System");
	driver.findElement(By.name("ex2")).sendKeys("out");
	driver.findElement(By.name("ex3")).sendKeys("println");
	//Thread.sleep(2000);
	driver.findElement(By.cssSelector("#w3-exerciseform > div > button")).click();
	//driver.findElement(By.xpath("//button[contains(@text,'submit')]")).click();
}
}
