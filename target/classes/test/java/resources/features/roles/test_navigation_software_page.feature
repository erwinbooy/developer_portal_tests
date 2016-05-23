@web
Feature: Test Navigation Software page

# 1: 
  Scenario: test the Navigation Software Page for a user that is not logged in
    Given I am not logged in
    When I click on the navigation software item in the products menu
    Then I see the documentation under the navkit sidebar item false
    And I see the downloads under the navkit sidebar item false
    And I see the faq under the navkit sidebar item false
    And I see the integration kit under the navkit sidebar item false

# 2: 
  Scenario Outline: test the Navigation Software Page for all the user roles
    Given I am logged in as a user with the role <role>
    When I click on the navigation software item in the products menu
    Then I see the documentation under the navkit sidebar item <documentation>
    And I see the downloads under the navkit sidebar item <downloads>
    And I see the faq under the navkit sidebar item <faq>
    And I see the integration kit under the navkit sidebar item <kit>

# Notes: only users with the mysports cloud developer can see the links under the MySports Cloud
   Examples:
  | role							| documentation	| downloads	| faq	| kit	| 
  | NONE							| false			| false		| false	| false	|
  | SUPER_USER						| true			| true		| true	| true	|
  | MIT_DEVELOPER					| false			| false		| false	| false	|
  | MYSPORTS_CLOUD_DEVELOPER		| false			| false		| false	| false	|
  | NAVKIT_DEVELOPER				| true			| true		| true	| false	|
  | NAVKIT_INTEGRATOR				| true			| true		| true	| true	|
  | NDS_MAP_UPDATES_DEVELOPER		| false			| false		| false	| false	|
  | CAMERA_MEDIA_SERVER_DEVELOPER	| false			| false		| false	| false	| 