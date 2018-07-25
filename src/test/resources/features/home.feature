Feature: I access the home page successfully

  Scenario: Successful product selection

    Given I access home page
    When I navigate to products I want to purchase
    And search the products I want to purchase
    And Select the link of the product I want to purchase
    Then I can access the cart link