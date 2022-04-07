package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HybridFrameWork {
	static {

		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\2ESA1\\driver\\chromedriver.exe");
	}

	public static void main(String[] args)
			throws EncryptedDocumentException, FileNotFoundException, IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		PomExampleLoginPage p1 = new PomExampleLoginPage(driver);
		String path = "./data/Books.xlsx";
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		for (int i = 1; i <= 7; i++) {
			String un = wb.getSheet("Login").getRow(i).getCell(0).toString();
			p1.setUsername(un);
			String pw = wb.getSheet("Login").getRow(i).getCell(1).toString();
			p1.setPassword(pw);
			p1.clickLOginBtn();
			Thread.sleep(5000);

		}
		driver.close();

	}

}
