Feature:Subject Categories Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
    And Click on the element in the left Nav
      | acceptCookies     |
      | education         |
      | educationSetup    |
      | subjectCategories |

  Scenario: Create a subject categories
    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | name_F | ScrumMMM |
      | code_F | z11      |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayedd

  Scenario: Edit a subject categories
    And User sending the keys in Dialog content
      | searchInputOne | ScrumMMM |

    And Click on the element in the Dialog
      | searchButton |
      | editButton   |

    And User sending the keys in Dialog content
      | name_F | POwnerr |
      | code_F | z2      |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayedd

  Scenario: Delete a subject categories
    And User delete item from Dialog
      | POwnerr |

    Then Success message should be displayedd