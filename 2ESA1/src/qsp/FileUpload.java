package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	static {

		System.setProperty("webdriver.chrome.driver", "D:\\framework\\2ESA1\\driver\\chromedriver.exe");
	}


	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sandesh%20Sonawane/Desktop/FileUpload.HTML");
		driver.findElement(By.id("p1")).sendKeys("D:\\Selinium\\Books.xlsx");
		/*
		 * File f1=new File("./cv/resume12.docx"); String absPath=f1.getAbsolutePath();
		 * System.out.println(absPath); chooseFile.sendKeys(absPath);
		 */

	}

}
