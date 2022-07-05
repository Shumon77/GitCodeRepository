


Feature: validating login featue

Background:

Given user is in the login page


Scenario: positive testing


When user enters right username
When user enters right password
And user click on login button
Then user should able to login


Scenario: negative testing for login page

When user enters wrong username
When user enters wrong password
And user click on login button with wrong data
Then user should not be able to login