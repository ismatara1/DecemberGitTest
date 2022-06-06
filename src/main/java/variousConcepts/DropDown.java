package variousConcepts;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	WebDriver driver;

	@Before
	public void init() {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://techfios.com/billing/?ng=login/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Test
	public void loginTest() {
		By USERNAME_LOCATOR = By.xpath("//input[@id='username']");
		By PASSWORD_LOCATOR = By.xpath("//input[@id='password']");
		By SIGNIN_BUTTON_LOCATOR = By.xpath("//button[@name='login']");
		By DASHBOARD_HEADER_LOCATOR = By.xpath("//span[contains(text(), 'Dashboard')]");
		By TRANSACTION_MENU_LOCATOR = By.xpath("//span[text()='Transactions']");
		By NEW_DEPOSIT_MENU_LOCATOR = By.xpath("//a[text()='New Deposit']");
     	By ADD_DEPOSIT_MENU_LOCATOR =By.xpath("//h5[contains(text(), 'Add Deposit')]");
		By ACCOUNT_DROPDOWN_LOCATOR =By.xpath("//Select[@id='account']");

		driver.findElement(USERNAME_LOCATOR).sendKeys("demo@techfios.com");
		driver.findElement(PASSWORD_LOCATOR).sendKeys("abc123");
		driver.findElement(SIGNIN_BUTTON_LOCATOR).click();

	// Assert.assertTrue("Dashboard page not found!!!",driver.findElement(DASHBOARD_HEADER_LOCATOR).isDisplayed());

		String dashboardHeaderText = driver.findElement(DASHBOARD_HEADER_LOCATOR).getText();
		System.out.println("dashboardHeaderText");
		Assert.assertEquals("Wrongpage", "Dashboard", dashboardHeaderText);
		
		driver.findElement(TRANSACTION_MENU_LOCATOR).click();
		driver.findElement(NEW_DEPOSIT_MENU_LOCATOR).click();
		
		String AddDepositText = driver.findElement(ADD_DEPOSIT_MENU_LOCATOR).getText();
		System.out.println(AddDepositText );
		Assert.assertEquals("wrongpage","Add Deposit", AddDepositText);
		
		Select sel = new Select(driver.findElement(ACCOUNT_DROPDOWN_LOCATOR));
	    sel.selectByVisibleText("Debit2");


		
		
		

	}
}
