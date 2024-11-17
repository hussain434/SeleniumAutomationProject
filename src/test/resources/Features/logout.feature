Feature: User should be able to logout from ecommerce webapp


  @smoke
  Scenario: Check login is successfull with valid credentials
    Given user is on login page
    When  user click on Signin button
    And user enters email
    And user enters password
    And user clicks on signin button
    And user clicks on dropdown button
    And user click on Signout button
    Then user should see logout message "You are signed out"

