package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class DuplicateLeadPage extends ProjectMethods {
	public DuplicateLeadPage() {
		PageFactory.initElements(driver, this);
	}

	
	public DuplicateLeadPage VerifyTitleOfDuplicateLead(String title) {
	   verifyTitle(title);
	   return this;
	}
	@FindBy(how=How.XPATH, using="//input[@class='smallSubmit']")
	private WebElement elecreateLeadButtn;
	public ViewLead clickCreateLeadbuttn() {
		click(elecreateLeadButtn);
		return new ViewLead();
		
	}
}
