Feature: Check login functionality

  Scenario Outline:
    Given user is on login page
    When user enters <username> and <password>
    And clicks login button
    Then user is navigated to home page

    Examples:
      | username | password |
      | vaishnav | 12345    |
      | puram    | 12345    |



