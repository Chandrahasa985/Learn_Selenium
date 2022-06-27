package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class DataReadingFromExcel {

		public static void main (String[] args) throws IOException {
			
			FileInputStream file = new FileInputStream("C:\\Users\\chandrahasa\\eclipse-workspace\\learnSelenium\\src\\main\\java\\ExcelFiles\\SampleAutomation.xlsx");
			//FileInputStream file = new FileInputStream("C://Users//chandrahasa//eclipse-workspace//learnSelenium//src//main//java//ExcelFiles//SampleAutomation.xlsx");
			
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheet("EmployDetails");
			
			int RC = sheet.getLastRowNum();
			int CC = sheet.getRow(0).getLastCellNum();
			
			for(int i=1; i<=RC;i++) {
				XSSFRow Currentrow = sheet.getRow(i);
				
				for(int j=0; j<CC;j++) {
					String value = Currentrow.getCell(j).toString();
					System.out.print("    "+value);
							
				}
				System.out.println();
			}
			
			
			
		}
}
