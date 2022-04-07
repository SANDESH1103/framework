package qsp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.sdk.trace.samplers.ParentBasedSamplerBuilder;

public class ChildBrowser {
	static {

		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\2ESA1\\driver\\chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://demo.actiTIme.com/login.do");
		String paretTAb = driver.getWindowHandle();
		System.out.println(paretTAb);
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Thread.sleep(4000);
		Set<String> allTabs = driver.getWindowHandles();
		System.out.println(allTabs);

		for (String string : allTabs) {
			if (string.equals(paretTAb)) {

			} else {
				driver.switchTo().window(string);// selenium control transfer from parentTab to child popup
				driver.close(); // close the tab where control present.

			}
		}

	}

}
