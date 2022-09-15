Feature: Field Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button

  Scenario Outline: Add Field

    And Click on the element in the left Nav

      |acceptCookies|
      |setUp        |
      |parameters   |
      |Fields       |

    And Create new "<Field>"
    Then Success message should be on

    And Edit "<Field>" as "<newField>"
    Then Success message should be on

    And Delete "<newField>"
    Then Success message should be on


    Examples:

      |Field    |   newField    |
      |Field1   |   AanewField1 |
      |Field2   |   AanewField2 |
