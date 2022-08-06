@smoke
Feature: Logged user could select different Categories

  @tag1
  Scenario Outline: Logged user could select different Categories
    Given User open home page
    When User click on log in link
    And User entered "<username>" , "<password>"
    And User click on Log in button
    Then Validate the user log in successflly
    When Select cmputers category then hover and click on desktops
    Then Validate the page title is contain the name of the category 

        Examples: 
      | username  | password |
      |  k@n.com  | 12345678|