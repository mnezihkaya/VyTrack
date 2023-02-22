Feature: Users should be able to successfully login to the Vytrack Page


  Scenario Outline: User should successfully login with correct credentials
    Given user on the login page
    When user enters "<UserName>" and user enters "<Password>"
    Then user should see the dashboard
    Examples:
      | UserName | Password    |
      | user31   | UserUser123 |





