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
        "1234567"
      ],
      "line": 10,
      "id": "login;test-login;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 7071364400,
  "status": "passed"
});
formatter.before({
  "duration": 6444381600,
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
  "name": "user enters login dev@splinestudio.com and password 1234567",
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
  "duration": 839432700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dev@splinestudio.com",
      "offset": 18
    },
    {
      "val": "1234567",
      "offset": 52
    }
  ],
  "location": "BddLogInTest.fillForm(String,String)"
});
formatter.result({
  "duration": 1010909900,
  "status": "passed"
});
formatter.match({
  "location": "BddLogInTest.assertResults()"
});
formatter.result({
  "duration": 60171321500,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for element ([[FirefoxDriver: firefox on WINDOWS (a9cb84a7-8a87-4420-9e48-c90cb90c2e77)] -\u003e xpath: //button[@onclick\u003d\u0027sign_in()\u0027]]) to become stale (tried for 60 second(s) with 500 milliseconds interval)\nBuild info: version: \u00274.0.0-alpha-3\u0027, revision: \u00278c567de6dc\u0027\nSystem info: host: \u0027WIN-H3K2C979116\u0027, ip: \u0027192.168.31.20\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_231\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: false, browserName: firefox, browserVersion: 72.0.1, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20200107212822, moz:geckodriverVersion: 0.26.0, moz:headless: false, moz:processID: 15264, moz:profile: C:\\Users\\User\\AppData\\Local..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: eager, platform: WINDOWS, platformName: WINDOWS, platformVersion: 10.0, rotatable: false, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: a9cb84a7-8a87-4420-9e48-c90cb90c2e77\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:138)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:234)\r\n\tat ua.splinestudio.rentautobus.appmanager.ElementHelper.waitElementExpected(ElementHelper.java:35)\r\n\tat ua.splinestudio.rentautobus.tests.bdd.tests.BddLogInTest.assertResults(BddLogInTest.java:43)\r\n\tat ✽.Then user gets confirmation(bdd_tests/BddLogInTest.feature:6)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1997208500,
  "status": "passed"
});
formatter.after({
  "duration": 1207069800,
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
        "1234567"
      ],
      "line": 11,
      "id": "signin;test-signin;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5556722800,
  "status": "passed"
});
formatter.before({
  "duration": 7529968800,
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
  "name": "user set login dev@splinestudio.com and set password 1234567",
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
  "duration": 510605500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dev@splinestudio.com",
      "offset": 15
    },
    {
      "val": "1234567",
      "offset": 53
    }
  ],
  "location": "SignInTest.fillForm(String,String)"
});
formatter.result({
  "duration": 169749900,
  "status": "passed"
});
formatter.match({
  "location": "SignInTest.clickSignInConfirmation()"
});
formatter.result({
  "duration": 280802500,
  "status": "passed"
});
formatter.match({
  "location": "SignInTest.assertResults()"
});
formatter.result({
  "duration": 12316200,
  "status": "passed"
});
formatter.after({
  "duration": 1874127300,
  "status": "passed"
});
formatter.after({
  "duration": 1485569300,
  "status": "passed"
});
});