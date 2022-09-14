Feature: Banka hesabı fonksiyonu

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario Outline: Banka hesabi duzenle

    And Click on the element in the left Nav
      | acceptCookies |
      | setUp         |
      | parameters    |
      | bankAccount   |

    And Banka hesabı ekle "<name>" "<iban>" "<currency>" "<integrationCode>"
    Then Islemi teyit et

    And Banka hesabi duzenle "<name>""<name2>""<iban2>"
    Then Islemi teyit et

    And Banka hesabi sil "<name2>"
    Then Islemi teyit et

    Examples:
      | name          | iban          | currency | integrationCode | name2  | iban2          |
      | kemal2272116  | TR12178726891 | tl       | TRY123          | dumrul | TR123746187891 |
      | mustafa172216 | EU98237126211 | eur      | EUR987          | tarkan | EU982754312111 |

