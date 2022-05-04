Feature: Base testing of polovni automobili
@Smoke
  Scenario: Number Number of filters with drop down menu
    Given I am on home page
    Then I see number of filters with drop down is 8
@Regresion
  Scenario: chech car for first visible car
    Given I am on home page
    When I click on first visible car
    And I go to new opened window
    Then I print our price

  Scenario: Filtering criteria for fuel
    Given I am on home page
    When I open fuel menu
    Then I see that i ddid not o well