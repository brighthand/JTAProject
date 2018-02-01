Feature: Profile Page features

Profile: I'm logged in as a Trainer
 

  Scenario: Select skills
    Given I'm in the profile page
    When I select a skill

   
   Scenario: Remove skill
    Given I'm in the profile
    Then I select current skills

    
   Scenario: Add certification
    Given I'm in the profile page
    Then I click the add certification button

  Scenario: Remove certification
    Given I'm in the profile page
    Then I click the remove certification button
    
  Scenario: Save skills
    Given I'm in the profile page
    Then I click the save skills button
