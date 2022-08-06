@smoke
Feature: User Could Login

  @tag2
  Scenario Outline: User could log in with valid email and password
    Given User open home page
    When User click on log in link
    And User entered "<username>" , "<password>"
    And User click on Log in button
    Then Validate the user log in successflly
    
    
        Examples: 
      | username  | password |
      |  k@n.com  | 12345678 |

