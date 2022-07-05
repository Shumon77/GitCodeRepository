#Author: your.email@your.domain.com
#Keywords Summary :


Feature: Validating SignIn page

  Scenario Outline: Title of your scenario outline
  
  
    Given User is in the login page
    When user enters "<firstName>" in firstname textBox
    Then user enters "<lastName>" in the lastName textbox
    Then User should navigate to expected page "<webpage>"

    Examples: 
      | firstName | lastName | webpage                                |
      | Tom       | Bob      | https://login.yahoo.com/account/create |
      | Tom1      | John     | https://login.yahoo.com/account/create |
