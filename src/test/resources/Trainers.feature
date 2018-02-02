
Feature: Trainers Page Feature
  
  Scenario: VP clicks on a trainer
  	Given VP clicked on the trainer Add Test
  	Then the page changes to Add Test's info
  	
  
  Scenario: VP adds a new trainer named David Smith
    Given VP clicked on the Trainers tab
    When VP clicked on the add trainer button
    And  VP entered David first name
    And VP entered Smith last name
    And VP clicks on save
    Then Popup message for adding new trainer 
    
   	Scenario: VP deactivates a trainer named Add Test
   	Given VP clicks on the deactivate button for Add Test
   	Then Popup message for deactivate
   	
   	Scenario: VP activates a trainer named Add Test
   	Given VP clicked on the activate button for inactive trainer Add Test
   	Then Popup message for activate
   	
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
   	Then Application is cancelled
   	
   
   	
   	

