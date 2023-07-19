$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Dummy/Comments.feature");
formatter.feature({
  "name": "Comments",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@api"
    }
  ]
});
formatter.scenario({
  "name": "Get all comments",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@api"
    }
  ]
});
formatter.step({
  "name": "I get all comments from the commnets service",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the response code is 200",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the comments details are returned correctly",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});