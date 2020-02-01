Narrative:
This story covers basic tests of sign in

Scenario: test sign in function
Given User open main page
When User click sign in button
Then User click button


Scenario: test sign in function
Meta: @skip
Given User open main page
When User click sign in button
And User set email address '<emailAddress>'
And User set password field '<passwordField>'
And User click signin button confirmation
Then User should see '<message>'
Examples:
| emailAddress         | passwordField           | message          |
| dev@splinestudio.com | 12345678                | Lesha Afternoon  |


Scenario: test sign in function
Meta: @skip
Given User open main page
When User click FOR BUSINESS button
And User set first name field '<firstName>'
And User set last name field '<lastName>'

Examples:
| firstName            | lastName                 |
| Test name            | Test last name           |


