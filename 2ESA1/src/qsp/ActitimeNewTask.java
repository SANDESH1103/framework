package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeNewTask {
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
		driver.findElement(By.xpath("//div[@class='title ellipsis']")).click();
		driver.findElement(By.xpath("//div[@class='item createNewTasks']")).click();
		driver.findElement(By.xpath("(//div[@class='dropdownButton'])[15]")).click();
		driver.findElement(By.xpath("(//div[@class='selectedItem'])[16]")).click();
		driver.findElement(By.xpath("(//div[@class='comboboxButton'])[]")).click();
		driver.findElement(By.xpath("(//div[@class='itemRow '])[2]")).click();
        driver.findElement(By.xpath("(//div[@class='selectedItem'])[17]")).click();
		driver.findElement(By.xpath("(//div[@class='comboboxButton'])[2]")).click();
		driver.findElement(By.xpath("(//div[@class='itemRow '])[5]")).click();
		driver.findElement(By.xpath("(//input[@class='inputFieldWithPlaceholder'])[1]")).sendKeys("sam");
		driver.findElement(By.xpath("(//input[@class='inputFieldWithPlaceholder'])[2]")).sendKeys("3 days");
		driver.findElement(By.xpath("(//button[.='set deadline'])[1]")).click();
		driver.findElement(By.xpath("//button[.='March 2022']")).click();
		driver.findElement(By.xpath("//a[.='Oct']")).click();
		driver.findElement(By.xpath("//button[@class='x-date-mp-ok']")).click();
		driver.findElement(By.xpath("//button[@id='ext-gen273']")).click();
		driver.findElement(By.xpath("(//span[@class='checkmark checkMark'])[2]")).click();
		driver.findElement(By.xpath("//div[.='Create Tasks']")).click();

	}

}
