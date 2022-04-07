package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserFilter {
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
		driver.findElement(By.xpath("(//div[@class='mainIcon'])[1]")).click();
		driver.findElement(By.xpath("//span[contains(.,'All staff')]")).click();
}}
