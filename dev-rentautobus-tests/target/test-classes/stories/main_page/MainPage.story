Narrative:
This story covers basic tests of sign in

Scenario: test sign in function
Given User open main page
When User click sign in button
And User set email address "dev@splinestudio.com"
And User set password field "12345678"
And User click sign in button
Then User should see user name "Lesha Afternoon"
