

Feature: validating the login feature

Scenario: positive testing for login

Given user is in the login page
When user enters right username
When user enters right password
Then user should be able to login
