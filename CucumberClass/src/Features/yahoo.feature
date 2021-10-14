Feature: data driven testing



  Scenario Outline: login test
    Given user login to signup page
    When user enters firstname "<firstName>" for signup page
    When user enters lastname "<lastName>" for signup page
    
    

    Examples: 
      | firstName | lastName |
      | John      | Tom      |
      | Mike      | Bob      |
      | Syed      | Shumon   |
