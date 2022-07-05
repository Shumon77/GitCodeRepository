#Author: your.email@your.domain.com
#Keywords Summary :





Feature: Title of your feature


  Scenario Outline: Title of your scenario outline
  
    Given user is in login page
    When user enter's "<firstName>" in the userName test box
    Then user enter's "<lastName>" in the lastName text box
    Then user should navigate to expected page "<webpage>"

    Examples: 
      | firstName | lastName | webpage                                |  |
      | Tom1      | John1    | https://login.yahoo.com/account/create |  |
      | Michel    | Bob      | https://login.yahoo.com/account/create |  |
