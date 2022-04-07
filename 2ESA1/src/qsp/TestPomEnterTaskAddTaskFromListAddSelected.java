package qsp;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPomEnterTaskAddTaskFromListAddSelected {
	static {

		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\2ESA1\\driver\\chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.actitime.com/login.do");

		PomEnterTaskAddTaskFromListAddSelected p2 = new PomEnterTaskAddTaskFromListAddSelected(driver);
		p2.setUsername("admin");
		p2.setPassword("manager");
		p2.clickLogin();
		p2.AddTaskFromList();
		p2.clickDropdown();
		p2.selectProject();
		Thread.sleep(2000);
		p2.selectTask();
		p2.clickAddSelected();
}
}