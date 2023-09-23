Feature: Login functionality

  Scenario: Valid login
    Given Navigate to login page
    When  Enter email "test@gmail.com"
    And   Enter password "test123"
    And   Click on Login Button
    Then  user is Logged in Successfully
    When  Click on Logout Button

  Scenario Outline: In Valid login
    Given Navigate to login page
    When  Enter email <username>
    And   Enter password <password>
    And   Click on Login Button
    Then  Error message will appear with text <Message>
    Examples:
      |username  | password| Message|