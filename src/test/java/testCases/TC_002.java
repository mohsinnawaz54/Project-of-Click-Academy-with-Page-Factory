package testCases;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testData.ExcelUtils;

public class TC_002  extends BaseClass{
 
	
	@Test(dataProvider = "testData")
	public void loginData(String username, String password ) {
		driver.get(baseURL);
		
		LoginPage lg= new LoginPage(driver);
		lg.getLoginPage();
		HomePage home = new HomePage(driver);
		home.getEmailId(username);
		home.getPassword(password);
		home.getLogiClick();
		
		
	}
	
	
	@DataProvider(name= "testData")
	public Object[][] getData() throws IOException {
		String excelPath="/Users/mohsinnawaz/eclipse-workspace/ProjectwithPageFactory/excel/data.xlsx";
		Object data [][]= testData(excelPath, "Sheet1");
		return data;
		
	}
	
	
	@Test
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
