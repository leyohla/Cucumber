@CreateLead
Feature: To Create a Lead 

Scenario Outline:: Create Lead 

	Given Enter userName <username> 
	And Enter password <password> 
	And click Login 
#	Then verify Username <VuserName> 
	And Click CRMFSA link 
	And Click LeadsTab 
	And Click Create lead
	And Enter CompanyName Test
	And Enter FN MK
	And Enter LN PR 
	And ClickSubmit 
	
 Examples:
|username|password|
|DemoSalesManager|crmsfa|