Feature:Position Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
    And Click on the element in the left Nav
      | acceptCookies       |
      | humanResources      |
      | humanResourcesSetup |
      | positions           |

  Scenario: Create a position
    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | name_F | TestLEADDD |
      | code_F | Group190   |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayedd

  Scenario: Edit a position
    And User sending the keys in Dialog content
      | searchInputOne | TestLEADDD |

    And Click on the element in the Dialog
      | searchButton |
      | editButton   |

    And User sending the keys in Dialog content
      | name_F | TestLEADCampuss |
      | code_F | Group1919       |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayedd

  Scenario: Delete a position
    And User delete item from Dialog
      | TestLEADCampuss |

    Then Success message should be displayedd