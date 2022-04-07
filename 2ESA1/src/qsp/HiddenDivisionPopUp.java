package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenDivisionPopUp {
	static {

		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\2ESA1\\driver\\chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.name("policynumber")).sendKeys("54654652");
		driver.findElement(By.id("dob")).click();
		WebElement selectMth = driver.findElement(By.className("ui-datepicker-month"));
		Select s1 = new Select(selectMth);
		s1.selectByVisibleText("Mar");
		WebElement selectYear = driver.findElement(By.className("ui-datepicker-year"));
		Select s2 = new Select(selectYear);
		s2.selectByVisibleText("1994");
		driver.findElement(By.xpath("//a[contains(.,'11')]")).click();
		driver.findElement(By.cssSelector("input[placeholder='Contact Number']")).sendKeys("546791324567");
		driver.findElement(By.xpath("(//button)[4]")).click();

	}

}
