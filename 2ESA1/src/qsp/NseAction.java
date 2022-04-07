package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NseAction {
	static {

		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\2ESA1\\driver\\chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.nseindia.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement marketData = driver.findElement(By.xpath("(//a[@class='nav-link dd-link'])[3]"));
        Actions actions=new Actions(driver);
        Thread.sleep(2000);
        actions.moveToElement(marketData).build().perform();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//a[contains(.,'Derivatives Market')])[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//a[@onclick='dnldEqtDer();'])[1]")).click();
	}

}
