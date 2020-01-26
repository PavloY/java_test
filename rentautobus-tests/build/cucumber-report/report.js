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
  "duration": 9492261300,
  "status": "passed"
});
formatter.before({
  "duration": 12491756900,
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
  "duration": 3371054200,
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: #dLabel\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00274.0.0-alpha-3\u0027, revision: \u00278c567de6dc\u0027\nSystem info: host: \u0027WIN-2KK8D6ESTAE\u0027, ip: \u0027192.168.0.108\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_231\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: false, browserName: firefox, browserVersion: 72.0.2, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20200117190643, moz:geckodriverVersion: 0.26.0, moz:headless: false, moz:processID: 14840, moz:profile: C:\\Users\\User\\AppData\\Local..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: eager, platform: WINDOWS, platformName: WINDOWS, platformVersion: 10.0, rotatable: false, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: d712c5b8-065d-43c0-bafb-7951b77a8616\n*** Element info: {Using\u003did, value\u003ddLabel}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:191)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:125)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:52)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:161)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:576)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:327)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:375)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:196)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:319)\r\n\tat testpackage.appmanager.HelperBase.click(HelperBase.java:17)\r\n\tat testpackage.appmanager.SessionHelper.clicklogIn(SessionHelper.java:24)\r\n\tat testpackage.tests.bdd.tests.BddLogInTest.clickSignIn(BddLogInTest.java:35)\r\n\tat ✽.Given user click button sign in(bdd_tests/BddLogInTest.feature:4)\r\n",
  "status": "failed"
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
  "status": "skipped"
});
formatter.match({
  "location": "BddLogInTest.assertResults()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 453230500,
  "error_message": "org.openqa.selenium.WebDriverException: Failed to decode response from marionette\nBuild info: version: \u00274.0.0-alpha-3\u0027, revision: \u00278c567de6dc\u0027\nSystem info: host: \u0027WIN-2KK8D6ESTAE\u0027, ip: \u0027192.168.0.108\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_231\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: false, browserName: firefox, browserVersion: 72.0.2, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20200117190643, moz:geckodriverVersion: 0.26.0, moz:headless: false, moz:processID: 13236, moz:profile: C:\\Users\\User\\AppData\\Local..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: eager, platform: WINDOWS, platformName: WINDOWS, platformVersion: 10.0, rotatable: false, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: bd4179f5-fe00-4b00-ab25-a79553c5accf\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:191)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:125)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:52)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:161)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:576)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:633)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:637)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.quit(RemoteWebDriver.java:473)\r\n\tat testpackage.appmanager.ApplicationManager.stop(ApplicationManager.java:90)\r\n\tat testpackage.tests.bdd.tests.SignInTest.stop(SignInTest.java:32)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:206)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.model.CucumberScenarioOutline.run(CucumberScenarioOutline.java:46)\r\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\r\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.feature(AbstractTestNGCucumberTests.java:21)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:133)\r\n\tat org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:584)\r\n\tat org.testng.internal.TestInvoker.invokeTestMethod(TestInvoker.java:172)\r\n\tat org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:46)\r\n\tat org.testng.internal.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:804)\r\n\tat org.testng.internal.TestInvoker.invokeTestMethods(TestInvoker.java:145)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:146)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:128)\r\n\tat java.util.ArrayList.forEach(ArrayList.java:1257)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:770)\r\n\tat org.testng.TestRunner.run(TestRunner.java:591)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:402)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:396)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:355)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:304)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:53)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:96)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1180)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1102)\r\n\tat org.testng.TestNG.runSuites(TestNG.java:1032)\r\n\tat org.testng.TestNG.run(TestNG.java:1000)\r\n\tat org.gradle.api.internal.tasks.testing.testng.TestNGTestClassProcessor.runTests(TestNGTestClassProcessor.java:141)\r\n\tat org.gradle.api.internal.tasks.testing.testng.TestNGTestClassProcessor.stop(TestNGTestClassProcessor.java:90)\r\n\tat org.gradle.api.internal.tasks.testing.SuiteTestClassProcessor.stop(SuiteTestClassProcessor.java:61)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.gradle.internal.dispatch.ReflectionDispatch.dispatch(ReflectionDispatch.java:36)\r\n\tat org.gradle.internal.dispatch.ReflectionDispatch.dispatch(ReflectionDispatch.java:24)\r\n\tat org.gradle.internal.dispatch.ContextClassLoaderDispatch.dispatch(ContextClassLoaderDispatch.java:33)\r\n\tat org.gradle.internal.dispatch.ProxyDispatchAdapter$DispatchingInvocationHandler.invoke(ProxyDispatchAdapter.java:94)\r\n\tat com.sun.proxy.$Proxy2.stop(Unknown Source)\r\n\tat org.gradle.api.internal.tasks.testing.worker.TestWorker.stop(TestWorker.java:132)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.gradle.internal.dispatch.ReflectionDispatch.dispatch(ReflectionDispatch.java:36)\r\n\tat org.gradle.internal.dispatch.ReflectionDispatch.dispatch(ReflectionDispatch.java:24)\r\n\tat org.gradle.internal.remote.internal.hub.MessageHubBackedObjectConnection$DispatchWrapper.dispatch(MessageHubBackedObjectConnection.java:182)\r\n\tat org.gradle.internal.remote.internal.hub.MessageHubBackedObjectConnection$DispatchWrapper.dispatch(MessageHubBackedObjectConnection.java:164)\r\n\tat org.gradle.internal.remote.internal.hub.MessageHub$Handler.run(MessageHub.java:412)\r\n\tat org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)\r\n\tat org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:48)\r\n\tat java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)\r\n\tat java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)\r\n\tat org.gradle.internal.concurrent.ThreadFactoryImpl$ManagedThreadRunnable.run(ThreadFactoryImpl.java:56)\r\n\tat java.lang.Thread.run(Thread.java:748)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 2760298700,
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
  "duration": 8279366900,
  "status": "passed"
});
formatter.before({
  "duration": 8303435700,
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
  "duration": 3023403600,
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: //button[@id\u003d\u0027dLabel\u0027]\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00274.0.0-alpha-3\u0027, revision: \u00278c567de6dc\u0027\nSystem info: host: \u0027WIN-2KK8D6ESTAE\u0027, ip: \u0027192.168.0.108\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_231\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: false, browserName: firefox, browserVersion: 72.0.2, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20200117190643, moz:geckodriverVersion: 0.26.0, moz:headless: false, moz:processID: 2768, moz:profile: C:\\Users\\User\\AppData\\Local..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: eager, platform: WINDOWS, platformName: WINDOWS, platformVersion: 10.0, rotatable: false, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: fe9f4bdc-6b50-4a1a-b55b-8ea828ea1fd7\n*** Element info: {Using\u003dxpath, value\u003d//button[@id\u003d\u0027dLabel\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:191)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:125)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:52)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:161)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:576)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:327)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:445)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:396)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:319)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy29.click(Unknown Source)\r\n\tat testpackage.pages.HomePage.clickSignUpButton(HomePage.java:53)\r\n\tat testpackage.tests.bdd.tests.SignInTest.clickSignIn(SignInTest.java:38)\r\n\tat ✽.Given user click button SignIn on the home page(bdd_tests/SignInTest.feature:4)\r\n",
  "status": "failed"
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
  "status": "skipped"
});
formatter.match({
  "location": "SignInTest.clickSignInConfirmation()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SignInTest.assertResults()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1889944700,
  "status": "passed"
});
formatter.after({
  "duration": 1769202700,
  "status": "passed"
});
});