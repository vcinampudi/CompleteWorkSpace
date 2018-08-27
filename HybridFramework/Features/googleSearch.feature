Feature: Searching from Google Landing Page
  In order to show the benefits of using SOB and Cucumber

  Scenario: searching from google
    Given I navigated to Google page
    When I type "Selenium Object Bank" in the search field
    Then it should show me the result of "Selenium Object Bank"
