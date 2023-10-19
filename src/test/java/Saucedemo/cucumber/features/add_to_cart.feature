Feature: Add to Cart

  Scenario: Add an item to the cart
    Given User is log in
    When User adds an item to the cart
    Then User should see the item in your cart