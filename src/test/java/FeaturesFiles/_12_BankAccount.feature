Feature: Bank Account Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
    And Click on the element in the left Nav
      | acceptCookies |
      | setupOne      |
      | parameters    |
      | bankAccounts  |

  Scenario: Add a Bank Account
    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | searchInputTwo   | AlanWattss    |
      | ibanInput        | TR00 9565 000 |
      | integrationCode2 | 0123          |

    And Click on the element in the Dialog
      | currency       |
      | currencyselect |
      | saveButton     |

    Then Success message should be displayedd

  Scenario: Edit Bank Account
    When Click on the element in the Dialog
      | editButton |

    And User sending the keys in Dialog content
      | searchInputTwo   | MartinGreenfeldd |
      | ibanInput        | TR55 5667 111    |
      | integrationCode2 | 0321             |

    And Click on the element in the Dialog
      | currency        |
      | currencyselect2 |
      | saveButton      |

    Then Success message should be displayedd

  Scenario: Delete Bank Account
    When Click on the element in the Dialog
      | deleteButton |

    And Click on the element in the Dialog
      | deleteDialogButton |

    Then Success message should be displayedd
