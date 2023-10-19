Feature: Checkout saucedemo

  Scenario: Successful checkout
    Given User is logged in and has items in the cart
    When User goes to the cart and proceeds to checkout
    Then User completely fill shipping fields