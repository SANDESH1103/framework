package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserBulkInvitation {
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
		driver.findElement(By.xpath("(//div[contains(.,'Bulk Invitations')])[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@placeholder='First Name'])[4]")).sendKeys("sds");;
		driver.findElement(By.xpath("(//input[@placeholder='Last Name'])[4]")).sendKeys("dfss");
		driver.findElement(By.xpath("(//input[@placeholder='Email'])[4]")).sendKeys("hgd@gmail.com");
		driver.findElement(By.xpath("(//td[@class='permissionsTemplateButton'])[1]")).click();
		driver.findElement(By.xpath("(//div[contains(.,'           actiTIME administrator       ')])[5]")).click();
		driver.findElement(By.xpath("//span[contains(.,'Send Invitations')]")).click();
}}
