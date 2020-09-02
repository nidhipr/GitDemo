Feature: Application login

Scenario: Valid user login in application
Given User is in home page
When User enter the correct credential
Then User is logged in & acknowledge with the congratulatory message

Scenario: Home page default login
Given User is on NetBanking landing Page
When User sign up with following details
| nidhi | abcd | nidhi@gmail.com | noida |
Then Homepage is populated

Scenario Outline: Home page default login
Given User is on NetBanking landing Page
When User log in to applicatin with <username> and <password>
Then Homepage is populated

Examples:
|username| password |
|user1 | pass1 |
|user2 | pass2 |
|user3 | pass3 |
|user4 | pass4 |
|user5 | pass5 |
