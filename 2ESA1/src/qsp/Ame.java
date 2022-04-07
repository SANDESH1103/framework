package qsp;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ame {
	static {

		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\2ESA1\\driver\\chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		driver.findElement(By.id("nav-link-accountList")).click();
		driver.switchTo().activeElement().sendKeys("sandy6u@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.switchTo().activeElement().sendKeys("Sa@7843029969");
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("lenovo legion 5");
		int c = 0;
		while (true) {

			try {
				List<WebElement> suggList = driver.findElements(By.className("autocomplete-results-container"));
				System.out.println("===============================");
				System.out.println("Print all suggetions");
				for (int i = 0; i < suggList.size(); i++) {
					System.out.println(suggList.get(i).getText());

				}
				break;
				

			} 
			catch (Exception e) {
				System.out.println("finding element" + c++ + "th times");
			}

		}
		//suggList.get(1).click();

	}

}
