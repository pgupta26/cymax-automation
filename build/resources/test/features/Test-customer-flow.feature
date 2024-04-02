Feature: Test customer flow

  Scenario: Go to home page
    When Go to navigate to cymax login page
    And enter visitor password "Cymax2022!"
    Then cymax home page should load without crashes

  Scenario: Go to Empty Cart page
    When click on 'cart logo' at top right corner
    Then cart page should load without crashes


