package testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import testData.ReadConfig;



public class BaseClass {
	
	ReadConfig read = new ReadConfig();
	public String baseURL = read.getApplicationURL();
	public String username= read.getUserName();
	public String password= read.getPassword();
	
	public WebDriver driver;
	
	
	@BeforeClass
	public void setup(){
		System.setProperty("webdriver.chrome.driver", read.getChromePath());
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(baseURL);
		
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
		
	}
	

}
