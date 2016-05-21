@web
Feature: Test sports page items
# 3: Test the sub sidebar item MySports cloud on the Sports page for all the roles
  Scenario Outline: test user account links for users with different roles
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
  | SUPER_USER						| true			| true			| true	| true	| true			|
  | MIT_DEVELOPER					| false			| false			| false	| false	| false			|
  | MYSPORTS_CLOUD_DEVELOPER		| true			| true			| true	| true	| true			|
  | NAVKIT_DEVELOPER				| false			| false			| false	| false	| false			|
  | NAVKIT_INTEGRATOR				| false			| false			| false	| false	| false			|
  | NDS_MAP_UPDATES_DEVELOPER		| false			| false			| false	| false	| false			|
  | CAMERA_MEDIA_SERVER_DEVELOPER	| false			| false			| false	| false	| false			| 