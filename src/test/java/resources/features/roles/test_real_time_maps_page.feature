@web
Feature: Test Real Time Maps page with different roles

# 1:
  Scenario: test the sidebar item Map Input Tracker on the Real Time Maps page for someone that is not logged in
    Given I am not logged in
    When I click on the realtime maps item in the product menu
    When I click on map input tracker sidebar item on the real time maps page
    Then I see the documentation under the map input tracker sidebar item false
    And I see the faq under the map input tracker sidbar item false
    And I see the request acccess under the map input tracker sidbar item true

# 2:
  Scenario Outline: test the sidebar item Map Input Tracker on the Real Time Maps page for each role
    Given I am logged in as a user with the role <role>
    When I click on the realtime maps item in the product menu
    When I click on map input tracker sidebar item on the real time maps page
    Then I see the documentation under the map input tracker sidebar item <documentation>
    And I see the faq under the map input tracker sidbar item <faq>
    And I see the request acccess under the map input tracker sidbar item <request_access>

# Notes: only users with the mit developer role can see the links under the Map Input Tracker sidebar item
   Examples:
  | role							|documentation	| faq	| request_access| 
#  | NONE							| false			| false	| true			|
  | SUPER_USER						| true			| true	| true			|
  | MIT_DEVELOPER					| true			| true	| true			|
#  | MYSPORTS_CLOUD_DEVELOPER		| false			| false	| true			|
#  | NAVKIT_DEVELOPER				| false			| false	| true			|
#  | NAVKIT_INTEGRATOR				| false			| false	| true			|
#  | NDS_MAP_UPDATES_DEVELOPER		| false			| false	| true			|
#  | CAMERA_MEDIA_SERVER_DEVELOPER	| false			| false	| true			|

# 3:
  Scenario: test the sidebar item NDS Map Updates on the Real Time Maps page for someone that is not logged in
    Given I am not logged in
    When I click on the realtime maps item in the product menu
    When I click on nds map updates sidebar item on the real time maps page
    Then I see the documentation under the nds map updates sidebar item false
    And I see the download under the nds map updates sidebar item false
    And I see the request acccess under the nds map updates sidbar item true

# 4:
  Scenario Outline: test the sidebar item NDS Map Updates on the Real Time Maps page for each role
    Given I am logged in as a user with the role <role>
    When I click on the realtime maps item in the product menu
    When I click on nds map updates sidebar item on the real time maps page
    Then I see the documentation under the nds map updates sidebar item <documentation>
    And I see the download under the nds map updates sidebar item <download>
    And I see the request acccess under the nds map updates sidbar item <request_access>

# Notes: only users with the mit developer role can see the links under the NDS Map Updates sidebar item
   Examples:
  | role							|documentation	| download	| request_access| 
#  | NONE							| false			| false		| true			|
  | SUPER_USER						| true			| true		| true			|
#  | MIT_DEVELOPER					| false			| false		| true			|
#  | MYSPORTS_CLOUD_DEVELOPER		| false			| false		| true			|
#  | NAVKIT_DEVELOPER				| false			| false		| true			|
#  | NAVKIT_INTEGRATOR				| false			| false		| true			|
  | NDS_MAP_UPDATES_DEVELOPER		| true			| true		| true			|
#  | CAMERA_MEDIA_SERVER_DEVELOPER	| false			| false		| true			|    