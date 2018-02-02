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

Feature: Trainers Page Feature
  
  Scenario: VP clicks on a trainer
  	Given VP clicked on the trainer Matt Barkley
  	Then the page changes to Matt Barkley's info
  	
  
<<<<<<< HEAD
  Scenario: VP adds a new trainer named Richard Bumer
=======
  Scenario: VP adds a new trainer named Richard Lewis
>>>>>>> stephen_oduor_backup
    Given VP clicked on the Trainers tab
    When VP clicked on the add trainer button
    And  VP entered Richard first name
    And VP entered Bumer last name
    And VP clicks on save
    Then Size of inactive trainers is increased by 1
    
   Scenario: VP cancels a new trainer named Randy Jackson
   	Given VP clicks on add trainer button
   	When VP enters Randy for first name
   	And VP enters Jackson for last name
   	And VP clicks on cancel
   	Then Size of inactive trainers remains the same
   	
   	Scenario: VP deactivates a trainer named Matt Patinos
   	Given VP clicks on the deactivate button for Matt Patinos
   	Then Size of trainers decreases by 1
   	
   	Scenario: VP activates a trainer named Matt Patinos
   	Given VP clicked on the activate button for inactive trainer Richard Smith
   	Then Size of inactive trainers is decreased by 1
   	
   	Scenario: VP wants to cancel a paid time off request
   	Given VP clicks on the calendar button
   	When VP clicks on new pto request
   	And VP  clicks on start date
   	And VP clicks on month April 2018
   	And VP clicks on the 12th day
   	And VP clicks on end date
   	And VP clicks on month May 2018
   	And VP clicks on 6th day
   	And VP clicks cancel
   	And VP clicks cancel pto request
   	Then VP is directed to the trainers home page
   	
   	Scenario: VP wants to create a paid time off request
   	Given VP clicked on the calendar button
   	When VP clicked on new pto request button
   	And VP clicked on start date
   	And VP clicked on month February 2018
   	And VP clicked on the 4th day
   	And VP clicked on the end date
   	And VP clicked on month March 2018
   	And VP clicked on 9th day
   	And VP clicked on send
   	Then VP is directed to choose a Gmail account
   	
   
   	
   	

