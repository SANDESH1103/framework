package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Printpopup {
	static {

		System.setProperty("webdriver.gecko.driver", "D:\\Selinium\\2ESA1\\driver\\geckodriver.exe");
	}

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.actitime.com/login.do");
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_CONTROL);
		r1.keyPress(KeyEvent.VK_P);
		r1.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		// to handle this popup

		for (int i = 1; i < 7; i++) {
			r1.keyPress(KeyEvent.VK_TAB);
		}
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_ENTER);
		// driver.switchTo().activeElement().sendKeys("Sandesh");
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_ENTER);

		// r1.keyPress(KeyEvent.VK_ESCAPE);

	}

}
