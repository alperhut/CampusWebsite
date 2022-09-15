Feature: Attestations Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario Outline: Add Position

    And Click on the element in the left Nav

      | acceptCookies |
      | HResources    |
      | underHRsetup  |
      | Position      |

    And Create to new "<Position>", "<shortName>" from Position

    Then Success message should be displayed

    And Edit to "<newPosition>", "<newshortName>"  from Position

    Then Success message should be displayed

    And Click to Delete Button from Position

    Then Success message should be displayed

    Examples:
      | Position | shortName | newPosition | newshortName |
      | yeniElf  | Elrond    | Gral        | oldu         |









