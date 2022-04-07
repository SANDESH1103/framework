package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReportsCreateChart {
	static {

		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\2ESA1\\driver\\chromedriver.exe");
	}

	@Test
	public void reportsCreateChart() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("(//div[contains(.,'Login')])[3]")).click();
		driver.findElement(By.xpath("//div[@id='container_reports']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(.,'Create Chart')]")).click();
		driver.findElement(By.xpath("(//div[contains(.,'Add to Dashboard')])[5]")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Enter Chart Name'])[1]")).sendKeys("sa");
		driver.findElement(By.xpath("(//span[contains(.,'Save')])[1]")).click();
		driver.findElement(By.xpath("(//div[contains(.,'Close')])[16]")).click();
}
}