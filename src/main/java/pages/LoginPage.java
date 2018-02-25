package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class LoginPage extends ProjectMethods  {

	// This is to confirm you are in Login Page
	public LoginPage(){
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(how=How.ID,using="username")
	private WebElement eleUserName;
	
	// Enter user name in Login Page
	@Given("Enter userName (.*)")
	public LoginPage enterUserName(String userName){
		type(eleUserName, userName);
		return this;
	}
	
	@FindBy(how=How.ID,using="password")
	private WebElement elePassword;
	
	// Enter password in Login Page,
	@Given("Enter password (.*)")
	public LoginPage enterPassword(String password){
		type(elePassword, password);
		return this;
		
	}
	
	@FindBy(how=How.CLASS_NAME,using="decorativeSubmit")
	private WebElement eleLogin;
	
	// Click login 
	@Given("click Login")
	public HomePage clickLogin(){
		click(eleLogin);
		return new HomePage();
	}
	
	// Click login button on negative case
	public LoginPage clickLoginForFailure(){
		click(eleLogin);
		return this;
	}
	
	@FindBy(how=How.ID,using="errorDiv")
	private WebElement eleErrorMessage;
	
	// Verify the error message
	@Then("verify error Msg (.*)")
	public LoginPage verifyErrorMsg(String text){
		verifyPartialText(eleErrorMessage, text);
		return this;
	}

}
