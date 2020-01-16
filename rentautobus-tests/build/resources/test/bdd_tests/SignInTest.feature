Feature: SignIn

  Scenario Outline: test SignIn
    Given user click button SignIn on the home page
    When  user set login <login> and set password <pass>
    And   user click button sign in confirmation
    Then  user SignIn on the site

    Examples:
      | login                  | pass          |
      | dev@splinestudio.com   | 12345678      |