Feature: Success in choosing products

  Scenario: Successful product selection
    Given An e cormmerce web page
    When I choose products I want to purchase
    And place them into the cart
    And I press the proceed button
    Then product selection should be successful