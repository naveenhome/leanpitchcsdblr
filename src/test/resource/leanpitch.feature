Feature: Search
Searching company name on google

Scenario: Search result count matches
Given user enter "leanpitch" in search box
And browser is "Firefox"
When Click on Search
Then result should be around 68800

Scenario: Search result count matches
Given user enter "scrum" in search box
When Click on Reset
Then result should be around 168800

