package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	static {
		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\2ESA1\\driver\\chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		List<WebElement> allTags = driver.findElements(By.tagName("a"));
		System.out.println("Total links:" + allTags.size());
		for (int i = 0; i < allTags.size(); i++) {
			System.out.println(allTags.get(i).getText());

		}
		driver.close();

	}

}
