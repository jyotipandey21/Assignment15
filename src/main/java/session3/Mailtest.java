package session3;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mailtest {

	WebDriver driver;

 @Before
public void test() {
	System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.objectspy.com/register/signup.php");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}
 @Test
	public void test1() throws InterruptedException {
	 driver.findElement(By.name("email")).sendKeys("jyotipan21@gmail.com");
	 driver.findElement(By.name("password")).sendKeys("bhagwan21");
	 
	 Actions action = new Actions(driver);
	 action.sendKeys(Keys.ENTER).build().perform();
	 
	 JavascriptExecutor js=( JavascriptExecutor)driver;
	 Thread.sleep(2000);
	 js.executeScript("scroll(0,2000)");
		
	}

   //we use Actions when we have to perform click,drag and drop or double click//

}
