@Test
Feature: Log In

  Scenario Outline: User login with registered username and password
    Given user already on landing page
    When user click on Log in menu button
    And user inputs "<username>" as Username and inputs "<password>" as Password on login field
    Then user click Log in button
    And user login successfully
    Examples:
      | username | password |
      | minum    | minum    |

  Scenario Outline: User login with wrong password
    Given user already on landing page
    When user click on Log in menu button
    And user inputs "<username>" as Username and inputs "<password>" as Password on login field
    Then user click Log in button
    And pop up showed with message wrong password
    Examples:
      | username | password |
      | minum    | 123      |

  Scenario Outline: User login with unregistered username
    Given user already on landing page
    When user click on Log in menu button
    And user inputs "<username>" as Username and inputs "<password>" as Password on login field
    Then user click Log in button
    And pop up showed with message user does not exist
    Examples:
      | username   | password   |
      | Unregister | Unregister |

  Scenario Outline: User login with empty username field
    Given user already on landing page
    When user click on Log in menu button
    And user inputs "<username>" as Username and inputs "<password>" as Password on login field
    Then user click Log in button
    And pop up showed with message please fill out username and password
    Examples:
      | username | password |
      |          | Tester   |

  Scenario Outline: User login with empty password field
    Given user already on landing page
    When user click on Log in menu button
    And user inputs "<username>" as Username and inputs "<password>" as Password on login field
    Then user click Log in button
    And pop up showed with message please fill out username and password
    Examples:
      | username | password |
      | Tester   |          |