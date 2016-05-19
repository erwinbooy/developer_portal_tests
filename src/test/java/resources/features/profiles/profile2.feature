Feature: Test Profile2

  Scenario: test header menu items for user with Role 2
    Given I am logged in as a user with the role 2
    Then I see the correct menu links    