Feature: Basket feature

  @addToBag
  Scenario: Verify add to bag

    Given I am on homepage "https://www.boohoo.com" with title as "boohoo | Womens and Mens Clothes | Shop Online Fashion"
    When  I click search box
    When I type "men jean" in search box
    When I click the search icon
    When I choose product "mens black jean" from PLPage
    When I choose size "M"
    When I click add to bag button
    Then I should be seeing the product "mens black jean " in the bag