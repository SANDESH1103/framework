package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class NotificationPop {
	static {

		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\2ESA1\\driver\\chromedriver.exe");
	}
	@Test
	public void notification() throws InterruptedException {
		 ChromeOptions chromeOptions=new ChromeOptions();
		    chromeOptions.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		driver.findElement(By.id("email")).sendKeys("ersandesh11@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Sa@7843029969");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
	   driver.findElement(By.xpath("//div[@aria-label='Account']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[contains(.,'Log Out')]")).click();
	    
	}
}
