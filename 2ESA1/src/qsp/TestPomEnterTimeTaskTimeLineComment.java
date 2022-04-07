package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPomEnterTimeTaskTimeLineComment {

	
		static {

			System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\2ESA1\\driver\\chromedriver.exe");
		}

		public static void main(String[] args)  {
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://demo.actitime.com/login.do");
			driver.manage().window().maximize();

			PomEnterTimeTaskTimeLineComment p2 = new PomEnterTimeTaskTimeLineComment(driver);
			p2.setUsername("admin");
			p2.setPassword("manager");
			p2.clickLogin();
			p2.clickNew();
			p2.clickCustomerBox();
			 WebElement selectElement = driver.findElement(By.xpath("(//div[contains(.,'- New Customer -')])[14]"));
		        JavascriptExecutor executor = (JavascriptExecutor) driver;
				executor.executeScript("arguments[0].click();", selectElement);
		//	p2.selectCustomer();
			p2.enterNewCustomer("sandy26");
			p2.enterNewProject("Quos");
			p2.enterTaskName("sa");
			p2.enterEstimate("1.30");
			p2.clickDeadline();
			p2.clickMonthyear();
			p2.clickMonth();
			p2.clicOkButton();
			p2.clicOkButton1();
			p2.clickCreateTask();
			while (true) {
				try {
					p2.clickOneditToComment();
				} catch (Exception e) {
					p2.clickOneditToComment();
					
				}
				break;
			}
			p2.writEditToComment("saaa");
			p2.clickSaveBtnElement();
			
			
	}

}


//Question:- how exactly comment timeline to created task ?