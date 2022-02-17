package Page;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseSelenium.Base;

public class FindPatientPage extends Base {

	public FindPatientPage() throws IOException {
		
		 PageFactory.initElements(driver, this);
			
	}
	@FindBy(xpath="//i[@class='icon-search']")
	WebElement find;
	@FindBy(xpath="//input[@id='patient-search']")
	WebElement search;
	
	
	
	public void searchPatient() {
		find.click();
		search.sendKeys("Sham Navin Patil");
		((WebElement) driver).sendKeys(Keys.ENTER);
		
	}
}
