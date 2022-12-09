Feature:Add To Cart Test

  @Regression
  Scenario: Add To Cart Test
    Given Naviagate to Website
    When Click on Summer dress.
    And Hover over a random product.
    And Click Add to cart.
    Then Verify that the product has been added to the card.
