package TestPackage;


import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseSelenium.Base;
import Page.FindPatientPage;
import Page.HomePage;
import Page.LoginPage;
import Page.ResistrationPage;

public class LoginPageTest extends Base{

	  public LoginPage lp; 
	  public HomePage hp; 
	 
	  
	  public LoginPageTest() throws IOException { super(); }
	  
	  @BeforeMethod 
	  public void launchBrowser() throws InterruptedException, IOException {
		  initialization();
	      lp=new LoginPage();
	  
	  }
//	  
//	  @Test(priority=1)
//	  public void validateLoginPage() throws IOException,
//	  InterruptedException {
//	  hp=lp.loginMethod(prop.getProperty("username"),prop.getProperty("password"));
//	  System.out.println("ValidateLoginPage is done");
//	 
//	  
//	  }
//	  

	  
		  @Test(priority=1) 
		  public void validateRegistrationOfPatientSuccessfully()throws IOException, InterruptedException { 
			 // initialization();
			  hp = lp.loginMethod(prop.getProperty("username"), prop.getProperty("password"));
			  HomePage hp=new HomePage();
			  hp.homeMethod();
			  ResistrationPage rp=new ResistrationPage();
			  rp.registerMethod();
			 
		  }
		  @Test(priority=2)
			public void verifyPatientIsAvailable() throws InterruptedException, IOException {
				    initialization();
					LoginPage lp=new LoginPage();
					lp.loginMethod(prop.getProperty("username"), prop.getProperty("password"));
					FindPatientPage fp=new FindPatientPage();
					fp.searchPatient();
			}
		  
		@AfterMethod 
	 public  void closeBrowser() {
		 driver.close();
	 }
	
	
	
	
	
	
	
	
	
	
	
	

}
