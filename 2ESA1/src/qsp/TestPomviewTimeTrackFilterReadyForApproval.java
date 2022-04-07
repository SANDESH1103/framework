package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPomviewTimeTrackFilterReadyForApproval {
	static {

		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\2ESA1\\driver\\chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();

		PomviewTimeTrackFilterApprove p2 = new PomviewTimeTrackFilterApprove(driver);
		p2.setUsername("admin");
		p2.setPassword("manager");
		p2.clickLogin();
		Thread.sleep(2000);
		p2.clickViewTimeTrack();
		p2.clickOnFilter();
		p2.clickOncustomer();
		Thread.sleep(2000);
		p2.resetFilter();
		Thread.sleep(2000);
		p2.clickCancel();
		Thread.sleep(2000);
		boolean checkedDropbox1;
		checkedDropbox1 = driver.findElement(By.xpath("//input[@id='viewTTStatusCheckboxId_0']")).isSelected();
		boolean checkedDropbox2;
		checkedDropbox2 = driver.findElement(By.xpath("//input[@id='viewTTStatusCheckboxId_1']")).isSelected();
		boolean checkedDropbox3;
		checkedDropbox3 = driver.findElement(By.xpath("//input[@id='viewTTStatusCheckboxId_2']")).isSelected();
		if (checkedDropbox2 != true) {
			p2.clickOnReadyForApproval();
		}
		if (checkedDropbox1 != false) {
			p2.clickOnapprove();
		}
		if (checkedDropbox3 != false) {
			p2.clickOnNotReadyAndRejected();
		}
		Thread.sleep(2000);
		p2.clickOnApproveBtn();
	}
}