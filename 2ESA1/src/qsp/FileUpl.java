package qsp;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUpl {
	static {

		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\2ESA1\\driver\\chromedriver.exe");
	}

	@Test
	public void fileUpl() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().fullscreen();
		driver.get("file:///C:/Users/Sandesh%20Sonawane/Desktop/FileUpload.HTML");
		File file = new File("D:\\Selinium\\Books.xlsx");
		String absPath = file.getAbsolutePath();
		driver.findElement(By.id("p1")).sendKeys(absPath);

	}
}
