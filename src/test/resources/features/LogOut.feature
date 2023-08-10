@Test
Feature: Log Out

  Scenario Outline: User wants to logout after do valid login
    Given user already on landing page
    When user click on Log in menu button
    And user inputs "<username>" as Username and inputs "<password>" as Password on login field
    And user click Log in button
    And user login successfully
    Then click on Log out menu button
    And user logout successfully
    Examples:
      | username | password |
      | minum    | minum    |