Feature: Login page
  Background: My website
    Given I open my website

  Scenario: Login with valid credentials
    When I enter valid credentials
    Then I should be able to login
