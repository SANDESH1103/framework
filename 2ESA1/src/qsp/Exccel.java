package qsp;


import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exccel {
	static WebDriver driver;
	static XSSFWorkbook wbWorkbook;
	static {

		System.setProperty("webdriver.chrome.driver", "D:\\framework\\2ESA1\\driver\\chromedriver.exe");
	}

	public static void main(String[] args) throws IOException {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://classic.freecrm.com/index.html?e=1");
		FileInputStream fileInputStream = new FileInputStream("D:\\framework\\2ESA1\\data\\Books.xlsx");
		XSSFWorkbook wbWorkbook = new XSSFWorkbook(fileInputStream);
		/*
		 * XSSFSheet sheet = wbWorkbook.getSheet("valid");
		 * 
		 * XSSFRow row = sheet.getRow(1); XSSFCell cell = row.getCell(1);
		 */
		 
		/*switch (cell.getCellType()) {
		case NUMERIC:*/
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(getStringData("valid", 2, 1));
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(getFormulaData("valid", 2, 2));
			driver.findElement(By.xpath("//input[@value='Login']")).click();
			/*
			 * break; case STRING:
			 * driver.findElement(By.xpath("//input[@name='username']")).sendKeys(
			 * getStringData("valid", 1, 1));
			 * driver.findElement(By.xpath("//input[@name='password']")).sendKeys(
			 * getFormulaData("valid", 1, 1));
			 * driver.findElement(By.xpath("//input[@value='Login']")).click(); break;
			 * default: break; }
			 */
	}

	public static String getStringData(String sheetname, int row, int cell) {
		return wbWorkbook.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	}

	public static double getNumericData(String sheetname, int row, int cell) {
		return wbWorkbook.getSheet(sheetname).getRow(row).getCell(cell).getNumericCellValue();
	}

	public static String getFormulaData(String sheetname, int row, int cell) {
		return wbWorkbook.getSheet(sheetname).getRow(row).getCell(cell).getCellFormula();
	}
}
