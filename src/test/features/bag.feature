Feature: Bag Feature
@AddingProduct
  Scenario: Adding product to the bag


   Given I am on homepage "https://www.boohoo.com" with title as "boohoo | Womens and Mens Clothes | Shop Online Fashion"
    When I click mens section and summer shop
    When I click particular product
    Then I should be on the particular product page with title as "Men's Heavyweight Oversized Check Overshirt | Boohoo UK"
    When I click the size as L
    When I click the Add to cart
    Then The particular product should add to the cart with notification of "ADDED TO YOUR CART"
