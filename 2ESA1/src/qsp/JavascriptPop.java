package qsp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavascriptPop {
	static {

		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\2ESA1\\driver\\chromedriver.exe");
	}
   @Test
   
	public void Popup() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("(//div[contains(.,'Login')])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(.,'New')]")).click();
		driver.findElement(By.xpath("(//div[@class='dropdownButton'])[5]")).click();
		driver.findElement(By.xpath("(//div[contains(.,'- New Customer -')])[14]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Customer Name']")).sendKeys("sa");
		driver.findElement(By.xpath("//input[@placeholder='Enter Project Name']")).sendKeys("sa");
		driver.findElement(By.xpath("(//div[contains(.,'Cancel')])[56]")).click();
		Alert a1 = driver.switchTo().alert();
		Thread.sleep(5000);
		a1.accept();
	}

}
