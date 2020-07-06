$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/testscenarios.feature/Tagex.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "",
  "description": "login with username for tag",
  "id": "",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 24,
  "name": "login with username for tag",
  "description": "",
  "id": ";login-with-username-for-tag",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@smoke"
    },
    {
      "line": 23,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "user navigates to salesforce  for tag",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "enter correct username and password  for tag",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "login should be successful for tag",
  "keyword": "Then "
});
formatter.match({
  "location": "Tagex.user_navigates_to_salesforce_for_tag()"
});
formatter.result({
  "duration": 137846144,
  "status": "passed"
});
formatter.match({
  "location": "Tagex.enter_correct_username_and_password_for_tag()"
});
formatter.result({
  "duration": 177465,
  "status": "passed"
});
formatter.match({
  "location": "Tagex.login_should_be_successful_for_tag()"
});
formatter.result({
  "duration": 175844,
  "status": "passed"
});
});