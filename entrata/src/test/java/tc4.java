import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class tc4 {
	WebDriver driver;

	@BeforeTest
	public void beforeTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.entrata.com/b");
		driver.manage().window().maximize();
		WebElement popup = driver.findElement(By.xpath("/html/body/div[3]/div[2]/a[1]"));
		popup.click();
		Thread.sleep(2000);
	}

	@Test
	public void f() throws InterruptedException {
		WebElement optimization = driver
				.findElement(By.xpath("/html/body/section[1]/div[5]/div/div/a[6]/div/div[1]/div/div"));
		optimization.click();
		Thread.sleep(2000);

		WebElement button = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/div[2]/a/div"));
		String text = button.getText();
		String expectedText = "Learn More";
		assertEquals(text, expectedText, "Button text does not match!");

	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
