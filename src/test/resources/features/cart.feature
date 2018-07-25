Feature: Test a successfully cart

  Scenario: Moves to checkout from cart
    Given I want to access checkout from cart
    When enter personal details on checkout page
    And select same delivery address
    And select payment method as
    Then place the order
