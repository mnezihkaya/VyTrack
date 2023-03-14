
Feature: As a user, I should be accessing all the main modules of the app.

  AC #1: store and sales managers should view 8 module names.
  Expected module names: Dashboards, Fleet, Customers, Sales, Activities, Marketing, Reports & Segments, System
  AC #2: drivers should view 4 module names
  Expected module names: Fleet, Customers, Activities, System

  Accounts are: Drivers, Store Managers, Sales Managers

  Scenario: Driver should see 4 main module names
    When driver on Dashboard page
    Then driver should see four main modules
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |



  Scenario: Store Manager should see 8 main module names
    When store manager on Dashboard page
    Then manager should see eight main modules
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |


  Scenario: Sales Manager should see 8 main module names
    When sale manager on Dashboard page
    Then manager should see eight main modules
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |