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

Feature: Reports Page Feature
  
  Scenario: VP enters info for a single batch
    Given I clicked on the Reports tab
    When I clicked on toggled content
    And I entered 23 as the number of trainee's needed
    And I entered the hire date as 02/01/2018
    And I entered Java as the curriculum
    And I clicked create batch
    Then I should be able to see successfully created batch popup message
    

  
  Scenario: VP removes a card
    Given I click on the Reports tab
    When I click on toggled content
    And I entered 34 as the amount of trainee's needed
    And I selected Java-TEST as curriculum
    And I clicked remove card
    Then I should see the card removed
    
   Scenario: VP adds new card with information
   	Given VP clicks on the Reports tab
   	When  VP clicks on toggled content
   	And VP clicks on add new card
   	And VP enters 20 as the number of trainee's needed
   	And VP enters curriculum as .NET
   	And VP clicks create batch button
   	Then I should see the batch created successfully
   	
   Scenario: VP wants to see graduate summary and edit settings
   	Given I am on the settings tab
   	When I click on graduate summary toggle content
   	And I click on the settings icon
   	And VP enters 2018 for year
   	And VP enters 16 for graduates per batch
   	And VP clicks on the download csv icon
   	Then I should see the 2018 report as a csv file
   	
   	Scenario: VP wants to see incoming trainee summary and edit settings
   		Given VP clicks on the settings tab
   		When VP clicks on incoming trainee toggle content
   		And VP clicks on the settings icon
   		And VP enters 2019 for year
   		And VP enters 20 for trainees per batch
   		And VP clicks on the download csv incoming trainee summary icon
   		Then I should see a 2018 report csv file downloaded
   		
   	
   		
   	
   	 
    
   
    
   
    

