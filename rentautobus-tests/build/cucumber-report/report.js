$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("bdd_tests/BddLogInTest.feature");
formatter.feature({
  "line": 1,
  "name": "LogIn",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "test login",
  "description": "",
  "id": "login;test-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user click button sign in",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters login \u003clogin\u003e and password \u003cpass\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user gets confirmation",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "login;test-login;",
  "rows": [
    {
      "cells": [
        "login",
        "pass"
      ],
      "line": 9,
      "id": "login;test-login;;1"
    },
    {
      "cells": [
        "dev@splinestudio.com",
        "12345678"
      ],
      "line": 10,
      "id": "login;test-login;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 11778766800,
  "status": "passed"
});
formatter.before({
  "duration": 8523836900,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "test login",
  "description": "",
  "id": "login;test-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user click button sign in",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters login dev@splinestudio.com and password 12345678",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user gets confirmation",
  "keyword": "Then "
});
formatter.match({
  "location": "BddLogInTest.clickSignIn()"
});
formatter.result({
  "duration": 1095650300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dev@splinestudio.com",
      "offset": 18
    },
    {
      "val": "12345678",
      "offset": 52
    }
  ],
  "location": "BddLogInTest.fillForm(String,String)"
});
formatter.result({
  "duration": 955479400,
  "status": "passed"
});
formatter.match({
  "location": "BddLogInTest.assertResults()"
});
formatter.result({
  "duration": 1380877600,
  "status": "passed"
});
formatter.after({
  "duration": 1741601700,
  "status": "passed"
});
formatter.after({
  "duration": 1697491700,
  "status": "passed"
});
formatter.uri("bdd_tests/SignInTest.feature");
formatter.feature({
  "line": 1,
  "name": "SignIn",
  "description": "",
  "id": "signin",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "test SignIn",
  "description": "",
  "id": "signin;test-signin",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user click button SignIn on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user set login \u003clogin\u003e and set password \u003cpass\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user click button sign in confirmation",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user SignIn on the site",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "signin;test-signin;",
  "rows": [
    {
      "cells": [
        "login",
        "pass"
      ],
      "line": 10,
      "id": "signin;test-signin;;1"
    },
    {
      "cells": [
        "dev@splinestudio.com",
        "12345678"
      ],
      "line": 11,
      "id": "signin;test-signin;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 9998310300,
  "status": "passed"
});
formatter.before({
  "duration": 11031935100,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "test SignIn",
  "description": "",
  "id": "signin;test-signin;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user click button SignIn on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user set login dev@splinestudio.com and set password 12345678",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user click button sign in confirmation",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user SignIn on the site",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInTest.clickSignIn()"
});
formatter.result({
  "duration": 530564200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dev@splinestudio.com",
      "offset": 15
    },
    {
      "val": "12345678",
      "offset": 53
    }
  ],
  "location": "SignInTest.fillForm(String,String)"
});
formatter.result({
  "duration": 112590700,
  "status": "passed"
});
formatter.match({
  "location": "SignInTest.clickSignInConfirmation()"
});
formatter.result({
  "duration": 272294700,
  "status": "passed"
});
formatter.match({
  "location": "SignInTest.assertResults()"
});
formatter.result({
  "duration": 10970900,
  "status": "passed"
});
formatter.after({
  "duration": 1600251300,
  "status": "passed"
});
formatter.after({
  "duration": 1421273800,
  "status": "passed"
});
});