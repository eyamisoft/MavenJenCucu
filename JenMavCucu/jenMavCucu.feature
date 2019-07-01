Feature: Test demoaut scenario

  Scenario: Test login with valid credentials

    Given Open chrome and start application
    When user enters valid "merc2" and valid "merc2"
    Then successful log in ensues
