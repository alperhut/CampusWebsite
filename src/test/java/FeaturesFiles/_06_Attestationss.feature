Feature: Attestations Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
    And Click on the element in the left Nav

      | acceptCookies       |
      | humanResources      |
      | humanResourcesSetup |
      | attestations        |

  Scenario:Create a Attestations
    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | searchInputTwo | Francine GurCesme |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayedd

  Scenario:Edit a Attestations
    And User sending the keys in Dialog content
      | searchInputOne | Francine GurCesme |

    And Click on the element in the Dialog
      | searchButton |

    And Click on the element in the Dialog
      | editButton |

    And User sending the keys in Dialog content
      | searchInputTwo | Friedrich OzDemir |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayedd

  Scenario:Delete a Attestations
    And User delete item from Dialog
      | Friedrich OzDemir |

    Then Success message should be displayedd










