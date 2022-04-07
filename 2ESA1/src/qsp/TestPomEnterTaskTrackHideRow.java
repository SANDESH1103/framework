package qsp;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPomEnterTaskTrackHideRow {
	static {

		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\2ESA1\\driver\\chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();

		PomEnterTaskTrackHideRow p2 = new PomEnterTaskTrackHideRow(driver);
		p2.setUsername("admin");
		p2.setPassword("manager");
		p2.clickLogin();
		p2.clickNew();
		p2.clickCustomerBox();
		p2.selectCustomer();
		p2.enterNewCustomer("sandy7");
		p2.enterNewProject("Quos");
		p2.enterTaskName("sa");
		p2.enterEstimate("1.30");
		p2.clickDeadline();
		p2.clickMonthyear();
		p2.clickMonth();
		p2.clicOkButton();
		p2.clicOkButton1();
		p2.clickCreateTask();
		Thread.sleep(5000);
		//p2.clickHideRow(); element is hidden we have to select it manually.
		p2.clickSavechanges();
	}
}
