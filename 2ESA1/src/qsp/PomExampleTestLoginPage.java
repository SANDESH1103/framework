package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PomExampleTestLoginPage {
	static {

		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\2ESA1\\driver\\chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	PomExampleLoginPage l1=new PomExampleLoginPage(driver);
	l1.setUsername("abcd");
	l1.setPassword("efgh");
	l1.clickLOginBtn();
	Thread.sleep(2000);
	l1.setUsername("admin");
	l1.setPassword("manager");
	l1.clickLOginBtn();
	//driver.close();
	

	}

}
