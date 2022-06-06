package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlertPop {
	
	WebDriver driver;
	
	@Before
	public void init() {
		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi\r\n");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
			}
	@Test
	public void alertTest() throws InterruptedException {
		By SIGNIN_BUTTON_LOCATOR = By.xpath("//input[@value='Sign in']");
		driver.findElement(SIGNIN_BUTTON_LOCATOR).click();
		
		Thread.sleep(2000);
		String alertMsg =driver.switchTo().alert().getText();
		
		driver.switchTo().alert().accept();
      
		System.out.println(alertMsg);
		
	}
	
	

}
