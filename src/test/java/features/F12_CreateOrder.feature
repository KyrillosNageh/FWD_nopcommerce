@smoke
Feature: Create successful Order

  @tag12
  Scenario Outline: Create successful Order
    Given User open home page
    When User click on log in link
    And User entered "<username>" , "<password>"
    And User click on Log in button
    And User serch for "laptop"	
    Then Validate the results contains "Laptop" keyword
    When User add the product to cart
    Then Validate the product added to cart successfully
    When User navigate to shopping cart page and click on Checkout button
    And User entered "<countryName>" , "<address>" , "<postcode>", "<phone>", "<city>"
    
      Examples: 
      | username  | password | countryName  | address |	postcode	|	phone			|	city	|	
      |  k@n.com  | 12345678 |  Egypt  	    | cairo	  |	11511			|0123456789	|cairo	|

 			