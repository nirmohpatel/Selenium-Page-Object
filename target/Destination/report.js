$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/registration.feature");
formatter.feature({
  "line": 1,
  "name": "Registration feature",
  "description": "",
  "id": "registration-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10499252400,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User should able to register successfully,",
  "description": "",
  "id": "registration-feature;user-should-able-to-register-successfully,",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user is on HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user click on register button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enter all required registration details",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user clicks on registration button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user able to registration successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDefs.user_is_on_HomePage()"
});
formatter.result({
  "duration": 426401900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_click_on_register_button()"
});
formatter.result({
  "duration": 1684151800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_enter_all_required_registration_details()"
});
formatter.result({
  "duration": 2768404700,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_clicks_on_registration_button()"
});
formatter.result({
  "duration": 2596766200,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_able_to_registration_successfully()"
});
formatter.result({
  "duration": 2757777800,
  "status": "passed"
});
formatter.after({
  "duration": 377422900,
  "status": "passed"
});
});