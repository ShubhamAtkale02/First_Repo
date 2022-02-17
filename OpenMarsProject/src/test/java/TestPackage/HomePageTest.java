package TestPackage;
import java.io.IOException;

import org.testng.annotations.Test;

import BaseSelenium.Base;
import Page.HomePage;
import Page.LoginPage;
import Page.ResistrationPage;

public class HomePageTest extends Base {

	public HomePageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void validateRegistrationOfPatient() throws IOException, InterruptedException{
		  initialization();
		LoginPage lp=new LoginPage();
		lp.loginMethod(prop.getProperty("username"), prop.getProperty("password"));
		HomePage hp=new HomePage();
		hp.homeMethod();
		ResistrationPage rp= new ResistrationPage();
		rp.registerMethod();
	}
}
