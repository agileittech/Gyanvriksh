package excelhandling;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelreader {

public String excelreading(String location ,String sheetname,int rownumber,int cellnumber) throws IOException {		
FileInputStream fi = new FileInputStream(location);
XSSFWorkbook workbook = new XSSFWorkbook(fi);
Sheet sheet = workbook.getSheet(sheetname);
Row row = sheet.getRow(rownumber);
Cell cell = row.getCell(cellnumber);
String mycell = cell.getStringCellValue();
workbook.close();
return mycell;
	}
	}

