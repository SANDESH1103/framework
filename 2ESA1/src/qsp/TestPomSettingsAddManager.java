package qsp;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPomSettingsAddManager {
	static {

		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\2ESA1\\driver\\chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();

		PomSettingsAddManager p2 = new PomSettingsAddManager(driver);
		p2.setUsername("admin");
		p2.setPassword("manager");
		p2.clickLogin();
		p2.clickTask();
		p2.typeBigbang("Big Bang Company");
		Thread.sleep(2000);
		p2.clickBig();
		Thread.sleep(3000);
		p2.clickOnManagers();
		Thread.sleep(2000);
		//p2.clickSetting();    element is hidden we have to click manually
		//p2.clickAddManager();// element is hidden we have to click manually
		p2.selectManager();
		Thread.sleep(2000);
		p2.clickCancel();
		
		
  }
}
