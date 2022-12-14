Scenario: Unsuccessful withdrawal from a wallet
Given I have deposited $200 in my wallet
When I request $300
Then Nothing should be dispensed
And the balance of my wallet should be $200

Scenario: Successful withdrawal from a wallet
Given I have deposited $200 in my wallet
When I request $199
Then $199 should be dispensed
And the balance of my wallet should be $1

Scenario: User tries to withdraw $-10
Given there is $100 in my wallet
When I try to withdraw $-10
Then The withdrawal is not made
And I get a negative withdrawal error message