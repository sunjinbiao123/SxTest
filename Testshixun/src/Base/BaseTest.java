package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {	
	public static WebDriver driver;

	@BeforeMethod
	public void initBrowser() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C://Demo/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://localhost/index.php/admin");
		Thread.sleep(2000);
		driver.findElement(By.name("user")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("login_submit")).click();
	}

	
	@AfterMethod
	public void close() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
