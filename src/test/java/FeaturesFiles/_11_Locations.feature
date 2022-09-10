Feature: Locations Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button

  Scenario Outline: Add,Edit and Delete Locations

    And Click on the element in the left Nav

      | acceptCookies |
      | setUp         |
      | schoolSetup   |
      | locations     |

    And Create to new Locations and shortName  and capacity from location
      | nameInput      | <Locations> |
      | shortNameInput | <shortName> |
      | capacity       | <capacity>  |

    And Click to Location type
      | locationType |
      | locTypeOther |
      | saveButton   |

    Then Success message should be displayed from location

    And Edit to newLocations and newShortName and newcCapacity from location
      | nameInput      | <newLocations> |
      | shortNameInput | <newShortName> |
      | capacity       | <newCapacity>  |

    And Click to Location type
      | locationType |
      | locTypeOther |
      | saveButton   |

    Then Success message should be displayed from location

    And Click to Delete Button from Locations

    Then Success message should be displayed from location

    Examples:
      | Locations   | shortName | capacity | newLocations   | newShortName | newCapacity |
      | GAZIToronto | SnKilda   | 99999    | SANLIVancouver | Missisipi    | 89999       |

