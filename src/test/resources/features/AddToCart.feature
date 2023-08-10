@Test
Feature: Add to Cart

  Scenario Outline: User wants to add to cart item after do valid login
    Given user already on landing page
    When user click on Log in menu button
    And user inputs "<username>" as Username and inputs "<password>" as Password on login field
    And user click Log in button
    And user click on Samsung Galaxy s6
    Then click add to cart button
    And produck successfully added
    Examples:
      | username | password |
      | minum    | minum    |

  Scenario: User wants to add to cart items without login
    Given user already on landing page
    When user click on Samsung Galaxy s6
    Then click add to cart button
    And user redirected to login pop up