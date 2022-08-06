@smoke
Feature: Logged user could filter the products

  @tag7
  Scenario Outline: Logged user could filter with color
    Given User open home page
    When User click on log in link
    And User entered "<username>" , "<password>"
    And User click on Log in button
    Then Validate the user log in successflly
    When Select Apparel category then hover and click on Shoes
    And User filter products by color
    Then Validate the products are filtered by selected color

        Examples: 
      | username  | password |
      |  k@n.com  | 12345678 |
