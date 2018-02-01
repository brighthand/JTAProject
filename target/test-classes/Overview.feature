
Feature: Overview page features

  Scenario: Filter in progress
    Given I'm in the overview page
    When I click the filter button
    And Select in progress
    
    Scenario: Filter Beginning within two weeks
    Given I'm in the overview page
    When I click the filter button
    And Select beginning within two weeks
    
    Scenario: Filter All
    Given I'm in the overview page
    When I click the filter button
    And Select all
    
    Scenario: Export csv
    Given I'm in the overview page
    And I click the export to csv button
    
  


