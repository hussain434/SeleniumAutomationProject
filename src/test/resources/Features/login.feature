Feature: User should be able to login in ecommerce webapp by entering his/her credentials


  @smoke
  Scenario: Check login is successfull with valid credentials
    Given user is on login page
    When  user click on Signin button
    And user enters email
    And user enters password
    And user clicks on signin button
    Then user should see message "My Account"

