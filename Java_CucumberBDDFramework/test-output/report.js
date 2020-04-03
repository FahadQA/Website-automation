$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Feature/login.feature");
formatter.feature({
  "name": "demo.opencart login test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "positive login test",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is in login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.stepDef.user_is_in_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user gives email and password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.stepDef.user_gives_email_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.stepDef.clicks_on_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is in home page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.stepDef.user_is_in_home_page()"
});
formatter.result({
  "status": "passed"
});
});