Feature: Successful Product Search Feature

  In order find a product
  as a guest
  i want to search successfully

  Scenario: Successful Product Search

    Given I am guest on the home page of the store
    When I search a vailed product
    Then I should see it in the search results


