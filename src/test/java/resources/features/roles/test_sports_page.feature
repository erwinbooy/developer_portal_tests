@web
Feature: Test sports page items
# Only users with the MySports Cloud Developer role see the Camera Media Server

# 1: test to see if the links are correct for a user that is not logged in
  Scenario: test user account links for a user that is not logged in
    Given I am not logged in
    When I click on the sports item in the products menu
    Then I see the overview link on the sports page true
    And I see the camera_media_server item on the sports page false
   	And I see the my_sports item on the sports page true

# 2: tests to see if the links are correct for users that are logged in
  Scenario Outline: test user account links for users with different roles
    Given I am logged in as a user with the role <role>
    When I click on the sports item in the products menu
    Then I see the overview link on the sports page <overview>
    And I see the camera_media_server item on the sports page <camera_media_server>
   	And I see the my_sports item on the sports page <mysports_cloud>

# Notes:
# To see all roles check the Roles enum
   Examples:
  | role			| overview	| camera_media_server	| mysports_cloud| 
  | MIT_DEVELOPER	| true		| false					| true			|
  | ADMIN			| true		| true					| true			|