package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import wdMethods.ProjectMethods;

public class MyHomePage extends ProjectMethods{
	
	public MyHomePage() {
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.LINK_TEXT,using ="Leads")
	private WebElement clickleadtab;
	@Given("Click LeadsTab")
	public MyLeadsPage clickleads() {
		click(clickleadtab);
		return new MyLeadsPage();
	}

}
