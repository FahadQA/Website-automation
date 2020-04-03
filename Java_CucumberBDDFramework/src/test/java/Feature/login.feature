Feature: demo.opencart login test
Scenario: positive login test

 Given user is in login page 
 When user gives email and password
 And clicks on submit button 
 Then user is in home page