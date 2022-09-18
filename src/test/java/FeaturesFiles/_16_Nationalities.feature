Feature:  Nationalities Functionality

  Background:
    Given Navigate to basqar
    And Enter username and password and click login button
    Then User should login successfuly
    And Click on the element in the left Nav

      | acceptCookies |
      | setupOne      |
      | parameters    |
      | nationalities |


  Scenario:Create a Nationality
    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | searchInputTwo | PapuaGaziGine |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayedd

  Scenario: Edit a Nationality
    And User sending the keys in Dialog content
      | searchInputOne | PapuaGaziGine |

    And Click on the element in the Dialog
      | searchButton |
      | editButton   |

    And User sending the keys in Dialog content
      | searchInputTwo | NewVan |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayedd

  Scenario: Delete a Nationality
    And User delete item from Dialog
      | NewVan |

    Then Success message should be displayedd




