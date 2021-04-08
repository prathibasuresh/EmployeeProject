package Excel_sheet_Handling;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.SheetVisibility;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_excel_sheet {

	public static void main(String[] args) throws Exception {
		String path="./TestData/data1.xlsx";
		Workbook w=WorkbookFactory.create(new FileInputStream(path));
		Sheet sheet = w.getSheet("TestData1");
		String cell1 = w.getSheet("TestData1").getRow(1).getCell(0).toString();
		System.out.println(cell1);
		String sheetname = w.getSheetName(0);
		System.out.println(sheetname);
		SheetVisibility vis = w.getSheetVisibility(0);
		System.out.println(vis);
		System.out.println("---------------------------------");
		int num1 = sheet.getFirstRowNum();
		System.out.println(num1);
		int num2 = sheet.getLastRowNum();
		System.out.println(num2);
		System.out.println("---------------------------------");
		short num3 = sheet.getRow(0).getFirstCellNum();
		System.out.println(num3);
		short num4 = sheet.getRow(0).getLastCellNum();
		System.out.println(num4);
		System.out.println("------------------------");
		System.out.println("Read row data");
		for (int i = 1; i <= num2; i++) {
			for (int j = 0; j < num4; j++) {
				 Cell rowdata = sheet.getRow(i).getCell(j);
				System.out.println(rowdata.toString());
			}
			System.out.println("-------------------");
		}
		
	
		
	}

}
