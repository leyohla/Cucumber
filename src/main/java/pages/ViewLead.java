package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods{
	
	@FindBy(how=How.XPATH, using = "//div[contains(text(),'View Lead')]")
	private WebElement eleverifyview;
	public DuplicateLeadPage verifyLoggedName(String data) {
		verifyPartialText(eleverifyview, data);
		return new DuplicateLeadPage();		
	}

}
