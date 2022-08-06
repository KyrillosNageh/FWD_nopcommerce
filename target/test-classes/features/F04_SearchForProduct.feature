@smoke
Feature: Logged User could search for any product

  @tag4
  Scenario Outline: Logged User could search for book
    Given User open home page
    When User click on log in link
    And User entered "<username>" , "<password>"
    And User click on Log in button
    Then Validate the user log in successflly
    When User Autocomplet serch for "First Prize Pies"
    Then Validate the search

        Examples: 
      | username  | password |
      |  k@n.com  | 12345678|