package Page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseSelenium.Base;

public class ResistrationPage extends Base{
	  
	    @FindBy(xpath="//input[@name='givenName']")
		WebElement Na;
		
	    @FindBy(name="middleName")
	    WebElement midName;
	    @FindBy(name="familyName")
	    WebElement fname;
	    @FindBy(id="next-button")
	    WebElement button;
	    @FindBy(xpath="//option[@value='M']")
	    WebElement male;
	    @FindBy(id="next-button")
	    WebElement nextbtn;
	    @FindBy(id="birthdateDay-field")
	    WebElement date;
	    @FindBy(xpath="//select[@id='birthdateMonth-field']")
	    WebElement month;
	    @FindBy(name="birthdateYear")
	    WebElement year;
	    @FindBy(xpath="//button[@id='next-button']")
	    WebElement nextbtn2;
	    @FindBy(id="address1")
	    WebElement add;
	    @FindBy (id="address2")
	    WebElement add2;
	    @FindBy(xpath="//input[@id='cityVillage']")
	    WebElement vll;
	    @FindBy(xpath="//input[@id='stateProvince']")
	    WebElement state;
	    @FindBy(id="country")
	    WebElement cont;
	    @FindBy(id="postalCode")
	    WebElement code;
	    @FindBy(xpath="//button[@id='next-button']")
	    WebElement nextbtn3;
	    @FindBy(name="phoneNumber")
	    WebElement num;
	    @FindBy(xpath="//button[@id='next-button']")
	    WebElement nextbtn4;
	    @FindBy(xpath="//select[@id='relationship_type']")
	    WebElement reletion;
	    @FindBy(xpath="//input[@placeholder='Person Name']")
	    WebElement per;
	    @FindBy(xpath="//button[@id='next-button']")
	    WebElement nextbtn5;
	    @FindBy(xpath="//input[@id='submit']")
	    WebElement submit;

		 public ResistrationPage() throws IOException {
			
			 PageFactory.initElements(driver, this);
		}
		 
	    public HomePage registerMethod() throws IOException, InterruptedException {
	    	
	         Na.sendKeys("Sham");
	    	midName.sendKeys("Navin");
	    	fname.sendKeys("Patil");
	    	button.click();
	    	male.click();
	    	nextbtn.click();
	    	date.sendKeys("14");
	    	Select se=new Select(month);
	    	se.selectByIndex(4);
	    	year.sendKeys("1997");
	    	nextbtn2.click();
	    	add.sendKeys("pune");
	    	add2.sendKeys("mumbai");
	    	vll.sendKeys("shegaon Dumala");
	    	state.sendKeys("Maharashtra");
	    	cont.sendKeys("India");
	    	Thread.sleep(2000);
	    	code.click();
	    	code.sendKeys("413311");
	    	nextbtn3.click();
	    	num.sendKeys("9988776655");
	    	nextbtn4.click();
	    	Select re=new Select(reletion);
	    	re.selectByValue("8d91a01c-c2cc-11de-8d13-0010c6dffd0f-A");
	    	Thread.sleep(2000);
	    	per.click();
	    	per.sendKeys("Sham");
	    	nextbtn5.click();
	    	submit.click();
	    	Thread.sleep(2000);
	    	driver.navigate().back();
	    	driver.navigate().back();
	    	
	    	return new HomePage();
	    	
	    }
}
