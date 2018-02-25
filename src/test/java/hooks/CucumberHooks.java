package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class CucumberHooks extends SeMethods{
	
//	@Before
	/*public void begin(){
		startResult();
		test = startTestCase("Login", "Login to Leaftaps");
		test.assignCategory("smoke");
		test.assignAuthor("Babu");
		startApp("chrome");
	}
	
	@Before
	public void beginSanity(){
		startResult();
		test = startTestCase("Login", "Login to Leaftaps");
		test.assignCategory("sanity");
		test.assignAuthor("Babu");
		startApp("chrome");
	}
*/
	@Before
	public void CreateLeads(){
		startResult();
		test = startTestCase("CreateLead", "Create a lead");
		test.assignCategory("Sanity");
		test.assignAuthor("Mukes");
		startApp("chrome");
	}
	
	@After
	public void end(){
		closeAllBrowsers();
		endTestcase();
		endResult();
	}
}








