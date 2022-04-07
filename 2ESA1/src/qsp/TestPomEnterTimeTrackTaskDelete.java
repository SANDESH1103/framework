package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPomEnterTimeTrackTaskDelete {
	static {

		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\2ESA1\\driver\\chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();

		PomEnterTimeTrackTaskDelete p2 = new PomEnterTimeTrackTaskDelete(driver);
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
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", selectCustomer);
		p2.enterNewCustomer("sandy14");
		p2.enterNewProject("Quos");
		p2.enterTaskName("sa");
		p2.enterEstimate("1.30");
		p2.clickDeadline();
		p2.clickMonthyear();
		Thread.sleep(2000);
		// p2.clickMonth(); element hidden click manually
		p2.clicOkButton();
		p2.clicOkButton1();
		p2.clickCreateTask();
		Thread.sleep(5000);
		p2.clickSavechanges();
		p2.clickOnTask();
		Thread.sleep(5000);
		// p2.clickOnActions(); element hidden click manually
		// p2.clickOnDelete(); element hidden click manually
		p2.clickOnDeletePermanantley();

	}

	// p2.selectCustomer();

}
