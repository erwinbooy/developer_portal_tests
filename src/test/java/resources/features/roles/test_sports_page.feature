@web
Feature: Test sports page with different roles
# Only users with the MySports Cloud Developer role see the Camera Media Server

# 1:
  Scenario: test the sidebar items of the Sports page for a user that is not logged in
    Given I am not logged in
    When I click on the sports item in the products menu
    Then I see the overview link on the sports page true
    And I see the camera_media_server item on the sports page false
   	And I see the my_sports item on the sports page true

# 2:
  Scenario Outline: test the sidebar items of the Sports page for different roles
    Given I am logged in as a user with the role <role>
    When I click on the sports item in the products menu
    Then I see the overview link on the sports page <overview>
    And I see the camera_media_server item on the sports page <camera_media_server>
   	And I see the my_sports item on the sports page <mysports_cloud>

   Examples:
  | role							| overview	| camera_media_server	| mysports_cloud|
  | NONE							| true		| false					| true			|
  | SUPER_USER						| true		| true					| true			|
  | MIT_DEVELOPER					| true		| false					| true			|
  | MYSPORTS_CLOUD_DEVELOPER		| true		| false					| true			|
  | NAVKIT_DEVELOPER				| true		| false					| true			|
  | NAVKIT_INTEGRATOR				| true		| false					| true			| 
  | NDS_MAP_UPDATES_DEVELOPER		| true		| false					| true			|
  | CAMERA_MEDIA_SERVER_DEVELOPER	| true		| true					| true			|
  
# 3:
  Scenario Outline: test the sidebar item MySports cloud on the Sports page for each role
    Given I am logged in as a user with the role <role>
    When I click on the sports item in the products menu
    And I click on the MySports cloud sidebar item
    Then I see the authorization under the mysports cloud sidebar item <authorization>
    And I see the documentation under the mysports cloud sidebar item <documentation>
    And I see the faq under the mysports cloud sidbar item <faq>
    And I see the forum under the mysports cloud sidbar item <forum>
    And I see the terms of use under the mysports cloud sidbar item <terms_of_use>

# Notes: only users with the mysports cloud developer can see the links under the MySports Cloud
   Examples:
  | role							| authorization	| documentation	| faq	| forum	| terms_of_use	| 
  | NONE							| true			| true			| true	| true	| true			|
  | SUPER_USER						| true			| true			| true	| true	| true			|
  | MIT_DEVELOPER					| true			| true			| true	| true	| true			|
  | MYSPORTS_CLOUD_DEVELOPER		| true			| true			| true	| true	| true			|
  | NAVKIT_DEVELOPER				| true			| true			| true	| true	| true			|
  | NAVKIT_INTEGRATOR				| true			| true			| true	| true	| true			|
  | NDS_MAP_UPDATES_DEVELOPER		| true			| true			| true	| true	| true			|
  | CAMERA_MEDIA_SERVER_DEVELOPER	| true			| true			| true	| true	| true			|
  
  
# 4: This test is actually an extension of test #2
  Scenario Outline: test the sidebar sub items of the Camera Media Server on the Sports page
    Given I am logged in as a user with the role <role>
    When I click on the sports item in the products menu
    And I click on the camera media server sidebar item
    Then I see the api guidelines under the camera media server sidebar item <api_guidelines>
    And I see the documentation under the camera media server sidebar item <documentation>
    And I see the sensor data format under the camera media server sidebar item <sensor_format>
    And I see the tags highlights format under the camera media server sidebar item <tags_format>

# Only users with the Camera Media Server Developer role see the Camera Media Server
   Examples:
  | role							| api_guidelines	| documentation	| sensor_format	| tags_format	| 
  | NONE							| false				| false			| false			| false			|
  | SUPER_USER						| true				| true			| true			| true			|
  | MIT_DEVELOPER					| false				| false			| false			| false			|
  | MYSPORTS_CLOUD_DEVELOPER		| false				| false			| false			| false			|
  | NAVKIT_DEVELOPER				| false				| false			| false			| false			|
  | NAVKIT_INTEGRATOR				| false				| false			| false			| false			|
  | NDS_MAP_UPDATES_DEVELOPER		| false				| false			| false			| false			|
  | CAMERA_MEDIA_SERVER_DEVELOPER	| true				| true			| true			| true			|