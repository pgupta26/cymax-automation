Feature: Test customer flow

  Scenario: Go to home page
    When Go to navigate to cymax login page
    And enter visitor password "Cymax2022!"
    Then cymax home page should load without crashes

  Scenario: Go to Empty Cart page
    When click on 'cart logo' at top right corner
    Then cart page should load without crashes

  Scenario: Search for a product using PID
    When click on search box and Enter PID "2119117" then press enter
    Then Search results will be shown on Product List Page

  Scenario: PLP Functionality (NB : add 2 filters, sort functionality , sale toggle steps here)
    When user click on 'computer desks' category under 'furniture' top menu bar
    Then user will be redirected to PLP url contains "Computer-Desks"

  Scenario: Navigate to product details page (PDP)
    When Click on the first product on the Product List Page
    Then User will be redirected to PDP




