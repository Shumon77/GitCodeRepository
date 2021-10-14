

Feature: login test


@smoke
Scenario Outline: positive testing

Given user is in the login page
When user enters "<userid>" in the userid text box
When user enters "<password>" in the password text box
And user click on login button
Then user should nevigate to the "<webpage>"


Examples:

|userid|password|webpage|
|standard_user|secret_sauce|https://www.saucedemo.com/inventory.html|