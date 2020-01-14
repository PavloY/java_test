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
  "duration": 6614452000,
  "status": "passed"
});
formatter.before({
  "duration": 5957841200,
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
  "duration": 514220500,
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
  "duration": 1115000600,
  "status": "passed"
});
formatter.match({
  "location": "BddLogInTest.assertResults()"
});
formatter.result({
  "duration": 1291828900,
  "status": "passed"
});
formatter.after({
  "duration": 1816439000,
  "status": "passed"
});
formatter.after({
  "duration": 1639787600,
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
  "duration": 5109339400,
  "status": "passed"
});
formatter.before({
  "duration": 6806955000,
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
  "duration": 2553039800,
  "status": "passed"
});
formatter.match({
  "location": "BddTravelerOneWayTest.waitElementExpected()"
});
formatter.result({
  "duration": 1301126500,
  "status": "passed"
});
formatter.match({
  "location": "BddTravelerOneWayTest.assertResult()"
});
formatter.result({
  "duration": 3535871300,
  "status": "passed"
});
formatter.match({
  "location": "BddTravelerOneWayTest.assertResults()"
});
formatter.result({
  "duration": 3552242100,
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: //button[@onclick\u003d\u0027get_next_page()\u0027]\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00274.0.0-alpha-3\u0027, revision: \u00278c567de6dc\u0027\nSystem info: host: \u0027WIN-H3K2C979116\u0027, ip: \u0027192.168.31.20\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_231\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: false, browserName: firefox, browserVersion: 72.0.1, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20200107212822, moz:geckodriverVersion: 0.26.0, moz:headless: false, moz:processID: 15472, moz:profile: C:\\Users\\User\\AppData\\Local..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: eager, platform: WINDOWS, platformName: WINDOWS, platformVersion: 10.0, rotatable: false, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 7c3a8897-9527-4311-ad63-5603fc3ba7be\n*** Element info: {Using\u003dxpath, value\u003d//button[@onclick\u003d\u0027get_next_page()\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:191)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:125)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:52)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:161)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:576)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:327)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:445)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:396)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:319)\r\n\tat ua.splinestudio.rentautobus.appmanager.HelperBase.doubleРЎlick(HelperBase.java:22)\r\n\tat ua.splinestudio.rentautobus.appmanager.NavigationHelper.gotoNextPage(NavigationHelper.java:13)\r\n\tat ua.splinestudio.rentautobus.tests.bdd.tests.BddTravelerOneWayTest.assertResults(BddTravelerOneWayTest.java:56)\r\n\tat ✽.Then user clicks on button and navigates to next page(bdd_tests/BddTravelerOneWayTest.feature:7)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1368372700,
  "status": "passed"
});
formatter.after({
  "duration": 1824213000,
  "status": "passed"
});
});