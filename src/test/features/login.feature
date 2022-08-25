Feature: Login Feature
@LoginWithInvalidDetails
  Scenario: Login with Invalid details

    Given I am on homepage "https://www.boohoo.com" with title as "boohoo | Womens and Mens Clothes | Shop Online Fashion"
    When I click the signin button
    When I enter email "raj95@gmail.com" and password "raj230395"
    When I click login button
    Then  I should not allowed to login but I should get a message "Sorry, your email or password doesn't match our records. Please check that you have entered them correctly, or."

  Scenario: Login with valid details

    Given I am on homepage "https://www.boohoo.com" with title as "boohoo | Womens and Mens Clothes | Shop Online Fashion"
    When I click the signin button
    When I enter email "rajadam@gmail.com" and password "raj230395"
    When I click login button
    Then I should be allowed login