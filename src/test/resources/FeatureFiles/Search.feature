Feature:  Search functionality Scenarios

@Search @One
Scenario: Verify wheather user can able to search the product or not
  
  Given Launch the application and provided the application url
  When  I search the product "Samsung Syncmaster 941BW" 
  Then I should see the search product 
  
  @Search @Two
Scenario: Verify wheather user can get the Information about there is no Search results
  
  Given Launch the application and provided the application url
  When  I search the product "Apple Iphone" 
  Then I should see the No search results with "There is no product that matches the search criteria." 