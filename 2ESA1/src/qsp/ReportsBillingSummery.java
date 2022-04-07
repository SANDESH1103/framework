package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReportsBillingSummery {
	static {

		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\2ESA1\\driver\\chromedriver.exe");
	}

	@Test
	public void reportsBillingSummery() throws InterruptedException {
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
		// driver.findElement(By.xpath("(//div[contains(.,'Configure Report
		// Parameters')])[8]")).click();
		driver.findElement(By.xpath("//div[@class='graphicButton dropdownButton createReportDropdownButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='x-menu-item'])[6]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//span[contains(.,'Generate HTML Report')])[3]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//div[contains(.,'Add to Dashboard')])[5]")).click(); // element hidden click it
																							// manually
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@placeholder='Enter Report Name'])[1]"))
				.sendKeys("Billing summery");
		driver.findElement(By.xpath("(//span[contains(.,'Save')])[1]")).click();
	}
}
