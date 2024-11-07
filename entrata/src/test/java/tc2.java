import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tc2 {
	WebDriver driver;

	@BeforeTest
	public void beforeTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.entrata.com/b");
		driver.manage().window().maximize();
		WebElement popup = driver.findElement(By.xpath("/html/body/div[3]/div[2]/a[1]"));
		popup.click();
		Thread.sleep(5000);
	}

	@Test
	public void f() throws InterruptedException {
//		WebElement management = driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[3]/div[1]/div[1]/a[1]"));
//		management.click();
//		Thread.sleep(5000);
//		WebElement demo = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/a[1]"));
//		demo.click();
//		Thread.sleep(5000);

		WebElement fname = driver.findElement(By.name("FirstName"));
		fname.clear();
		fname.sendKeys("FirstName");
		Thread.sleep(2000);
		WebElement lname = driver.findElement(By.name("LastName"));
		lname.clear();
		lname.sendKeys("LastName");
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.name("Email"));
		email.clear();
		email.sendKeys("sample@gmail.com");
		Thread.sleep(2000);
		WebElement cname = driver.findElement(By.name("Company"));
		cname.clear();
		cname.sendKeys("NA");
		Thread.sleep(2000);
		WebElement phno = driver.findElement(By.name("Phone"));
		phno.clear();
		phno.sendKeys("9876543210");
		Thread.sleep(2000);

		WebElement unit = driver.findElement(By.id("Unit_Count__c"));
		unit.click();
		Thread.sleep(2000);
		WebElement unitq = driver.findElement(By.xpath(
				"/html/body/section[1]/div[8]/div/div/div[2]/div[1]/form/div[13]/div[1]/div[2]/select/option[3]"));
		unitq.click();
		Thread.sleep(3000);
		WebElement title = driver.findElement(By.name("Title"));
		title.clear();
		title.sendKeys("Student");
		Thread.sleep(3000);

		WebElement lopt = driver.findElement(By.id("demoRequest"));
		lopt.click();
		Thread.sleep(2000);
		WebElement opt = driver.findElement(By.xpath(
				"/html/body/section[1]/div[8]/div/div/div[2]/div[1]/form/div[15]/div[1]/div[2]/select/option[3]"));
		opt.click();
		Thread.sleep(5000);

	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
