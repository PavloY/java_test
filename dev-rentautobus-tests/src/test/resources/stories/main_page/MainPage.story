Narrative:
This story covers basic tests of sign in

Scenario: test sign in function
Given User open main page
When User click sign in button
And User set email address "<login>"
And User set password field "<pass>"
And User click sign in button confirmation
Then User should see "<user name>"
Examples:
| login                | pass           | user name        |
| dev@splinestudio.com | 12345678       | Lesha Afternoon  |
