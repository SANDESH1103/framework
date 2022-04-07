package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dr1 {
	static {

		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\2ESA1\\driver\\chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		LoginPage l1 = new LoginPage(driver);
		l1.setUsername("aefss");
		l1.setPassword("lahen");
		l1.clickLogin();
		Thread.sleep(2000);
		l1.setPassword("admin"); // stale(very old)ElementReferenceException
		l1.setPassword("manager");
	}

}
