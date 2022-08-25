Feature: Search Feature
@search
  Scenario: Searching particular type products

    Given I am on homepage "https://www.boohoo.com" with title as "boohoo | Womens and Mens Clothes | Shop Online Fashion"
    When  I click search box
    When I type "men jean" in search box
    When I click the search icon
    Then I should only get result as per my search

