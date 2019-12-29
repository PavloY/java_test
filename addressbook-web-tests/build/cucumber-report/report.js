$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("bdd/groups.feature");
formatter.feature({
  "line": 1,
  "name": "Groups",
  "description": "",
  "id": "groups",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Group creation",
  "description": "",
  "id": "groups;group-creation",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "a set of groups",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I create a new group with name \u003cname\u003e, header \u003cheader\u003e and footer \u003cfooter\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the new set our groups is equal to the old set with the added group",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "groups;group-creation;",
  "rows": [
    {
      "cells": [
        "name",
        "header",
        "footer"
      ],
      "line": 9,
      "id": "groups;group-creation;;1"
    },
    {
      "cells": [
        "test name",
        "test header",
        "test footer"
      ],
      "line": 10,
      "id": "groups;group-creation;;2"
    },
    {
      "cells": [
        "test2 name",
        "test2 header",
        "test2 footer"
      ],
      "line": 11,
      "id": "groups;group-creation;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 19986646200,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Group creation",
  "description": "",
  "id": "groups;group-creation;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "a set of groups",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I create a new group with name test name, header test header and footer test footer",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the new set our groups is equal to the old set with the added group",
  "keyword": "Then "
});
formatter.match({
  "location": "GroupStepDefenition.loadGroups()"
});
formatter.result({
  "duration": 2396126400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test name",
      "offset": 31
    },
    {
      "val": "test header",
      "offset": 49
    },
    {
      "val": "test footer",
      "offset": 72
    }
  ],
  "location": "GroupStepDefenition.createGroup(String,String,String)"
});
formatter.result({
  "duration": 1479753500,
  "status": "passed"
});
formatter.match({
  "location": "GroupStepDefenition.verifyGroupCreated()"
});
formatter.result({
  "duration": 44981900,
  "status": "passed"
});
formatter.after({
  "duration": 1753852800,
  "status": "passed"
});
formatter.before({
  "duration": 8293827000,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Group creation",
  "description": "",
  "id": "groups;group-creation;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "a set of groups",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I create a new group with name test2 name, header test2 header and footer test2 footer",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the new set our groups is equal to the old set with the added group",
  "keyword": "Then "
});
formatter.match({
  "location": "GroupStepDefenition.loadGroups()"
});
formatter.result({
  "duration": 37330000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test2 name",
      "offset": 31
    },
    {
      "val": "test2 header",
      "offset": 50
    },
    {
      "val": "test2 footer",
      "offset": 74
    }
  ],
  "location": "GroupStepDefenition.createGroup(String,String,String)"
});
formatter.result({
  "duration": 1418879200,
  "status": "passed"
});
formatter.match({
  "location": "GroupStepDefenition.verifyGroupCreated()"
});
formatter.result({
  "duration": 23573900,
  "status": "passed"
});
formatter.after({
  "duration": 1660718400,
  "status": "passed"
});
});