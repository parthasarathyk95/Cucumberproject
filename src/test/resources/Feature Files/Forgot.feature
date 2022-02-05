Feature: to validate forgot password functionality

  Scenario: validate the forgot password with invalid email id
    Given user should lauch the chrome browser and launch the project url
    And user should pass the email id under password reset page
    And user should click sebd verification code
    Then user should navigate verification code from email  page
