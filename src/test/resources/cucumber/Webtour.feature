Feature: test the login Web TOUR
1.Valid data
2.Invalid data
Background:
@PostiveTesting
Scenario Outline: To check the functionlity of the local webtour
Given Its should be in homepage of the Webtour
When User enter the  username "<user>"
Then User enter the password "<pass>"
And User should click on login button
And User should click on signup
Examples:
|user|pass|
|Suresh|Talakal|
|Ramesh|Talakal|
@NegativeTesting
Scenario: To check the functionlity of th elocal webtour
Given Its should be in homepage of the Webtout
When User enter the  username "<user>"
Then User enter the password "<pass>"
And User should click on login button
And User should click on signup
Examples:
|user|pass|
|Suresh11|Talakal11|
|Ramesh11|Talakal11|



