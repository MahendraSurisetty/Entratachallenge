import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class tc1 {
	 WebDriver driver;

	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void verifyTitle() throws InterruptedException {
		driver.get("https://www.entrata.com");
		driver.manage().window().maximize();
		WebElement popup = driver.findElement(By.xpath("/html/body/div[3]/div[2]/a[1]"));
		popup.click();
		Thread.sleep(5000);
		String pageTitle = driver.getTitle();
		String expectedTitle = "Property Management Software | Entrata";
		assertEquals(pageTitle, expectedTitle, "Page title does not match!");
	}

	@AfterClass
	public void tearDown() {
		driver.quit();

	}
}
