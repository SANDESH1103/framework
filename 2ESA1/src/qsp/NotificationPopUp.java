package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUp {
	static {

		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\2ESA1\\driver\\chromedriver.exe");
	}

	public static void main(String[] args) {
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		driver.findElement(By.id("email")).sendKeys("abcd");
		driver.findElement(By.id("pass")).sendKeys("1234");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.findElement(By.xpath("div[aria-label='Account']")).click();
		driver.findElement(By.xpath("//span[.='Logout']")).click();
		driver.close();
	}

}
