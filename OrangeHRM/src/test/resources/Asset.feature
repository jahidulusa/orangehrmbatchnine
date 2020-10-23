@jahidCode
Feature: Validate login function in Orange HRM 


	
	Scenario: User not able to save password with only numbers
	Given user open web browser and navigate to facebook.com
	Then user Navigate to Page and verify the Page Title is "Facebook"
	And user click on the create new account button
	And user enter first name and last name
	Then usre enter valid email address
	And user enter password with only numbers
	
	
	# this is a test to update git