package excelhandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelwriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        FileOutputStream fo = new FileOutputStream("C:\\Filehandling\\ExcelWriter.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook();
		Sheet s = wb.createSheet("Mysheet1");
		Row r = s.createRow(0);
		Cell c1 = r.createCell(0);
		c1.setCellValue("Hello this is from POI");
		wb.write(fo);
        wb.close();
		

	}

}
