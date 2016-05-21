@web
Feature: Test Product menu items per role
# To make it easier to test different profiles we just use booleans to indicate if the user can see something or not
# Otherwise we would have to implement 2 methods per line

# 1: test to see if the links are correct for a user that is not logged in
  Scenario: test product menu links for a user that is not logged in
    Given I am not logged in
    Then I see the home item in the product menu true
	And I see the online navigation item in the product menu true    
    And I see the navigation software item in the product menu true
	And I see the realtime maps item in the product menu true
	And I see the bridge item in the product menu true
	And I see the sports item in the product menu true

# 2: tests to see if the links are correct for users that are logged in
  Scenario Outline: test product menu links for users with different roles
    Given I am logged in as a user with the role <role>
    Then I see the home item in the product menu <home> 
	And I see the online navigation item in the product menu <online_navigation>    
    And I see the navigation software item in the product menu <navigation_software>
	And I see the realtime maps item in the product menu <realtime_maps>
	And I see the bridge item in the product menu <bridge>
	And I see the sports item in the product menu <sports>

# Notes:
# To see all roles check the Roles enum
# If you are logged in you see Sign Out + Links for your role
   Examples:
   | role			| home	| online_navigation	| navigation_software	| realtime_maps	| bridge 	| sports| 
   | NONE			| true	| true				| true					| true			| true		| true	| 
   | SUPER_USER		| true	| true				| true					| true			| true		| true	|
   | MIT_DEVELOPER	| true	| true				| true					| true			| true		| true	|