Feature: Human Resource

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button

  Scenario: Creat,edit and delete a position
    When Go to HumanResource in the Omer's DialogContent

      | cookiesAccept                   |
      | humanResource                   |
      | HumanResourceSetup              |
      | humanResourcePositionCategories |

    And Click on the element in the Omer's DialogContent

      | addButton |

    And Send on the element in the Omer's DialogContent

      | nameInput | Omar AGA |

    And Click on the element in the Omer's DialogContent

      | saveButton |

    Then Verify on the element in the Omer's DialogContent

      | successMessage | successfully |

    When Send on the element in the Omer's DialogContent

      | searchInput | Omar AGA |

  #  And Wait Until Flash DialogContent
   #   | searchButton | style | visibility: visible; |
    And Click on the element in the Omer's DialogContent
      | searchButton |
    And Wait until element to be clickable Omer's DialogContent
      | searchButton |
  #  And Wait Until Flash DialogContent
   #   |searchButton|style|visibility: visible;|
    #And Wait until visible
    #  | positionListName |

   # And Wait until all elements visible in the Omer's DialogContent
    #  | elemets |
   # And Wait Stainless in the Omer's DialogContent
    #  | stainlessElement |
#    And Wait until all elements visible in the Omer's DialogContent
#      | name |
#    And Click on the element in the Omer's DialogContent
#      | deleteButton       |
#      |  cancel       |
#    And Wait Stainless in the Omer's DialogContent
#      | editButton |

#    And Wait Until Flash DialogContent
#      | editButton | class | cdk-moused-focused |
    And Action class in the Omer's DialogContent
      | editButton |
    And Send on the element in the Omer's DialogContent
      | nameInput | Omar Faruk AGA |
    And Click on the element in the Omer's DialogContent
      | saveButton |
    Then Verify on the element in the Omer's DialogContent
      | successMessage | successfully |
    When Send on the element in the Omer's DialogContent
      | searchInput | Omar Faruk AGA |
    And Wait Until Flash DialogContent
      | searchButton | style | visibility: visible; |
    And Click on the element in the Omer's DialogContent
      | searchButton |
    And Wait until element to be clickable Omer's DialogContent
      | searchButton |
#    And Wait until all elements visible in the Omer's DialogContent
#      | name2 |
#    And Wait until all elements visible in the Omer's DialogContent
#      | elemets |
    And Action class in the Omer's DialogContent
      | deleteButton       |
      | deleteDialogButton |
    Then Verify on the element in the Omer's DialogContent
      | successMessage | successfully |