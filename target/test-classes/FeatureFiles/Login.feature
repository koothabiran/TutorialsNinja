Feature: Login functionality scenarios


@Login @one
Scenario: Verify User can able to login the application with valid credentials

  Given  Launch the application and provided the application url
  And I navigate to the Application Login page
  Then I enter the username "1xyz@gmail.com" and the password "Testing"
  Then I should see the user should logged successfuly or not
  
  @Login @Two
Scenario: Verify user can able to login the application with Invalid credentials

  Given  Launch the application and provided the application url
  And I navigate to the Application Login page
  Then I enter the username "1xyzr@gmail.com" and the password "Testing12"
  Then I should see the user should not be logged successfuly 
  
   @Login @Three
Scenario: Verify user can able to login the application without providing any credentials

  Given  Launch the application and provided the application url
  And I navigate to the Application Login page
  Then I enter the username "" and the password ""
  Then I should see the user should not be logged successfuly 