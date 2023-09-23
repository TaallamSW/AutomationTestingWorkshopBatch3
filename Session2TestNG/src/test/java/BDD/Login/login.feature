Feature: Login functionality

  Scenario: Valid login
    Given Navigate to login page
    When  Enter email "test@gmail.com"
    And   Enter password "test123"
    And   Click on Login Button
    Then  user is Logged in Successfully
    When  Click on Logout Button

  Scenario: In Valid login
    Given Navigate to login page
    When  Enter email "tesjfuagasuyg@gmail.com"
    And   Enter password "Tesfg@124"
    And   Click on Login Button
    Then  Error message will appear with text "Login was unsuccessful. Please correct the errors and try again.\nNo customer account found"