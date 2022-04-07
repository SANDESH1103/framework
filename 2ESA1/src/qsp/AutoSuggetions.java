package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggetions {
	static {

		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\2ESA1\\driver\\chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("java");
		// if this step is not perform selinium detect 0 element reason behid this is google takes micro secound time for auto suggetion at that time when page display selinium quickly find element if not found gives 0 element output 
		Thread.sleep(2000);
		List<WebElement> eLIst = driver.findElements(By.xpath("//span[contains(.,'ava')]"));
		System.out.println("Count of auto suggetion");
		System.out.println("all autosuggetions" + eLIst.size());
		System.out.println("======================================");
		System.out.println("Print all autosuggetions");
		for (WebElement webElement : eLIst) {
			System.out.println(webElement.getText());
		}
		eLIst.get(4).click();
		driver.close();

	}

}
