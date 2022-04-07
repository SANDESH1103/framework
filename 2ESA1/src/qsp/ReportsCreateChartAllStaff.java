package qsp;

import java.time.Duration;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class ReportsCreateChartAllStaff {
	static {

		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\2ESA1\\driver\\chromedriver.exe");
	}

	@Test
	public void reportsCreateChartAllStaff() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("(//div[contains(.,'Login')])[3]")).click();
		driver.findElement(By.xpath("//div[@id='container_reports']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(.,'Create Chart')]")).click();
		driver.findElement(By.xpath("(//span[contains(.,'All Staff')])[6]")).click();
		driver.findElement(By.xpath("//label[contains(.,'Selected Staff')]")).click();
		driver.findElement(By.xpath("(//span[@class='checkbox'])[1]")).click();
		driver.findElement(By.xpath("(//span[contains(.,'Apply')])[1]")).click();
		Thread.sleep(5000);
		/*
		 * WebElement export =
		 * driver.findElement(By.xpath("(//span[contains(.,'Export to PDF')])[1]"));
		 * JavascriptExecutor jExecutor=(JavascriptExecutor)driver;
		 * jExecutor.executeScript("arguments[0].click();", export);
		 */    //Element hidden Click manually
		
		//driver.findElement(By.xpath("(//div[@class='buttonIcon'])[5]")).click();   //Element hidden Click manually
		
}
}