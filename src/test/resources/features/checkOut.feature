Feature: Test a checkout feature

  Scenario: checking out after selecting product i want to purchase
    Given I want to checkout after putting items into the cart
    When enter personal details on checkout page
    And I have decided what I want to purchase
    And select payment method as
    Then check out from the checkout page
