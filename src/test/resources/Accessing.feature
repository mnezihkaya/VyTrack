Feature: As a user, I should be accessing all the main modules of the app

  Scenario Outline: Store and Sales Manager should view all eight modules
    Given Managers goes to LoginPage
    When Store and Sales Manager login
    And verify the login the mainPage
    Then verify eight <Modules> were viewed
    Examples:
      | Modules            |
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | Systems            |

  Scenario Outline: Driver should view all eight modules
    Given Driver goes to LoginPage
    When Driver login
    And verify the login the mainPage
    Then verify four <Modules> were viewed
    Examples:
      | Modules            |
      | Fleet              |
      | Customers          |
      | Activities         |
      | Systems            |