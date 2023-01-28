Feature: End to End scenario for placing orders


@Order @One
  Scenario: Verify whether user can able to Place orders
    Given I login to the application
    When I add a product to bag and checkout
   

