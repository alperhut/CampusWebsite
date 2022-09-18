Feature: Discount Functionality

  Background:
    Given Navigate to basqar
    And Enter username and password and click login button
    Then User should login successfuly
    And Click on the element in the left Nav
      | acceptCookies |
      | setupOne      |
      | parameters    |
      | discounts     |

  Scenario: Create a Discount

    And  Click on the element in the Dialog
      | addButton |

    And  User sending the keys in Dialog content

      | descriptionInput | Suleyman Sartre |
      | integrationCode  | SS              |
      | priority         | 35              |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayedd

  Scenario: Edit a Discount

    And User sending the keys in Dialog content
      | searchInputOne | Suleyman Sartre |

    And Click on the element in the Dialog
      | searchButton |
      | editButton   |

    And User sending the keys in Dialog content

      | descriptionInput | Haydar Heidegger |
      | integrationCode  | HH               |
      | priority         | 29               |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayedd

  Scenario: Delete a Discount
    And User delete item from Dialog
      | Haydar Heidegger |

    Then Success message should be displayedd











