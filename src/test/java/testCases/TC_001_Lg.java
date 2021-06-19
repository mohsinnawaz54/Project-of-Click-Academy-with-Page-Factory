package testCases;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;

public class TC_001_Lg extends BaseClass {
	
	@Test
	public void AddToCart() {
		driver.get(baseURL);
		
		
		LoginPage lg= new LoginPage(driver);
		lg.getLoginPage();
		HomePage home = new HomePage(driver);
		home.getEmailId(username);
	    home.getPassword(password);
		home.getLogiClick();
		
	}
	
	
		
		
	}


