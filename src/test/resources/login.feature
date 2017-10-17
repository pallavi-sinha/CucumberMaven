Feature: Login function in the Fidelity App

  @tag1
  Scenario: User is unable to login with incorrect ID
    Given user has launched the Fidelity charitable website
    When he clicks on login button
    And enter incoorect ID and password
    Then system should throw an error
    And should not let user login
