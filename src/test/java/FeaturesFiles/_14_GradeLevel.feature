Feature: Grade Level Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario Outline: Add Grade Level

    And Click on the element in the left Nav

      | acceptCookies |
      | setUp         |
      | Parameters    |
      | gradeLevel    |

    And Create to new GradeLevel

      | nameInput      | <NameGL>      |
      | shortNameInput | <shortNameGL> |
      | order          | <orderGL>     |

    And Click to nextGradeLevel

      | nextGrade      |
      | nextGradeNalan |
      | saveButton     |

    Then Success message should be displayed from GradeLevel

    And Edit to GradeLevel

      | nameInput      | <newNameGL>      |
      | shortNameInput | <newShortNameGL> |
      | order          | <newOrderGL>     |

    And Click to nextGradeLevel

      | nextGrade      |
      | nextGradeNalan |
      | saveButton     |

    Then Success message should be displayed from GradeLevel

    And Click to Delete button from GradeLevel

    Then Success message should be displayed from GradeLevel

    Examples:
      | NameGL    | shortNameGL | orderGL | newNameGL        | newShortNameGL | newOrderGL |
      | Zizeggerr | zarttr      | 22      | haneggsigorhasas | zurtt          | 13         |





