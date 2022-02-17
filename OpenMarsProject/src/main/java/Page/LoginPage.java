package Page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseSelenium.Base;

public class LoginPage extends Base {

	
	@FindBy(xpath="//input[@id='username']")
	WebElement userName;
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	@FindBy(xpath="//li[@id='Inpatient Ward']")
	WebElement ward;
	@FindBy(xpath="//input[@class='btn confirm']")
	WebElement loginbtn;
	

	public LoginPage() throws IOException {
		
		PageFactory.initElements(driver, this);
	
	}
	public HomePage loginMethod(String un,String pass) throws IOException {
		userName.sendKeys(un);
		password.sendKeys(pass);
		ward.click();
		loginbtn.click();
		return new HomePage();
		
	}	
	
}
