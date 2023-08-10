@Test
Feature: Contact

  Scenario Outline: User want to send message to the company with complete data
    Given user already on landing page
    When click on contact menu button
    And new message pop up will appear
    And user input "<email>" as email, "<name>" as name, and "<message>" as message
    Then click on send message button
    And thanks for the message pop up will appear
    Examples:
      | email           | name   | message |
      | email@email.com | tester | hello   |

  Scenario Outline: User want to send message to the company with complete data
    Given user already on landing page
    When click on contact menu button
    And new message pop up will appear
    And user input "<email>" as email, "<name>" as name, and "<message>" as message
    Then click on send message button
    And please input email and message pop up will appear
    Examples:
      | email | name   | message |
      |       | tester |         |
