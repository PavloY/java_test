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
  "duration": 7413362700,
  "status": "passed"
});
formatter.before({
  "duration": 6724811600,
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
  "duration": 676470700,
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
  "duration": 861774000,
  "status": "passed"
});
formatter.match({
  "location": "BddLogInTest.assertResults()"
});
formatter.result({
  "duration": 3720477700,
  "status": "passed"
});
formatter.after({
  "duration": 1561560400,
  "status": "passed"
});
formatter.after({
  "duration": 2368297200,
  "status": "passed"
});
formatter.uri("bdd_tests/BddTravelerOneWayTest.feature");
formatter.feature({
  "line": 1,
  "name": "Traveler OneWay Trip",
  "description": "",
  "id": "traveler-oneway-trip",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5321505400,
  "status": "passed"
});
formatter.before({
  "duration": 6759498700,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "start Create OneWay Trip",
  "description": "",
  "id": "traveler-oneway-trip;start-create-oneway-trip",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user logged in as traveler",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user clicks on the one way trip",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user user populates Trip Form with text",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user clicks on button and navigates to next page",
  "keyword": "Then "
});
formatter.match({
  "location": "BddTravelerOneWayTest.fillSignIn()"
});
formatter.result({
  "duration": 3332649900,
  "status": "passed"
});
formatter.match({
  "location": "BddTravelerOneWayTest.waitElementExpected()"
});
formatter.result({
  "duration": 1116387400,
  "status": "passed"
});
formatter.match({
  "location": "BddTravelerOneWayTest.assertResult()"
});
formatter.result({
  "duration": 2565973600,
  "status": "passed"
});
formatter.match({
  "location": "BddTravelerOneWayTest.assertResults()"
});
formatter.result({
  "duration": 888560300,
  "status": "passed"
});
formatter.after({
  "duration": 1882261900,
  "status": "passed"
});
formatter.after({
  "duration": 1938699300,
  "status": "passed"
});
});