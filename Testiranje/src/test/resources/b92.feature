Feature: Base testing of B92

  Scenario Outline: URl verifiation
    Given I am on home page
    When I click on the "<link>"
    And I switch to new window
    Then I am on this "<url>"
    Examples:
      | link      | url                                |
      | facebook  | https://twitter.com/b92vesti/      |
      | instagram | https://www.facebook.com/B92vesti/ |
      | twitter   | https://www.instagram.com/b92net/  |

    Scenario: I items on more section
      Given I am on home page
      When I mouse over more section
      Then I should see 7 items
      And There should be items
      |Korona|
      |Kultura|
      |#kakosi       |
      |eSports              |
      |Nekretnine           |
      |Vreme                |
      |Mape                 |

      Scenario: Dates in vremenska prognoza
        Given I am on home page
        When I go to vremenska prognoza
        Then I should se current date

