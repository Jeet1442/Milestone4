Feature: Search in Antibacterial and verify

Scenario: Validate Antibacterial
Given User on Tide home page
When User enter "Antibacterial" to be searched in search field and presses search button
Then Validate if any product named with Antibacterial is present or not
And Close the browser
