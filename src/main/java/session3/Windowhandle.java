package session3;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.AfterMethod;

//import techfios.webdriver;



public class Windowhandle {
	
	private static final String priority2 = null;
	WebDriver driver;
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@Test
 public void browser() {
	 System.out.println(driver.getTitle());
	// System.out.println(driver.getWindowHandle());
	 
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("sql interview question");
	 Actions act= new Actions(driver);
	 act.sendKeys(Keys.ENTER).build().perform();
	 driver.findElement(By.xpath("//h3[contains(text(),'SQL Interview Questions CHEAT SHEET (2020) - InterviewBit')]")).click();
	 

	 System.out.println(driver.getWindowHandle());
	
	 for(String i :driver.getWindowHandles()) {
			System.out.println(i);
			driver.switchTo().window(i);
	 
	 }
	 
	 
		/*
		 * String Actual_title ="InterviewBit Academy is now Scaler Academy!";
		 * 
		 * String expected_title=driver.findElement(By.xpath("//span[contains(text(),'InterviewBit Academy is now Scaler Academy!')]")).getText();
		 *
		 *  Assert.assertEquals(expected_title, Actual_title);
		 * System.out.println("good");
		 *  String Actual_title1 ="Sign Up"; String
		 * expected_title1=driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]")).getText();
		 *  Assert.assertEquals(expected_title, Actual_title);
		 * System.out.println("did");
		 * 
		 * WebDriverWait wait =new WebDriverWait(driver,30);
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Start learning CSS now »')]")));
		 * driver.findElement(By.xpath("//a[contains(text(),'Start learning CSS now »')]")).click();
		 */}
//    	String dashboardvalidationtext=driver.findElement(dashboard).gettext();
//   	Assert.assertEquals(expected, actual,message);
//	    }
	


/*
 * @Test(priority2) public void test2() {
 * 
 * 
 * } public void waitelement(webdriver driver,int timeinsec,locator){ WebDribver
 * wait wait=new Webdriverwait(driver,3);
 * wait.until(ExpectedConditions.visibilityofEllementlocated(dashboard);}
 * 
 * 
 * 
 * }
 * 
 * @AfterMethod public void teardown() { driver.close(); driver.quit(); }
 */
	 
	 
	 
	 
	 
	 
 }

	


	
	
	
	
	
	
	
	
	
