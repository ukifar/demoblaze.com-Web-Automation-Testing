@Test
Feature: Sign Up

  Scenario Outline: User registers with unregistered username and password
    Given user already on landing page
    When user click on Sign up menu button
    And input "<username>" as Username and input "<password>" as Password
    Then user click Sign up button
    And verification pop-up appears indicating successful registration
    Examples:
      | username | password |
      | user1    | user1    |

  Scenario Outline: User registers with already registered username and password
    Given user already on landing page
    When user click on Sign up menu button
    And input "<username>" as Username and input "<password>" as Password
    Then user click Sign up button
    And verification pop-up appears indicating failed registration
    Examples:
      | username | password |
      | user1    | user1    |

  Scenario Outline: User registers with empty username and valid password
    Given user already on landing page
    When user click on Sign up menu button
    And input "<username>" as Username and input "<password>" as Password
    Then user click Sign up button
    And verification pop-up appears indicating that the username field must be filled
    Examples:
      | username | password |
      |          | Tester   |

  Scenario Outline: User registers with valid username and empty password
    Given user already on landing page
    When user click on Sign up menu button
    And input "<username>" as Username and input "<password>" as Password
    Then user click Sign up button
    And verification pop-up appears indicating that the password field must be filled
    Examples:
      | username | password |
      | user2    |          |

  Scenario Outline: User registers with combination of word, number, and special character on username and valid password
    Given user already on landing page
    When user click on Sign up menu button
    And input "<username>" as Username and input "<password>" as Password
    Then user click Sign up button
    And verification pop-up appears indicating successful registration
    Examples:
      | username | password |
      | user01@@ | user01@@ |

  Scenario Outline: User registers using only numbers on username field and valid password
    Given user already on landing page
    When user click on Sign up menu button
    And input "<username>" as Username and input "<password>" as Password
    Then user click Sign up button
    And pop-up indicating invalid username will be showed
    Examples:
      | username | password |
      | 001      | 001      |

  Scenario Outline: User registers using only special character on username field and valid password
    Given user already on landing page
    When user click on Sign up menu button
    And input "<username>" as Username and input "<password>" as Password
    Then user click Sign up button
    And pop-up indicating invalid username will be showed
    Examples:
      | username | password |
      | !!!      | !!!      |