package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnDynamicWebElements {
	
	WebDriver driver;
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver",
				"drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
	}
	@Test
	public void learnDifferentLocator() {
		
		//zn zn-homepage1-zone-1 zn-left-fluid zn--ordinary t-light zn-left-fluid-share zn-has-multiple-containers zn-has-3-containers zn-loaded zn-ondemand zn--idx-1		
	
	}
}
