Feature: Test Profile1

  Scenario: test header menu items for user with Role 1
    Given I am logged in as a user with the role 1
    Then I see the correct menu links    