package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;


public class TC001_Login extends ProjectMethods{

	@BeforeClass
	public void setData() {
		testCaseName="TC001_Login";
		testDescription="Login to leaftaps";
		browserName="chrome";
		dataSheetName="TC001";
		category="Smoke";
		authors="Gopi";
	}

	@Test(dataProvider="fetchData")
	public void createLead(String userName, String password, String comnyName, String firstName, String lastName, String eMail){

		new LoginPage()
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin();			
	}
}
