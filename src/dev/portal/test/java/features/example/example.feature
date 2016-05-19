Feature: Example

  Scenario: a few cukes
    Given I have 43 cukes in my belly
    When I wait 0 hour
    Then my belly should silent

  Scenario: a few cukes
    Given I have 41 cukes in my belly
    When I wait 1 hour
    Then my belly should silent

  Scenario: a few cukes
    Given I have 42 cukes in my belly
    When I wait 1 hour
    Then my belly should growl