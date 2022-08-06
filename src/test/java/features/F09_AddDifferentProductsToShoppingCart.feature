@smoke
Feature: Logged user could add different products to Shopping cart

  @tag9
  Scenario Outline: Logged user could add different products to Shopping cart
    Given User open home page
    When User click on log in link
    And User entered "<username>" , "<password>"
    And User click on Log in button
    And User serch for "laptop"	
    Then Validate the results contains "Laptop" keyword
    When User add the product to cart
    Then Validate the product added to cart successfully
    
            Examples: 
      | username  | password |
      |  k@n.com  | 12345678|
