Feature: Registration feature
  @test
  Scenario: User should able to register successfully,
    Given user is on HomePage
    When user click on register button
    And user enter all required registration details
    And user clicks on registration button
    Then user able to registration successfully