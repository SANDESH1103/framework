package qsp;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTaskCanManagerStatus {
	static {

		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\2ESA1\\driver\\chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.actitime.com/login.do");
		PomTaskCanManagerStatus p1=new PomTaskCanManagerStatus(driver);
		//POMTaskCanManageTaskDelete p2=new POMTaskCanManageTaskDelete(driver);
		p1.setUsername("admin");
		p1.setPassword("manager");
		p1.clickLogin();
		p1.clickTask();
		p1.typeBigbang("Big Bang Company");
		Thread.sleep(2000);
		p1.clickBig();
		Thread.sleep(3000);
		//p1.click();   //we have to click on checkbox manually.
		p1.clickStatus();
		p1.clickEstimate();
		Thread.sleep(2000);
		//p1.setEstimate("400:00");
		//estimate hours we have to add manually 
        
	}

}
