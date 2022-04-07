package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FileDown {
	static {

		System.setProperty("webdriver.gecko.driver", "D:\\Selinium\\2ESA1\\driver\\geckodriver.exe");
	}

	@Test
	public void fileDown() throws AWTException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		String currentPage = driver.getWindowHandle();
		System.out.println(currentPage);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_S);
		//Set<String> allPages = driver.getWindowHandles();
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
			for (int i = 1; i < 4; i++) {
					robot.keyPress(KeyEvent.VK_TAB);
				}
				robot.keyPress(KeyEvent.VK_ENTER);
			}

		
	}

