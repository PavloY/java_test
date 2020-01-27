Narrative:
This story covers basic tests of sign in

Scenario: test sign in function
Given User open main page
When User click sign in button
And User set email address "<emailAddress>"
And User set password field "<passwordField>"
And User click signin button confirmation
Then User should see "<message>"
Examples:
| emailAddress         | passwordField           | message          |
| dev@splinestudio.com | 12345678                | Lesha Afternoo  |
