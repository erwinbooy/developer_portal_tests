@web
Feature: Test Profiles

  Scenario Outline: test header menu links for users with different roles
    Given I am logged in as a user with the role 1
    When I click on the <page> link
    Then I see menu link <link> 

   Examples:
   | link			| page				|
   | MyAccount		| Online Navigation	|