@web
Feature: Test the online navigation page
# Only users with the MySports Cloud Developer role see the Camera Media Server

# 1: test to see if the links are correct for a user that is not logged in
  Scenario: test user account links for a user that is not logged in
    Given I am not logged in
    When I click on the product menu sports
    Then I see the sports link overview true
    And I see the sports link camera_media_server false
   	And I see the sports link mysports_cloud true

# 2: tests to see if the links are correct for users that are logged in
  Scenario Outline: test user account links for users with different roles
    Given I am logged in as a user with the role <role>
    When I click on the product menu sports
    Then I see the sports link overview <overview>
    And I see the sports link camera_media_server <camera_media_server>
   	And I see the sports link mysports_cloud <mysports_cloud>
   	And I log out

# Notes:
# To see all roles check the Roles enum
   Examples:
  | role			| overview	| camera_media_server	| mysports_cloud| 
  | MIT_DEVELOPER	| true		| false					| true			|
  | ADMIN			| true		| true					| true			|