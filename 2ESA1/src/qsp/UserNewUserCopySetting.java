package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class UserNewUserCopySetting {
	static {

		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\2ESA1\\driver\\chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("(//div[contains(.,'Login')])[3]")).click();
		driver.findElement(By.xpath("//div[@id='container_users']")).click();
		driver.findElement(By.xpath("(//div[contains(.,'New User')])[5]")).click();
		WebElement click = driver.findElement(By.xpath("(//input[@placeholder='First Name'])[3]"));
		JavascriptExecutor jExecutor=(JavascriptExecutor)driver;
		jExecutor.executeScript("arguments[0].click();", click);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@placeholder='First Name'])[3]")).sendKeys("saaa"); //element hidden provide manually
		driver.findElement(By.xpath("(//input[@placeholder='Last Name'])[3]")).sendKeys("stg");
		driver.findElement(By.xpath("(//input[@placeholder='Email'])[3]")).sendKeys("sgtrd@gmail.com");
		driver.findElement(By.xpath("(//div[@class='selectorPlaceholder'])[2]")).click();
		driver.findElement(By.xpath("(//div[contains(.,'Quality Control')])[32]")).click();
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[4]")).click();
		driver.findElement(By.xpath("(//span[contains(.,'22')])[2]")).click();
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='x-menu-item'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[contains(.,'Copy settings from')])[26]")).click();
		driver.findElement(By.xpath("(//span[contains(.,'Meyers, Allison')])[3]")).click();
		driver.findElement(By.xpath("(//div[contains(.,'Save & Send Invitation')])[12]")).click();
		driver.findElement(By.xpath("(//span[contains(.,'OK')])[4]")).click();
		
}
}