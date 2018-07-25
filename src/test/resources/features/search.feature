Feature: Searching for products

  Scenario: typing in the search box for products
    Given I'm on the home page
    When i type in the name of a product
    And I click the search button
    Then page should show a list of products
