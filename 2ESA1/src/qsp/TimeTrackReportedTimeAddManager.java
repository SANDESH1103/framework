package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TimeTrackReportedTimeAddManager {
	static {

		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\2ESA1\\driver\\chromedriver.exe");
	}
	@Test
public void timeTrackReportedTimeAddManager() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
    driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("(//div[contains(.,'Login')])[3]")).click();
	driver.findElement(By.xpath("(//div[@class='task'])[2]")).click();
	Thread.sleep(2000);
	WebElement managers = driver.findElement(By.xpath("(//span[@class='tabText'])[4]"));
	JavascriptExecutor jExecutor=(JavascriptExecutor)driver;
	jExecutor.executeScript("arguments[0].click();",managers );
	Thread.sleep(2000);
    driver.findElement(By.xpath("(//div[@class='assignUserButton components_button withPlusIcon'])[2]")).click();
	
	driver.findElement(By.xpath("(//span[@class='checkbox'])[6]")).click();
	driver.findElement(By.xpath("//span[contains(.,'Close')]")).click();
}
}