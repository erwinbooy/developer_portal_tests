@web
Feature: Test Product menu items per role
# To make it easier to test different profiles we just use booleans to indicate if the user can see something or not
# Otherwise we would have to implement 2 methods per line

# 1: test to see if the links are correct for a user that is not logged in
  Scenario: test product menu links for a user that is not logged in
    Given I am not logged in
    Then I see the product menu home true 
	And I see the product menu online_navigation true    
    And I see the product menu navigation_software true
	And I see the product menu realtime_maps true
	And I see the product menu bridge true
	And I see the product menu sports true

# 2: tests to see if the links are correct for users that are logged in
  Scenario Outline: test product menu links for users with different roles
    Given I am logged in as a user with the role <role>
    Then I see the product menu home <home> 
	And I see the product menu online_navigation <online_navigation>    
    And I see the product menu navigation_software <navigation_software>
	And I see the product menu realtime_maps <realtime_maps>
	And I see the product menu bridge <bridge>
	And I see the product menu sports <sports>

# Notes:
# To see all roles check the Roles enum
# If you are logged in you see Sign Out + Links for your role
   Examples:
   | role			| home	| online_navigation	| navigation_software	| realtime_maps	| bridge 	| sports| 
   | MIT_DEVELOPER	| true	| true				| true					| true			| true		| true	|
   | ADMIN			| true	| true				| true					| true			| true		| true	|