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
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EX {
	static WebDriver driver;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static XSSFRow row;
	static XSSFCell cell;
	static {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandesh Sonawane\\eclipse-workspace\\sel\\driver\\chromedriver.exe");
	}
	@BeforeMethod
public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://www.ebay.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
}
	@Test
	public static void testSignup() throws IOException, InterruptedException {
		driver.findElement(By.xpath("//a[contains(.,'register')]")).click();
		// Import excel file
		File file = new File("C:\\Users\\Sandesh Sonawane\\eclipse-workspace\\sel\\data\\Books.xlsx");
		// load the file
		FileInputStream fileInputStream = new FileInputStream(file);
		workbook = new XSSFWorkbook(fileInputStream);
		Thread.sleep(3000);
		sheet = workbook.getSheet("Ebay");
		Thread.sleep(3000);
		int noOfRow = sheet.getLastRowNum()-sheet.getFirstRowNum();
		int noOfCol = sheet.getRow(0).getLastCellNum();
		for (int i = 1; i < noOfRow; i++) {
			for (int j = 0; j < noOfCol; j++) {
				cell = sheet.getRow(i).getCell(j);
				if (cell.getCellType() == CellType.STRING) {
					driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(cell.getStringCellValue());
				} else if (cell.getCellType() == CellType.NUMERIC) {
					DataFormatter dataFormatter = new DataFormatter();
					String cell1 = dataFormatter.formatCellValue(cell);
					driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(cell1);

				} else if (cell.getCellType() == CellType.BLANK) {
					System.out.println("Please provide value");
				}
				cell = sheet.getRow(i).getCell(j + 1);
				switch (cell.getCellType()) {
				case NUMERIC:
					DataFormatter dataFormatter = new DataFormatter();
					String cell1 = dataFormatter.formatCellValue(cell);
					driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(cell1);
					break;
				case STRING:
					driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(cell.getStringCellValue());
				case BLANK:
					System.out.println("Please provide value");
				default:
					break;
				}
				cell = sheet.getRow(i).getCell(j + 2);
				switch (cell.getCellType()) {
				case STRING:
					driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(cell.getStringCellValue());
					break;
				case NUMERIC:
					DataFormatter dataFormatter = new DataFormatter();
					String cell1 = dataFormatter.formatCellValue(cell);
					driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(cell1);
				default:
					break;
				}
				cell = sheet.getRow(i).getCell(j + 3);
				switch (cell.getCellType()) {
				case STRING:
					driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(cell.getStringCellValue());
					break;
				case NUMERIC:
					DataFormatter dataFormatter = new DataFormatter();
					String cell1 = dataFormatter.formatCellValue(cell);
					driver.findElement(By.xpath("//input[@id='password']")).sendKeys(cell1);
				default:
					break;
				}
			}

		}

	}

}
