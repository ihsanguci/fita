@Positive
Feature: Checkout
  I want checkout product

  @T1
  Scenario: Successfully checkout
    Given Already open the apps
    When I click shrine card menu
    And I input username "abc@gmail.com" and password "12345"
    And I swipe to "walter henley" product
    And I click "walter henley" product
    Then The product will be in cart
    When I click the chart
    And I click clear basket button
    Then the product will be empty
