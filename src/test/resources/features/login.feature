Feature: feature to test login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given browser is open
    When user enters <username> and <password>
    And clicks login button
    Then user is navigated to home page

    Examples:
      | username       | password |
      | Vaishnav Puram | 12345    |
      | John           | 12345    |

    
