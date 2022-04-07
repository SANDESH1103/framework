package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TimeTrackReportedTime {
	static {

		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\2ESA1\\driver\\chromedriver.exe");
	}
	@Test
public void timeTrackReportedTime() {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("(//div[contains(.,'Login')])[3]")).click();
	driver.findElement(By.xpath("(//div[@class='task'])[2]")).click();
	 WebElement reportedTime = driver.findElement(By.xpath("//span[contains(.,'REPORTED TIME ')]"));
	JavascriptExecutor jecExecutor=(JavascriptExecutor)driver;
	jecExecutor.executeScript("arguments[0].click();",reportedTime);
	
}
}
