@smoke
Feature: User could reset the password successfully

  @tag3
  Scenario Outline:  User could reset the password successfully
    Given User open home page
    When User click on log in link
    And User entered "<username>" , "<password>"
    And User click on Log in button
    Then Validate the user log in successflly
    When User click On MyAccount page
    And User click On change password page
    And User entered "12345678" and "newPassword"
    And User click on change password button
    Then Validate user changed the password successfully 
    
        Examples: 
      | username  | password |
      |  k@n1.com | 12345678|
