package qsp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ChildbrowerPopUp {
	static {

		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\2ESA1\\driver\\chromedriver.exe");
	}
     @Test
	public void childbrower() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com");
		String parentTab = driver.getWindowHandle();
		System.out.println(parentTab);
		
		WebElement fb = driver.findElement(By.xpath("(//a[@class='text-decoration-none'])[1]"));
		JavascriptExecutor jcExecutor=(JavascriptExecutor)driver;
		jcExecutor.executeScript("arguments[0].click();",fb );
		//wait.until(ExpectedConditions.elementToBeClickable(fb)).click();
		 
		Set<String> allTabs = driver.getWindowHandles();
		for (String string : allTabs) {

			if (string.equals(parentTab)) {

			} else {
				driver.switchTo().window(string);
				Thread.sleep(10000);
				driver.close();
			}
		}
	}
}
