package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;


public class HomePage extends ProjectMethods  {

	public HomePage(){
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.XPATH,using="//h2")
	public WebElement eleLoggedName;

	@Then("verify Username (.*)")
	public HomePage verifyLoggedName(String data) {
		verifyPartialText(eleLoggedName, data);
		return this;
	}
	
	
	@FindBy(how=How.LINK_TEXT,using="CRM/SFA")
	private WebElement eleclickCRM;
	@Given("Click CRMFSA link")
    public MyHomePage clcikCRMlink() {
    	click(eleclickCRM);
    	return new MyHomePage();
    }



}







