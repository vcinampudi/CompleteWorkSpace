package excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelReading {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		XSSFWorkbook xlwb = new XSSFWorkbook();
		
		XSSFSheet sht = xlwb.createSheet("Firstsheet");
		
		Row row0 = sht.createRow(0);
	
	Cell Cela = row0.createCell(0);
	Cell Celb = row0.createCell(1);
	
	Cela.setCellValue("this is first cell value");
	
	Celb.setCellValue("this is 2nd cell value");
	
	File f = new File("D:\\Personal\\Learning\\PatriceFiles\\Excel\\Excelfile.xlsx");
	
		FileOutputStream fo = new FileOutputStream(f);
		
		xlwb.write(fo);
	
	System.out.println("Excel File Created");
		
	}
}