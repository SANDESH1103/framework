package qsp;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPomTaskManageProjectAssign {
	static {

		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\2ESA1\\driver\\chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();

		PomTaskCanManageProjectAssign p2 = new PomTaskCanManageProjectAssign(driver);
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
		p2.clickAssign();
		p2.clickSelectUser();
		Thread.sleep(5000);
		
		/*
		 * p2.clickUser1(); Thread.sleep(2000); p2.clickUser2();      select user manually NosuchElementException throws
		 * 
		 * //p2.clickCancel();
		 */		
		
		p2.clickOnAssign();

	}
}
