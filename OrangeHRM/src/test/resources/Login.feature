@smokeTest 
Feature: Validate login function in Orange HRM 

Scenario: User able to login with valid credential 
	Given user open web browser and navigate to HRM login screen ak 
	Then user Navigate to Page and verify the Page Title is "OrangeHRM" ak
	And user enter a valid username and password ak
	And user click the Sign in button ak
	Then user Navigate to Page and verify the Page Title is "OrangeHRM" ak
	When user click on log out button for Orange Hrm ak
	Then user Navigate to Page and verify the Page Title is "OrangeHRM" ak