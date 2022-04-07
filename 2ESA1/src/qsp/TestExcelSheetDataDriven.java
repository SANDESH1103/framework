package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestExcelSheetDataDriven {

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
	String path="./data/Books.xlsx";
	Workbook wb=WorkbookFactory.create(new FileInputStream(path));
	String v=wb.getSheet("Login").getRow(1).getCell(0).toString();
	System.out.println(v);
	wb.getSheet("Login").getRow(1).getCell(0).setCellValue("jhinga");
	wb.write(new FileOutputStream(path));
	wb.close();

	}

}
