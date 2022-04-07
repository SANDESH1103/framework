package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelSheet {
	static {

		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\2ESA1\\driver\\chromedriver.exe");
	}

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.fb.com");
		/*
		 * String pathString = "D:\\Selinium\\2ESA1\\data\\fb.xlsx"; Workbook wb =
		 * WorkbookFactory.create(new FileInputStream(pathString)); for (int i = 1; i <
		 * 5; i++) {
		 * 
		 * 
		 * String Email = wb.getSheet("Invalid").getRow(i).getCell(0).toString();
		 * driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Email); String
		 * password = wb.getSheet("Invalid").getRow(i).getCell(1).toString();
		 * driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
		 * 
		 * driver.findElement(By.xpath("//button[@name='login']")).click();
		 * System.out.println(Email); System.out.println(password);
		 * driver.navigate().refresh();
		 * 
		 * } String Email = wb.getSheet("valid").getRow(1).getCell(0).toString();
		 * driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Email); double
		 * password = wb.getSheet("valid").getRow(1).getCell(1).getNumericCellValue();
		 * driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
		 * 
		 * driver.findElement(By.xpath("//button[@name='login']")).click();
		 * System.out.println(Email); System.out.println(password);
		 * 
		 * }
		 */

		/*
		 * FileInputStream fileInputStream = new
		 * FileInputStream("D:\\Selinium\\2ESA1\\data\\fb.xlsx"); XSSFWorkbook
		 * wbworkbook = new XSSFWorkbook(fileInputStream); XSSFSheet sheet =
		 * wbworkbook.getSheet("Invaild"); Iterator it = sheet.iterator(); while
		 * (it.hasNext()) { XSSFRow row = (XSSFRow) it.next(); WebElement rows =
		 * driver.findElement(By.xpath("//input[@id='email']")); JavascriptExecutor
		 * jrExecuto = (JavascriptExecutor) driver;
		 * jrExecuto.executeScript("arguments[0].value=row.", rows); Iterator
		 * cellsiterator = row.cellIterator(); while (cellsiterator.hasNext()) {
		 * XSSFCell col = (XSSFCell) it.next(); switch (col.getCellType()) { case
		 * NUMERIC:
		 * 
		 * WebElement colms = driver.findElement(By.xpath("//input[@id='pass']"));
		 * JavascriptExecutor jrExecutor = (JavascriptExecutor) driver;
		 * jrExecutor.executeScript("arguments[0].value='col'", colms);
		 * driver.findElement(By.xpath("//button[@name='login']")).click();
		 * System.out.println(row); System.out.println(col);
		 * driver.navigate().refresh(); break; case BOOLEAN:
		 * 
		 * WebElement cols = driver.findElement(By.xpath("//input[@id='pass']"));
		 * JavascriptExecutor jrExector = (JavascriptExecutor) driver;
		 * jrExector.executeScript("arguments[0].value= col", cols);
		 * driver.findElement(By.xpath("//button[@name='login']")).click();
		 * System.out.println(row); System.out.println(col);
		 * driver.navigate().refresh(); break; case STRING:
		 * 
		 * WebElement coms = driver.findElement(By.xpath("//input[@id='pass']"));
		 * JavascriptExecutor jrExeutor = (JavascriptExecutor) driver;
		 * jrExeutor.executeScript("arguments[0].value='col'", coms);
		 * driver.findElement(By.xpath("//button[@name='login']")).click();
		 * System.out.println(row); System.out.println(col);
		 * driver.navigate().refresh(); break;
		 * 
		 * case FORMULA: WebElement oms =
		 * driver.findElement(By.xpath("//input[@id='pass']")); JavascriptExecutor
		 * jrxeutor = (JavascriptExecutor) driver;
		 * jrxeutor.executeScript("arguments[0].value='col'", oms);
		 * driver.findElement(By.xpath("//button[@name='login']")).click();
		 * System.out.println(row); System.out.println(col);
		 * driver.navigate().refresh(); break;
		 * 
		 * 
		 * 
		 * } } }
		 * 
		 * }
		 */

		Xls_Reader reader = new Xls_Reader("D:\\Selinium\\2ESA1\\data\\fb.xlsx");
		//int rowCount = reader.getRowCount("Invalid");
		for (int row = 2; row <= 4; row++) {
          
			String username = reader.getCellData("Invalid", "username", row);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@id='pass']")).clear();
			String passsword = reader.getCellData("Invalid", "password", row);
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(passsword);
			driver.findElement(By.xpath("//button[@name='login']")).click();
			System.out.println(username);
			System.out.println(passsword);
			try {
				driver.findElement(By.xpath("//input[@id='email']")).clear();
			} catch (Exception e) {
				driver.findElement(By.xpath("//input[@id='email']")).clear();
			}
		
			driver.findElement(By.xpath("//input[@id='pass']")).clear();
		}
		  
		String username = reader.getCellData("valid", "username", 2);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='pass']")).clear();
		String passsword = reader.getCellData("valid", "password", 2);
		
	    
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(passsword);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		System.out.println(username);
		System.out.println(passsword);

	}
}
