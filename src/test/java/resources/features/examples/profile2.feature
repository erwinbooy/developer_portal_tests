@web
Feature: Test Profiles

  Scenario Outline: test header menu links for users with different roles
    Given I am logged in as a user with the role <role>
    Then I see the correct menu links
    
   Examples:
   | role	|
   | 1		|
   | 2		|