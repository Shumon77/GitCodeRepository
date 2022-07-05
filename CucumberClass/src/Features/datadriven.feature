Feature: validating login page



  Scenario Outline: positive testing
  
    Given user is in the login page
    When user enters "<userid>" in the userid text box
    When user enters "<password>" in the password text box
    And user click on login button
    Then user should nevigate to the expected "<webpage>"
    
    

    Examples: 
      | userid                  | password     | webpage                                  |
      | standard_user           | secret_sauce | https://www.saucedemo.com/inventory.html |
      | locked_out_user         | secret_sauce | https://www.saucedemo.com/               |
      | problem_user            | secret_sauce | https://www.saucedemo.com/inventory.html |
      | performance_glitch_user | secret_sauce | https://www.saucedemo.com/inventory.html |
