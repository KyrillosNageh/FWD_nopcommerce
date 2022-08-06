@smoke
Feature: Logged user could add different products to compare list

  @tag11
  Scenario Outline: Logged user could add different products to compare list
    Given User open home page
    When User click on log in link
    And User entered "<username>" , "<password>"
    And User click on Log in button
    Then Validate the user log in successflly
    When User serch for "Laptop"	
    Then Validate the results contains "Laptop" keyword
    When User add a differnt products to compare list
    Then Validate the product added to compare list successfully
    
            Examples: 
      | username  | password |
      |  k@n.com  | 12345678|

