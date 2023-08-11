@Test
Feature: Checkout

  Scenario Outline: User wants to checkout with complete data
    Given user already on landing page
    When user click on Log in menu button
    And user inputs "<username>" as Username and inputs "<password>" as Password on login field
    And user click Log in button
    And click on Sony vaio i5
    Then click add to cart button
    When user click on cart menu button
    And click on place order button
    And place order pop up will be showed
    Then user input "Tester" as Name and "CreditCard" as credit card on place order field
    And click purchase button
    And thank you for your purchase pop up will be showed
    Examples:
      | username | password |
      | minum    | minum    |

  Scenario Outline: User wants to checkout with incomplete data
    Given user already on landing page
    When user click on Log in menu button
    And user inputs "<username>" as Username and inputs "<password>" as Password on login field
    And user click Log in button
    And click on Sony vaio i5
    Then click add to cart button
    When user click on cart menu button
    And click on place order button
    And place order pop up will be showed
    Then user input "Tester" as Name on place order field
    And click purchase button
    And please fill out credit card pop up will be showed
    Examples:
      | username | password |
      | minum    | minum    |

  Scenario Outline: User wants to checkout without adding item to cart
    Given user already on landing page
    When user click on Log in menu button
    And user inputs "<username>" as Username and inputs "<password>" as Password on login field
    Then user click Log in button
    When user click on cart menu button
    And click on place order button
    And place order pop up will be showed
    Then user input "Tester" as Name and "CreditCard" as credit card on place order field
    And click purchase button
    And pop up you have to add at least 1 item will be showed
    Examples:
      | username | password |
      | minum    | minum    |

  Scenario Outline: User wants to add item to cart, then delete item, then do checkout
    Given user already on landing page
    When user click on Log in menu button
    And user inputs "<username>" as Username and inputs "<password>" as Password on login field
    And user click Log in button
    And click on Sony vaio i5
    Then click add to cart button
    When user click on cart menu button
    And click on delete item button
    And click on place order button
    And place order pop up will be showed
    Then user input "Tester" as Name and "CreditCard" as credit card on place order field
    And click purchase button
    And pop up you have to add at least 1 item will be showed
    Examples:
      | username | password |
      | minum    | minum    |

  Scenario Outline: User wants to add item to cart, then verify the total amount of their shopping, then do checkout
    Given user already on landing page
    When user click on Log in menu button
    And user inputs "<username>" as Username and inputs "<password>" as Password on login field
    And user click Log in button
    And click on Sony Samsung galaxy s6
    Then click add to cart button
    And product successfully added
    When user click on cart menu button
    And user verifies the total price of item is "360"
    And click on place order button
    And place order pop up will be showed
    Then user input "Tester" as Name and "CreditCard" as credit card on place order field
    And click purchase button
    And thank you for your purchase pop up will be showed
    Examples:
      | username | password |
      | minum    | minum    |