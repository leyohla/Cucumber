package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import wdMethods.ProjectMethods;

public class Createlead extends ProjectMethods{
	
	public Createlead() {
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.ID,using ="createLeadForm_companyName")
	private WebElement eleCmpnyNm;
	@Given("Enter CompanyName (.*)")
	public Createlead cmpnynm(String data) {
		type(eleCmpnyNm,data);
		return this;
	}
	
	
	@FindBy(how=How.ID,using ="createLeadForm_firstName")
	private WebElement elefn;
	@Given("Enter FN (.*)")
	public Createlead firstnm(String data) {
		type(elefn,data);
		return this;
	}
	

	@FindBy(how=How.ID,using ="createLeadForm_lastName")
	private WebElement emplastnm;
	@Given("Enter LN (.*)")
	public Createlead lastnm(String data) {
		type(emplastnm,data);
		return this;
	}

	
	@FindBy(how=How.CLASS_NAME,using ="smallSubmit")
	private WebElement eleclickcretlead;
	@Given("ClickSubmit")
	public ViewLead clicksubmit() {
		click(eleclickcretlead);;
		return new ViewLead();
		
	}
}
