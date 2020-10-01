@Registration
Feature: User registration

  As a user
  I want to be able to register to the application
  So that I can use the features

  @InProgress
  Scenario: Verify user can register to the application successfully
    Given I am on registration page
    When I fill the registration form
    Then my account should be created