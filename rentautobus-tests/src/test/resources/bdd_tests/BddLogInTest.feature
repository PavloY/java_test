Feature: LogIn

  Scenario Outline: test login
    Given user click button sign in
    When  user enters login <login> and password <pass>
    Then  user gets confirmation

    Examples:
      | login                  | pass          |
      | dev@splinestudio.com   | 12345678      |