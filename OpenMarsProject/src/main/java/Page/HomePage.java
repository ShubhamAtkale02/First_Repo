package Page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseSelenium.Base;


public class HomePage extends Base {
	
	@FindBy(xpath="//a[@type='button'][3]")
	WebElement res;
	
   
	public HomePage() throws IOException {
		 PageFactory.initElements(driver, this);
		
	}
	public ResistrationPage homeMethod() throws IOException, InterruptedException {
		
		res.click();
		Thread.sleep(5000);
		return new  ResistrationPage();
	}

	
	
}
