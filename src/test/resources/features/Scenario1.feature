Feature: Error messages on the login page 

Scenario: Invalid email 
	Given the user is on the login page 
	When the user tries to register an invalid email 
	Then the system should display error message "Invalid email address." 
	
	