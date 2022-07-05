#Author: your.email@your.domain.com
#Keywords Summary :


Feature: Validating Login Page
  

 Background:
 
 Given when user is in the login page
  
  
  
  Scenario: Test with positive data
   
    
    And user enter firstName
    When user enters lastName
    
    
    
  Scenario: Test with negative data
   
    And user enter invalid firstName
    When user enters invalid lastName
    
    
    Scenario Outline:
    
    When user enter's "<firstName>" in the userName test box
    Then user enter's "<lastName>" in the lastName text box
    Then user should navigate to expected page "<webpage>"

    Examples: 
      | firstName | lastName | webpage                                |
      | Tom1      | John1    | https://login.yahoo.com/account/create |
      | Michel    | Bob      | https://login.yahoo.com/account/create |
    
    


  
  