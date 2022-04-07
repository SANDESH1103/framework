package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserBulkInvitationEditUserTemplate {
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
		/*
		 * WebElement edit = driver.findElement(By.xpath(
		 * "/html/body/div[1]/div[14]/div[1]/div[1]/div[1]/div[2]/a"));
		 * JavascriptExecutor jExecutor=(JavascriptExecutor)driver;
		 * jExecutor.executeScript("arguments[0].click();",edit);
		 */		/*
		 * WebElement permission = driver.findElement(By.
		 * xpath("//a[contains(.,'Edit user permissions templates')]"));
		 * JavascriptExecutor jExecutor=(JavascriptExecutor)driver;
		 * jExecutor.executeScript("arguments[0].click();",permission);
		 */
		 
		Thread.sleep(5000);
		/*
		 * WebElement
		 * template=driver.findElement(By.xpath("//a[contains(.,'Create New Template')]"
		 * )); JavascriptExecutor jExecuto=(JavascriptExecutor)driver;
		 * jExecuto.executeScript("arguments[0].click();",template);
		 */
		
		driver.findElement(By.xpath("/html/body/div[1]/div[14]/div/div[1]/div[1]/div[3]/div[1]/div/div[2]/input")).sendKeys("Pera");
		Thread.sleep(3000);
		boolean first;
		boolean secound;
		boolean third;
		boolean fourth;
		boolean fifth;
		boolean sixth;
		boolean seventh;
		boolean eighth;
		
		first = driver.findElement(By.xpath("/html/body/div[1]/div[14]/div/div[1]/div[1]/div[3]/div[1]/div/div[3]/div[1]/div[1]/div[3]")).isSelected();
		secound = driver.findElement(By.xpath("/html/body/div[1]/div[14]/div/div[1]/div[1]/div[3]/div[1]/div/div[3]/div[1]/div[2]/div[3]"))
				.isSelected();
		third = driver.findElement(By.xpath("/html/body/div[1]/div[14]/div/div[1]/div[1]/div[3]/div[1]/div/div[3]/div[1]/div[3]/div[3]")).isSelected();
		fourth = driver.findElement(By.xpath("/html/body/div[1]/div[14]/div/div[1]/div[1]/div[3]/div[1]/div/div[3]/div[1]/div[4]/div[3]")).isSelected();
		Thread.sleep(2000);
		fifth = driver.findElement(By.xpath("/html/body/div[1]/div[14]/div/div[1]/div[1]/div[3]/div[1]/div/div[3]/div[2]/div[1]/div[3]")).isSelected();
		sixth = driver.findElement(By.xpath("/html/body/div[1]/div[14]/div/div[1]/div[1]/div[3]/div[1]/div/div[3]/div[2]/div[2]/div[3]")).isSelected();
		seventh = driver.findElement(By.xpath("/html/body/div[1]/div[14]/div/div[1]/div[1]/div[3]/div[1]/div/div[3]/div[2]/div[3]/div[3]")).isSelected();
		Thread.sleep(2000);
		eighth = driver.findElement(By.xpath("/html/body/div[1]/div[14]/div/div[1]/div[1]/div[3]/div[1]/div/div[3]/div[2]/div[4]/div[3]")).isSelected();

		if (first == false) {
			driver.findElement(By.xpath("/html/body/div[1]/div[14]/div/div[1]/div[1]/div[3]/div[1]/div/div[3]/div[1]/div[1]/div[3]")).click();
		}
		if (secound == true) {
			driver.findElement(By.xpath("/html/body/div[1]/div[14]/div/div[1]/div[1]/div[3]/div[1]/div/div[3]/div[1]/div[2]/div[3]")).click();
		}

		if (third == false) {
			driver.findElement(By.xpath("/html/body/div[1]/div[14]/div/div[1]/div[1]/div[3]/div[1]/div/div[3]/div[1]/div[3]/div[3]")).click();
		}
		if (fourth == true) {
			driver.findElement(By.xpath("/html/body/div[1]/div[14]/div/div[1]/div[1]/div[3]/div[1]/div/div[3]/div[1]/div[4]/div[3]")).click();
		}
		if (fifth == false) {
			driver.findElement(By.xpath("/html/body/div[1]/div[14]/div/div[1]/div[1]/div[3]/div[1]/div/div[3]/div[2]/div[1]/div[3]")).click();
		}
		if (sixth == true) {
			driver.findElement(By.xpath("/html/body/div[1]/div[14]/div/div[1]/div[1]/div[3]/div[1]/div/div[3]/div[2]/div[2]/div[3]")).click();
		}
		if (seventh == true) {
			driver.findElement(By.xpath("/html/body/div[1]/div[14]/div/div[1]/div[1]/div[3]/div[1]/div/div[3]/div[2]/div[3]/div[3]")).click();
		}
		if (eighth == false) {
			driver.findElement(By.xpath("/html/body/div[1]/div[14]/div/div[1]/div[1]/div[3]/div[1]/div/div[3]/div[2]/div[4]/div[3]")).click();
		}
		driver.findElement(By.xpath("/html/body/div[1]/div[14]/div/div[1]/div[1]/div[3]/div[1]/div/div[4]/div[1]")).click();
		

	}
}
