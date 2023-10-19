Feature: Login page website saucedemo

  Scenario: Success Login
    Given User in login page
    When Input username
    And Input password
    And click login button
    Then User in home page

  Scenario: Failed Login
    Given User in login page
    When Input username
    And Input invalid password login
    And click login button
    Then User get error message