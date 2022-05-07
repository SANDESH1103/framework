package Utilitis;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;

public class XlUtilities {
    static FileInputStream fileInputStream = null;
    static WorkbookFactory wb;
    static Workbook sheetWorkbook;

    public static Object[][] data(String sheetname) {
	// load excel file
	String TEST_DATA_PATH = "D:\\framework\\PageObjectModel-master\\PageObjectModel-master\\src\\test\\java\\testData\\fb.xlsx";
	try {
	    fileInputStream = new FileInputStream(TEST_DATA_PATH);
	} catch (FileNotFoundException e) {
	    System.out.println(e.getMessage());
	}
	// Create workbook
	try {
	    sheetWorkbook = WorkbookFactory.create(fileInputStream);
	} catch (InvalidFormatException e) {
	    System.out.println(e.getMessage());
	} catch (IOException e) {
	    e.printStackTrace();
	}
	// get sheet from workbook
	Sheet sheet = sheetWorkbook.getSheet(sheetname);
	// get no of rows in sheet
	int noOfrows = sheet.getLastRowNum();
	// get no of cells in sheet
	int noOfcells = sheet.getRow(0).getLastCellNum();

	// create two dimensional array
	Object[][] data = new Object[noOfrows][noOfcells];
	for (int i = 0; i < noOfrows; i++) {
	    for (int j = 0; j < noOfcells; j++) {
		XSSFCell cell = (XSSFCell) sheet.getRow(i).getCell(j);
		if (cell.getCellType() == CellType.NUMERIC) {
		    DataFormatter formatter = new DataFormatter();
		    formatter.formatCellValue(cell);
		}
		{
		    data[i][j] = sheet.getRow(i + 1).getCell(j).toString();

		}

	    }
	}
	return data;

    }
}
