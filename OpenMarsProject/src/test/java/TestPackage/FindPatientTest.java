package TestPackage;
import java.io.IOException;

import org.testng.annotations.Test;

import BaseSelenium.Base;
import Page.FindPatientPage;
import Page.LoginPage;

public class FindPatientTest extends Base{

	public FindPatientTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@Test
	public void verifyPatientIsAvailable() throws InterruptedException, IOException {
		    initialization();
			LoginPage lp=new LoginPage();
			lp.loginMethod(prop.getProperty("username"), prop.getProperty("password"));
			FindPatientPage fp=new FindPatientPage();
			fp.searchPatient();
	}

}
