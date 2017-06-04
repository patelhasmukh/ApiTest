package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//import Base.BaseSetup;

public class ExcelUtility {

	public String[][] readXLSXFile(String fileName, String workSheet) {
		InputStream XlsxFileToRead = null;
		String[][] tabArray = null;
		XSSFWorkbook workbook = null;
		try {
			XlsxFileToRead = new FileInputStream(fileName);
			workbook = new XSSFWorkbook(XlsxFileToRead);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// getting the first sheet from the workbook using sheet name. 
		XSSFSheet sheet = workbook.getSheet(workSheet);
		XSSFRow row;
		XSSFCell cell;

        tabArray=new String[sheet.getLastRowNum()][sheet.getRow(0).getPhysicalNumberOfCells()];
		// Iterating all the rows in the sheet
		Iterator<Row> rows = sheet.rowIterator();

		while (rows.hasNext()) {
			row = (XSSFRow) rows.next();
			int rowNum = row.getRowNum();
			if(rowNum == 0 ){
				continue;
			}
			int colNum = 0;
			rowNum = rowNum - 1;
			Iterator<Cell> cells = row.cellIterator();
			while (cells.hasNext()) {
				cell = (XSSFCell) cells.next();
				cell.setCellType(CellType.STRING);
				if (cell.getCellTypeEnum() == CellType.STRING) {
					System.out.print(cell.getStringCellValue() + " ");
					tabArray[rowNum][colNum] = cell.getStringCellValue().toString();
				} else if (cell.getCellTypeEnum() == CellType.NUMERIC) {
					System.out.print(cell.getNumericCellValue());
					tabArray[rowNum][colNum] = NumberToTextConverter.toText(cell.getNumericCellValue());
				} else { // //Here if require, we can also add below methods to
				}
				colNum++;
			}
			System.out.println();
			try {
				XlsxFileToRead.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return tabArray;
		
	}

	public static void main(String[] args) {
		ExcelUtility readXlsx = new ExcelUtility();
		//String filepath =  System.getProperty("user.dir") + File.separator + testProperties.getProperty("testdata.endpoint.bus");
		readXlsx.readXLSXFile(System.getProperty("user.dir") + "\\TestData\\EndPoint_Bus\\GetBus_TestData.xlsx", "TestData");
		
	}

}