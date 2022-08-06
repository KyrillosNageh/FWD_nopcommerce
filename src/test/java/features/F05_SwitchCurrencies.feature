@smoke
Feature: Logged User could switch between currencies US-Euro

  @tag1
  Scenario: Logged User could switch between currencies US-Euro
    Given User open home page
    When User selecte currency "Euro"
    Then Validate the product become by the Euro


