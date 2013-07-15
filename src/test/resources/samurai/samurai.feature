@samurai
Feature: Skill availability
  As a ninja trainer,
  I want ninjas to understand the dangers of various opponents
  so that they can engage them in combat more effectively

  Background:
    Given something happens in the context

  Scenario Outline: Samurai are dangeous with katanas, no advanced kicks
    Given the following skills are allowed "<skills>"
    When a ninja faces a samurai
    Then he should expect the following attack techniques

    Examples:
    | skills              |
    | katana, karate-kick |