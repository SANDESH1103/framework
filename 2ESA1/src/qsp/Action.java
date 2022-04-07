package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {
	static {

		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\2ESA1\\driver\\chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement hello = driver.findElement(By.xpath("//span[contains(.,'Hello, Sign in')]"));
		Actions actions=new Actions(driver);
		actions.moveToElement(hello).build().perform();
		driver.findElement(By.xpath("//span[contains(.,'Manage Your Content and Devices')]")).click();
		
	}

}
