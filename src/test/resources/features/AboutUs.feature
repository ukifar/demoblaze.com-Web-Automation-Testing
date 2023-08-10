@Test
Feature: About Us

  Scenario Outline: User want to watch about us feature after login
    Given user already on landing page
    When user click on Log in menu button
    And user inputs "<username>" as Username and inputs "<password>" as Password on login field
    And user click Log in button
    And click on about us menu button
    Then user click on the video
    And video can be played
    Examples:
      | username | password |
      | minum    | minum    |

  Scenario: User want to watch about us feature without login
    Given user already on landing page
    When click on about us menu button
    And user click on the video
    Then video can be played