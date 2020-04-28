import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static WebDriver driver;

	@BeforeSuite
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@Test
	public void doLogin() {

		driver.get("http://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("divyapeddakotla@gmail.com");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		System.out.println(driver.getTitle());
		System.out.println("Hello");
		System.out.println("Hi");
		System.out.println("How r u");
		System.out.println("Made chandes in develop branch");
		
	}


	@AfterSuite
	public void tearDown() {

		driver.quit();

	}

}
