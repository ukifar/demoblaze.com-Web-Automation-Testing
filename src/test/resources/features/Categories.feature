@Test
Feature: Categories

  Scenario: User want to select phones on categories
    Given user already on landing page
    When click on phones button on the category field
    And phones products will showed up

  Scenario: User want to select laptops on categories
    Given user already on landing page
    When click on laptops button on the category field
    And laptops products will showed up

  Scenario: User want to select monitors on categories
    Given user already on landing page
    When click on monitors button on the category field
    And monitors products will showed up