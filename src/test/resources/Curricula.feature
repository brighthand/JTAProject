Feature: Curriculum Feature
  Curriculum page features
  
Background: Logged in as VP

    Scenario: Add curriculum
    Given I'm on the curricula page
    When I click the add new curriculum button
    And  Clear form contents
    Then Enter curriculum information
    And Click the save button
    
    Scenario: Cancel adding curriculum
    Given I'm on the curricula page
    When I click the add new curriculum button
    Then Enter curriculum information
    And Click the cancel button
    
    Scenario: Edit curricula
    Given I'm on the curricula page
    When I click the toogle curricula button
    Then I click the edit curricula button
    And  Clear form contents
    Then Edit curriculum information
    And Click the save button
    
    Scenario: Remove core
    Given I'm on the curricula page
    When I click the remove core button
    And Click the form remove button
    
    Scenario: Add focus
    Given I'm on the curricula page
    When I click the add new focus button
    Then Enter focus information
    And Click the save button
    
    Scenario: Edit focus
    Given I'm on the curricula page
    When I click the toogle focus button
    Then I click the edit focus button
    And Clear form contents
    Then Edit focus information
    And Click the save button
    
     Scenario: Remove focus
    Given I'm on the curricula page
    When I click the toogle focus button
    Then I click the remove focus button
    And Click the form remove button
    
    Scenario: Create skill
    Given I'm on the curricula page
    When I click the toogle skills button
    And Enter a new skill
    Then Click the create button
    
    