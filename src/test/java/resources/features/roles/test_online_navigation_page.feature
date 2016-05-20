@web
Feature: Test the online navigation page

# 1: test to see if the links are correct for a user that is not logged in
  Scenario: test user account links for a user that is not logged in
    Given I am not logged in
    Then I see the user sign_in link true 
	And I see the user register link true    
    And I see the user my_account link false
	And I see the user sign_out link false
	And I see the user dashboard link false

# 2: tests to see if the links are correct for users that are logged in
  Scenario Outline: test user account links for users with different roles
    Given I am logged in as a user with the role <role>
    Then I see the user sign_in link <sign_in> 
	And I see the user register link <register>    
    And I see the user my_account link <my_account>
	And I see the user sign_out link <sign_out>
	And I see the user dashboard link <dashboard>

# Notes:
# To see all roles check the Roles enum
# If you are logged in you see Sign Out + Links for your role
   Examples:
   | role			| sign_in	| register	| sign_out	|my_account	| dashboard	| 
   | MIT_DEVELOPER	| false		| false		| true		|true		| false		|
   | ADMIN			| false		| false		| true		|true		| true		|