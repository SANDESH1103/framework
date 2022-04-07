package qsp;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPomTimeTrackTaskCopyProperties {
	static {

		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\2ESA1\\driver\\chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();

		PomTimeTrackTaskCopyProperties p2 = new PomTimeTrackTaskCopyProperties(driver);
		p2.setUsername("admin");
		p2.setPassword("manager");
		p2.clickLogin();
		Thread.sleep(2000);
		p2.clickNew();
		Thread.sleep(2000);
		p2.clickOnDownArrow();
		Thread.sleep(2000);
		WebElement selectCustomer = driver.findElement(By.xpath("//div[.='- New Customer -']"));
		// wait.until(ExpectedConditions.elementToBeClickable(selectCustomer));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", selectCustomer);
		p2.enterNewCustomer("sandy15");
		p2.enterNewProject("Quos");
		p2.clickCopyProperties();
		p2.clickDropdown();
		Thread.sleep(2000);
		p2.selectProject();
		// p2.selectActivity();
		Thread.sleep(2000);
		// p2.selectTask(); element hidden select manually
		Thread.sleep(2000);
		p2.clickOnCopyCheckbox();
		p2.clickCopyPropertiesBtn();

	}

}
