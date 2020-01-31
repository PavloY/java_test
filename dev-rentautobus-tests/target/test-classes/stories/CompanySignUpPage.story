Narrative:
This story covers basic tests of company sign up page

Scenario: test sign in function
Given User open main page
When User click FOR BUSINESS button
And User set first name field '<firstName>'
And User set last name field '<lastName>'

Examples:
| firstName            | lastName                 |
| Test name            | Test last name           |

