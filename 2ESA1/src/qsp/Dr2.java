package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dr2 {
	static {

		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\2ESA1\\driver\\chromedriver.exe");
	}


	public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.com");
	EncapsulatedClass e1=new EncapsulatedClass(driver);
	e1.test("dinga");
	
	

	}

}
