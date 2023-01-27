Feature: Register Functionality Scenarios in TutorialNinja.com

@Register @one
Scenario: Verify User can able to provide all the valid datas into the Respective  Input fields

Given Launch the application and provided the application url
And I navigate to Account Register page
Then provide the valid detail into the Register page

				| FirstName | Koothabiran   |
				| LastName  | Sagadevan     |
				|Email      | 1xyz@gmail.com |
				| Telephone | 1234567890    |
				| Password  | Testing       |
				
And I select the privacy policy
Then I click on continue button
Then I should see the user account has been created sucessfully

@Register @Two
Scenario: Verify user can able to register the accound without providing any details

Given Launch the application and provided the application url
And I navigate to Account Register page
Then I click on continue button
Then I should see the Warning messages into the respective field

@Register @Three
Scenario: Verify user can Register duplicated account or not

Given Launch the application and provided the application url
And I navigate to Account Register page
Then provide the Duplicated detail into the Register page

				| FirstName | Koothabiran   |
				| LastName  | Sagadevan     |
				|Email      | 1xyz@gmail.com |
				| Telephone | 1234567890    |
				| Password  | Testing       |
				
And I select the privacy policy
Then I click on continue button
Then I should see the main Warning message

 