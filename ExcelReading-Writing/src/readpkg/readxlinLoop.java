package readpkg;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readxlinLoop {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File src = new File ("D:\\Nedbank\\Personal\\Learning\\PatriceFiles\\Excel\\SlnmTsDta.xlsx");
		
		FileInputStream fstrm = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fstrm);
		
		XSSFSheet shet =  wb.getSheetAt(0);
//		int noofclmns = shet.getRow(0).getLastCellNum();
		int noofrows = shet.getLastRowNum();
		
		System.out.println(noofrows);
		for(int i =0; i<noofrows;i++) {
		
		String cellValueA1 = shet.getRow(i).getCell(0).getStringCellValue();
		String cellValueB1 = shet.getRow(i).getCell(1).getStringCellValue();
		System.out.println("Row Number "+ i +" User Name :  "+ cellValueA1  +"  and Password : " + cellValueB1);
		}				
		wb.close();
		System.out.println();
	}

}
