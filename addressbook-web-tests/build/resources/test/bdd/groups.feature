Feature: Groups

    Scenario Outline: Group creation
        Given a set of groups
        When I create a new group with name <name>, header <header> and footer <footer>
        Then the new set our groups is equal to the old set with the added group

        Examples:
        |  name       |  header       |  footer       |
        |  test name  |  test header  |  test footer  |
        |  test2 name |  test2 header |  test2 footer |