package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserDepartmentMoveTo {
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
		driver.findElement(By.xpath("(//div[contains(.,' Departments')])[5]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("/html/body/div[2]/div[15]/div/div/table/tbody/tr[2]/td[1]/div/div[1]/div[5]/table/tr/td[1]")).click();
		driver.findElement(By.xpath("//input[@id='groupManagementLightBox_userCheckbox_13']")).click();
		driver.findElement(By.xpath("//button[contains(.,'Move To')]")).click();
		driver.findElement(By.xpath("/html/body/div[32]/ul/li[4]/a")).click();
		
}}
