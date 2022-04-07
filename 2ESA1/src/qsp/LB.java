package qsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LB {
	static {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sandesh Sonawane\\eclipse-workspace\\sel\\driver\\chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/Sandesh%20Sonawane/Desktop/LB.html");
		WebElement tajLB = driver.findElement(By.id("s1"));
		Select s1 = new Select(tajLB);
		s1.selectByIndex(0);
		s1.selectByValue("c2");
		s1.selectByVisibleText("Black chai");
		s1.deselectAll();
		// print all options
		List<WebElement> allOptions = s1.getOptions();
		for (int i = 0; i < allOptions.size(); i++) {
			System.out.println(allOptions.get(i).getText());

		}
		s1.selectByIndex(0);
		s1.selectByValue("c2");
		WebElement firstOps = s1.getFirstSelectedOption();
		System.out.println(firstOps.getText());
		List<WebElement> allSelOptions = s1.getAllSelectedOptions();
		for (int j = 0; j < allSelOptions.size(); j++) {
			System.out.println(allSelOptions.get(j).getText());

		}
		WebElement all = s1.getWrappedElement();
		System.out.println(all.getText());
		
	}

}
