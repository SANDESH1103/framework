package qsp;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPomTaskCanManageProjectCopy {
	static {

		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\2ESA1\\driver\\chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.actitime.com/login.do");

		PomTaskCanManageProjectCopy p2 = new PomTaskCanManageProjectCopy(driver);
		p2.setUsername("admin");
		p2.setPassword("manager");
		p2.clickLogin();
		p2.clickTask();
		p2.typeBigbang("Big Bang Company");
		Thread.sleep(2000);
		p2.clickBig();
		Thread.sleep(3000);
		// p1.click(); //we have to click on checkbox manually.
		p2.clickStatus();
		p2.clickEstimate();
		Thread.sleep(5000);
		p2.clickToCopy();
		p2.clickProject();
		Thread.sleep(2000);
		p2.selectProject();
		p2.clickActivity();
		Thread.sleep(2000);
		//p2.selectActivity();   select manually 
		//p2.clickOnCopy();      click manually
	}
}