@smoke
Feature: Logged user could select different tags

  @tag8
  Scenario Outline: Logged user could select different tags
    Given User open home page
    When User click on log in link
    And User entered "<username>" , "<password>"
    And User click on Log in button
    And Select cmputers category then hover and click on desktops
    And User select Tag
    Then Validate the selected tag page

        Examples: 
      | username  | password |
      |  k@n.com  | 12345678|
