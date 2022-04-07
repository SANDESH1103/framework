package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Options {
	static {

		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\2ESA1\\driver\\chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/WEB%20TECH/Project/Listbox.HTML");
		WebElement tagLB = driver.findElement(By.id("tag"));
		Select s1 = new Select(tagLB);
		List<WebElement> allList = s1.getOptions();
		System.out.println("Total Options:" + allList.size());
		System.out.println("================================");
		System.out.println("Options present in Listbox");
		for (int i = 0; i < allList.size(); i++) {
			System.out.println(allList.get(i).getText());
		}
		s1.selectByIndex(0);
		s1.selectByIndex(3);
		WebElement firstElement=s1.getFirstSelectedOption();
		System.out.println("First Element:" + firstElement.getText());
		System.out.println("================================");
		System.out.println("GET ALL ELEMENT METHOD");
		List<WebElement> all = s1.getAllSelectedOptions();
		for (int j = 0; j < all.size(); j++) {
			System.out.println(all.get(j).getText());
		}
		System.out.println("=================");
		System.out.println("Wrapped Element method all option wrapped in one object type webelement");
		WebElement wrap = s1.getWrappedElement();
		System.out.println("================");
		System.out.println("Print all element");
		System.out.println( wrap.getText());
	}
}
