
Feature: Country Multi Scenario

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to country page

  @Regression
  Scenario: Create a country
    When Create a country
    Then Success message should be displayed

    @Regression
    Scenario: Create a country parameter data
      When Create a country name as "tmrYeni" code as "code"
      Then Success message should be displayed