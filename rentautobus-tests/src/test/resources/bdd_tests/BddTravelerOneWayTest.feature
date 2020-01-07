Feature: Traveler OneWay Trip

 Scenario: start Create OneWay Trip
    Given user logged in as traveler
    When  user clicks on the one way trip
    And   user user populates Trip Form with text
    Then  user clicks on button and navigates to next page
