package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	static {

		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\2ESA1\\driver\\chromedriver.exe");
	}


	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:5500/File.HTML");
		WebElement chooseFile=driver.findElement(By.id("a1"));
		File f1=new File("./cv/resume12.docx");
		String absPath=f1.getAbsolutePath();
		System.out.println(absPath);
		chooseFile.sendKeys(absPath);

	}

}
