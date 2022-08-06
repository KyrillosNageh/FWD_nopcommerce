@smoke
Feature: User could register

  @Scenario>>>User_could_register_with_valid_data
  Scenario Outline: User could register with valid data
    Given User open home page
    When User click on register link
    And User entered "<firstname>" , "<lastname>" , "<email>" , "<password>"
    And User click on register button
    Then Validate the registration done successfully
 	
 	Examples:
 	 | firstname | lastname | email 	| password |
 	 | Ahmed 		 | Ali 			| d@e.com	| 12345678 |
