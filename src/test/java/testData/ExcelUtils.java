package testData;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelUtils {
	
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	
	public ExcelUtils(String excelPath, String sheetName )  {
		try{
		workbook = new XSSFWorkbook(excelPath);
		sheet = workbook.getSheet(sheetName);
	}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	
	public int getRowCount(){
		int rowCount=0;
		try {
		rowCount=sheet.getPhysicalNumberOfRows();
		System.out.println(rowCount);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return rowCount;
		
	}
	public int getCellCount() {
		int colCount=0;
		try {
		 colCount=sheet.getRow(0).getPhysicalNumberOfCells();
		 System.out.println(colCount);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return  colCount;
	
		
	}
	
	public String getCellData(int rowNum ,int colNum) {
		 String cellData = null;
		 try {
		
		cellData= sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		
	   
		 }
		 catch (Exception e) {
			// TODO: handle exception
		}
		 return cellData;
	}
	
	public void getCellNumData(int rowNum, int colNum) {
		try {
		double cellNumData= sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
	    System.out.println(cellNumData);
	
	}
		catch (Exception e) {
			// TODO: handle exception
		}

}
	}
	
