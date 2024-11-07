import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class tc3 {

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

		WebElement ai = driver.findElement(By.xpath("/html/body/section[1]/div[5]/div/a/div/div/div/div"));
		ai.click();
		Thread.sleep(3000);
		WebElement login = driver.findElement(By.xpath("/html/body/div[1]/div/a"));
		login.click();
		Thread.sleep(3000);
		WebElement email = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]"));
		email.clear();
		email.sendKeys("sample@gmail.com");
		
		Thread.sleep(3000);
				

	}
	
	@AfterTest
	public void afterTest() {
		
		driver.quit();
	}

}
