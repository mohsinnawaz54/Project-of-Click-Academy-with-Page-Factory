package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "user_email")
	
	WebElement email;
	
	@FindBy(id = "user_password")
	
	WebElement pass;
	
	@FindBy(xpath = "//input[@value='Log In']")
	
	WebElement loginClick ;
	
	public void getEmailId(String  username) {
		email.sendKeys(username);
	}
	
	public void getPassword(String password) {
		pass.sendKeys(password);
	}
	
	public void getLogiClick() {
		loginClick.click();
	}
	

}
