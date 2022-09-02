Feature: Attestations Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button

  Scenario Outline: Add Attestations

    And Click on the element in the left Nav

      | acceptCookies |
      | HResources    |
      | underHRsetup  |
      | Attestations  |

    And Create to new "<Attestations>"

    Then Success message should be displayed

    And Edit to "<newAttestations>"

    Then Success message should be displayed

    And Click to Delete Button

    Then Success message should be displayed

    Examples:
      | Attestations    | newAttestations |
      | Charles Doğan   | Münevver Pessoa |
      | Byun chul Şahin | Mevlud Rimbaud  |








