package readpkg;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readxl {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File src = new File ("D:\\Nedbank\\Personal\\Learning\\PatriceFiles\\Excel\\SlnmTsDta.xlsx");
		
		FileInputStream fstrm = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fstrm);
		
		XSSFSheet shet =  wb.getSheetAt(0);
		
		String cellValueA1 = shet.getRow(0).getCell(0).getStringCellValue();
		String cellValueB1 = shet.getRow(0).getCell(1).getStringCellValue();
		
		System.out.println("Excel Values User Name :  "+ cellValueA1  +"  and Password : " + cellValueB1);
		
		wb.close();
	}

}
