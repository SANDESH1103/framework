package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskCanManageStatus {
	static {

		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\2ESA1\\driver\\chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();

		driver.findElement(By.xpath("//a[@class='content tasks']")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Start typing name ...'])[1]")).sendKeys("Big Bang Company");
		driver.findElement(By.xpath("(//span[@class='highlightToken'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='img'])[2]")).click();
		driver.findElement(By.xpath("(//div[.='Done'])[1]")).click();
		driver.findElement(By.xpath("(//div[.='Enter hours'])[1]")).click();
		driver.findElement(By.xpath("(//div[.='Enter hours'])[1]")).sendKeys("2 hours");
		
		//driver.findElement(By.xpath("//div[@class='title ellipsis']")).click();
	}

}
