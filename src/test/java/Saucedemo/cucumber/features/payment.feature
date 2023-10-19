Feature: Payment saucedemo

  Scenario: Successful payment
    Given User goes to the cart page  and goes to checkout
    When User fill all shipping fields
    And User want to pay checkout item
    Then User finish the payment