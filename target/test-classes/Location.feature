Feature: Locations page features
  
Background: I'm logged in as Vice President

    Scenario: Add location
    Given I'm on the locations page
    When I click the add location button
    Then Enter location information
    And Click the save button
    
   Scenario: Add building
   Given I'm on the locations page
   When I click a location checkbox
   Then I click add building button
   And Enter building information
   Then Click the save button
   
   Scenario: Add room
   Given I'm on the locations page
   When I click a building checkbox
   Then I click add room button
   And Enter room information
   Then Click the save button
   
   Scenario: Edit location
   Given I'm on the locations page
   When I click a location checkbox
   Then I click the edit button
   Then I clear the location form
   And Edit location information
   Then click the save button
   
   Scenario: Edit building
   Given I'm on the locations page
   When I click a building checkbox
   Then I click the edit button
   Then I clear the building form
   And Edit building information
   Then click the save button
   
   Scenario: Edit room
   Given I'm on the locations page
   When I click a room checkbox
   Then I clear the room form
   And Edit room information
   Then click the save button
   
   Scenario: Inactivate location
   Given I'm on the locations page
   When I click a location checkbox
   Then I click the inactivate button
   Then click the save button
   
   Scenario: Inactivate building
   Given I'm on the locations page
   When I click a building checkbox
   Then I click the inactivate button
   Then click the save button
   
   Scenario: Inactivate room
   Given I'm on the locations page
   When I click a room checkbox
   Then I click the inactivate button
   Then click the save button
     