package qsp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EX {
	static WebDriver driver;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static XSSFRow row;
	static XSSFCell cell;

	static {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sandesh Sonawane\\eclipse-workspace\\sel\\driver\\chromedriver.exe");
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
		Thread.sleep(2000);
		// Import excel file
		File file = new File("D:\\framework\\2ESA1\\data\\Books.xlsx");
		// load the file
		FileInputStream fileInputStream = new FileInputStream(file);
		workbook = new XSSFWorkbook(fileInputStream);

		sheet = workbook.getSheet("Ebay");

		int noOfRow = sheet.getLastRowNum() - sheet.getFirstRowNum();
		// System.out.println(noOfRow);

		for (int i = 1; i <= noOfRow; i++) {
			int noOfCol = sheet.getRow(i).getLastCellNum();
			for (int j = 0; i <= noOfCol - 1; i++) {
				driver.findElement(By.xpath("//input[@name='firstname']")).clear();
				//first name
				cell = sheet.getRow(i).getCell(j);
				if (cell.getCellType() == CellType.STRING) {
					Thread.sleep(2000);
					driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(cell.getStringCellValue());
					System.out.println(cell.getStringCellValue());

				} else if (cell.getCellType() == CellType.NUMERIC) {
					Thread.sleep(2000);
					DataFormatter dataFormatter = new DataFormatter();
					String cell1 = dataFormatter.formatCellValue(cell);
					driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(cell1);

				} else if (cell.getCellType() == CellType.BLANK) {
					System.out.println("Please provide value");
				}
				//surname
				driver.findElement(By.xpath("//input[@name='lastname']")).clear();
				cell = sheet.getRow(i).getCell(j + 1);
				switch (cell.getCellType()) {
				case NUMERIC:
					Thread.sleep(2000);
					DataFormatter dataFormatter = new DataFormatter();
					String cell1 = dataFormatter.formatCellValue(cell);
					driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(cell1);
					break;
				case STRING:
					Thread.sleep(2000);
					driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(cell.getStringCellValue());
					// System.out.println(cell.getStringCellValue());

					break;
				case BLANK:
					System.out.println("Please provide value");
					break;
				default:
					break;
				}
				//Email
				driver.findElement(By.xpath("//input[@name='reg_email__']")).clear();
				cell = sheet.getRow(i).getCell(j + 2);
				switch (cell.getCellType()) {
				case STRING:
					Thread.sleep(2000);
					driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(cell.getStringCellValue());

					break;
				case NUMERIC:
					Thread.sleep(2000);
					DataFormatter dataFormatter = new DataFormatter();
					String cell1 = dataFormatter.formatCellValue(cell);
					driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(cell1);

					break;
				default:
					break;
				}
				//conform Email
				driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).clear();
				cell = sheet.getRow(i).getCell(j + 3);
				switch (cell.getCellType()) {
				case STRING:
					Thread.sleep(2000);
					driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"))
							.sendKeys(cell.getStringCellValue());

					break;
				case NUMERIC:
					Thread.sleep(2000);
					DataFormatter dataFormatter = new DataFormatter();
					String cell1 = dataFormatter.formatCellValue(cell);
					driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys(cell1);
					// System.out.println(cell1);

				default:

					break;
				}
				//Password
	
				driver.findElement(By.xpath("//input[@name='reg_passwd__']")).clear();
				cell = sheet.getRow(i).getCell(j + 4);
				switch (cell.getCellType()) {
				case STRING:
					Thread.sleep(2000);
					driver.findElement(By.xpath("//input[@name='reg_passwd__']"))
							.sendKeys(cell.getStringCellValue());

					break;
				case NUMERIC:

					DataFormatter dataFormatter = new DataFormatter();
					String cell1 = dataFormatter.formatCellValue(cell);
					Thread.sleep(2000);
					driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(cell1);
					// System.out.println(cell1);

				default:

					break;
				}
			}

		}
		//ExpectedConditions.refreshed(ExpectedConditions.stalenessOf())
      
	}

}
