package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPomviewTimeTrackExportDownload {
	static {

		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\2ESA1\\driver\\chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();

		PomviewTimeTrackExportDownload p2 = new PomviewTimeTrackExportDownload(driver);
		p2.setUsername("admin");
		p2.setPassword("manager");
		p2.clickLogin();
		Thread.sleep(2000);
        p2.clickViewTimeTrack();
        p2.clickExoprt();
       // p2.clickDownload();
        WebElement download = driver.findElement(By.xpath("//span[@class='buttonTitle']"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", download);   //document not downloaded if you want to download click on download button
	}

}
