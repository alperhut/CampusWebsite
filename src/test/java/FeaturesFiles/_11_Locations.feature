Feature: Attestations Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button

  Scenario Outline: Add Locations

    And Click on the element in the left Nav

      | acceptCookies |
      | setUp         |
      | schoolSetup   |
      | locations     |

    And Create to new "<Locations>" and "<shortName>"  and "<capacity>" from location

    Then Success message should be displayed from location

    And Edit to "<newLocations>" and "<newShortName>" and "<newcCapacity>" from location

    Then Success message should be displayed from location

    And Click to Delete Button from location

    Then Success message should be displayed from location

    Examples:
      | Locations | shortName | capacity | newLocations | newShortName | newcCapacity |
      | Igdir     | Sweden    | 99999    | Elazig       | Finland      | 89999        |

