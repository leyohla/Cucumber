@Babu
Feature: Login to LeafTaps 
Login using positive negative and alternative flows.

@sanity
Scenario: Login(Positive)

Given Enter userName DemoCSR
And Enter password crmsfa
And click Login
Then verify Username Selenium

@smoke
Scenario Outline: Login(Negative)

Given Enter userName <username>
And Enter password <password>
And click Login
Then verify error Msg <eMsg>

Examples: 
|username|password|eMsg|
|DemoSalesManager|crmsfa1|Password incorrect.|
|Demo|crmsfa|User not found.|
||crmsfa|username was empty reenter|
|DemoSalesManager||password was empty reenter|











