#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Settings Page Feature

  Scenario: VP edits all the settings
    Given I clicked on the Settings tab
    When I enter a value of 15 for timeline trainers
    And I enter a value of 30 for reports outgoing grads
    And I enter a value of 20 for reports candidates coming
    And I click on Tempe as the default batch location
    And I click on reston 45 as the default batch building
    And I enter 40 for minimum batch size
    And I enter 50 for maximum batch size
    And I enter 60 for default batch length
    And I enter 70 for minimum day between trainers batch
    And I click save
    Then I should be able to see that all settings have been updated popup message
    
    Scenario: VP edits some of the settings
   	
   	Given VP click on the Settings tab
   	When VP enter a value of 14 for timeline trainers
   	And VP enter a value of 18 for reports candidates coming
   	And VP enter 24 for minimum batch size
   	And VP click save
   	Then VP should be able to see that all settings have been updated popup message
   	
   	Scenario: VP resets their edits
   		Given VP clicks on the Settings tab
   		When VP enters a value of 19 for timeline trainers
   		And VP enters a value of 26 for reports outgoing grads
   		And VP clicks on New York City as the default batch location
   		And VP enters 93 for minimum days between trainer batches
   		And VP clicks on reset
   		Then VP should be able to see the settings reset popup message
   	
   	Scenario: I enters invalid input
   		Given I clicked on the tab for Settings
   		When I enter alphabetical characters for timeline trainers
   		And I enter non number characters for reports candidates incoming
   		And I enter non number characters for default batch length
   		And I click on the save button
   		Then I should be able to see blank input for timeline trainers, reports candidates incoming, and default batch length
   	
   	Scenario: VP saves empty input
   		Given VP clicked on the Settings tab
   		When VP entered empty text for reports outgoing candidates
   		And VP entered empty text for minimum batch size
   		And VP entered empty text for maximum batch size
   		And I click on save
   		Then VP should see blank input for timeline trainers
   