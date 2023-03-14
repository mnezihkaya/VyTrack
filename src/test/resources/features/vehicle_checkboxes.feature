
Feature:  As a user, I should be able to select any vehicle from the Vehicle page.

  AC #1: once the user launched to the Vehicle page, all the checkboxes should be unchecked

  AC #2: user check the first checkbox to check all the cars

  AC #3: users can select any car


  Scenario Outline: Users should be able to select any vehicle from the Vehicle page.
    Given user '<username>' login to the Dashboard
    When user on Dashboard page
    And user navigates to "Fleet" module and clicks "Vehicles"
    Then user should see all the checkboxes are unchecked
    And user click first checkbox
    Then user should see all the checkBoxes are checked
    And user click first checkbox
    And user click any checkbox
    Then user should see that checkbox is selected
    Examples:
      | username        |
      | storemanager67  |
