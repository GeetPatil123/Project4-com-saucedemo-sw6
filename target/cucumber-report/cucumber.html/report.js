$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "LoginPage Test",
  "description": "As user I want to navigate to various pages of com-sauce demo website",
  "id": "loginpage-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3103251100,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should Login with valid credentials",
  "description": "",
  "id": "loginpage-test;user-should-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@smoke"
    },
    {
      "line": 4,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on the HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on Login link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I enter username \"standard_user\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter password \"secret_sauce\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I should Login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iAmOnTheHomePage()"
});
formatter.result({
  "duration": 89522700,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLoginLink()"
});
formatter.result({
  "duration": 24600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 18
    }
  ],
  "location": "LoginSteps.iEnterUsername(String)"
});
formatter.result({
  "duration": 149140200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "secret_sauce",
      "offset": 18
    }
  ],
  "location": "LoginSteps.iEnterPassword(String)"
});
formatter.result({
  "duration": 91721400,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 124054300,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iShouldLoginSuccessfully()"
});
formatter.result({
  "duration": 32100,
  "status": "passed"
});
formatter.after({
  "duration": 697117400,
  "status": "passed"
});
});