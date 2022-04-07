package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UsersNewUserPermissions {
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
		driver.findElement(By.xpath("(//div[contains(.,'New User')])[5]")).click();
		WebElement click = driver.findElement(By.xpath("(//input[@placeholder='First Name'])[3]"));
		JavascriptExecutor jExecutor = (JavascriptExecutor) driver;
		jExecutor.executeScript("arguments[0].click();", click);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@placeholder='First Name'])[3]")).sendKeys("saaaa"); // element hidden
																									// provide manually
		driver.findElement(By.xpath("(//input[@placeholder='Last Name'])[3]")).sendKeys("sooooo");
		driver.findElement(By.xpath("(//input[@placeholder='Email'])[3]")).sendKeys("sea@gmail.com");
		driver.findElement(By.xpath("(//div[@class='selectorPlaceholder'])[2]")).click();
		driver.findElement(By.xpath("(//div[contains(.,'Quality Control')])[32]")).click();
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[4]")).click();
		driver.findElement(By.xpath("(//span[contains(.,'22')])[2]")).click();
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[6]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@class='x-menu-item'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[contains(.,'PERMISSIONS')])[2]")).click();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("(//div[@class='applyTemplate'])[1]")).click();
		// element hidden
		// provide manually
		Thread.sleep(2000);
		/*
		 * while (true) {
		 * 
		 * try { driver.findElement(By.
		 * xpath("(//div[contains(.,'actiTIME administrator')])[16]")).click(); } catch
		 * (Exception e) { driver.findElement(By.
		 * xpath("(//div[contains(.,'actiTIME administrator')])[16]")).click(); break; }
		 * }
		 */
		boolean first;
		boolean secound;
		boolean third;
		boolean fourth;
		boolean fifth;
		boolean sixth;
		boolean seventh;
		boolean eighth;
		Thread.sleep(2000);
		first = driver.findElement(By.xpath("(//div[contains(.,'Manage Accounts & Permissions')])[57]")).isSelected();
		secound = driver.findElement(By.xpath("(//div[contains(.,'Modify & Approve Users Time-Track')])[63]"))
				.isSelected();
		third = driver.findElement(By.xpath("(//div[contains(.,'Manage Scope of Work')])[57]")).isSelected();
		fourth = driver.findElement(By.xpath("(//div[contains(.,'Manage Cost & Billing Data')])[57]")).isSelected();
		Thread.sleep(2000);
		fifth = driver.findElement(By.xpath("(//div[contains(.,'Enter Time-Track')])[58]")).isSelected();
		sixth = driver.findElement(By.xpath("(//div[contains(.,'Lock Time-Track For Any User')])[51]")).isSelected();
		seventh = driver.findElement(By.xpath("(//div[contains(.,'Manage PTO & Sick Days Settings')])[57]"))
				.isSelected();
		Thread.sleep(2000);
		eighth = driver.findElement(By.xpath("(//div[contains(.,'Manage System Settings')])[57]")).isSelected();

		if (first ==true) {
			driver.findElement(By.xpath("(//div[contains(.,'Manage Accounts & Permissions')])[57]")).click();
		}
		if (secound !=true) {
			driver.findElement(By.xpath("(//div[contains(.,'Modify & Approve Users Time-Track')])[63]")).click();
		}
		
		if (third !=true) {
			driver.findElement(By.xpath("(//div[contains(.,'Manage Scope of Work')])[57]")).click();
		}
		if (fourth !=true) {
			driver.findElement(By.xpath("(//div[contains(.,'Manage Cost & Billing Data')])[57]")).click();
		}
		if (fifth == true) {
			driver.findElement(By.xpath("(//div[contains(.,'Enter Time-Track')])[58]")).click();
		}
		if (sixth !=true) {
			driver.findElement(By.xpath("(//div[contains(.,'Lock Time-Track For Any User')])[51]")).click();
		}
		if (seventh !=true) {
			driver.findElement(By.xpath("(//div[contains(.,'Manage PTO & Sick Days Settings')])[57]")).click();
		}
		if (eighth == true) {
			driver.findElement(By.xpath("(//div[contains(.,'Manage System Settings')])[57]")).click();
		}
		driver.findElement(By.xpath("(//div[contains(.,'Save Template')])[18]")).click();
		driver.findElement(By.xpath("//span[contains(.,'Send Invitations')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[contains(.,'OK')])[4]")).click();

	}
}
