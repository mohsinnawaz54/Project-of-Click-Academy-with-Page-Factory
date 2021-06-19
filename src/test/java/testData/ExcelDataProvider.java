package testData;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.commons.collections4.functors.CatchAndRethrowClosure;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	//@Test(dataProvider = "testData")
	public void test1(String username, String password ) {
		System.out.println(username+ "|" + password);
		
	}
	
	
	//@DataProvider(name= "testData")
	public Object[][] getData() throws IOException {
		String excelPath="/Users/mohsinnawaz/eclipse-workspace/ProjectwithPageFactory/excel/data.xlsx";
		Object data [][]= testData(excelPath, "Sheet1");
		return data;
		
	}
	
	
	//@Test
	public Object[][] testData(String excelPath, String sheetName) throws IOException {
		
		ExcelUtils excel= new ExcelUtils(excelPath, sheetName);	
		
		int rowCount=excel.getRowCount();
		int colCount= excel.getCellCount();
		
		Object data[][]= new Object[rowCount-1][colCount];
     
    		for(int i=1;i<rowCount;i++) {
    			for(int j=0;j<colCount;j++) {
    				String cellData= excel.getCellData(i,j);
    				//System.out.print(cellData);
    				data[i-1][j]= cellData;
    	 }
    		
    		System.out.println();
    		
     }
    		return data;
		
	}
}
