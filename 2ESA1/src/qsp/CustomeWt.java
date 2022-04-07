package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomeWt {
	static {
		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\2ESA1\\driver\\ChromeDriver.exe");

	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		int c = 0;
		while (true) {

			try {
				driver.findElement(By.id("logoutLink")).click();
				break;

			} catch (Exception e) {
				System.out.println("finding element" + c++ + "th times");
			}

		}
		driver.close();

	}

}
