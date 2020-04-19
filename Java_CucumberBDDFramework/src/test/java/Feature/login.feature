Feature: demo.opencart login test

Background: Common steps

 Given user is in login page 
 When user gives email and password
 And clicks on submit button 
 Then user is in home page
 When user clicks in Customers from menu
 And user select customers from Customers menu



#Scenario: positive login test
# 
#
# And user clicks in Add new customer
# Then user is in Add new customer page
# When user enters customer info
# And clicks on save button
# Then user can see add customer successful message
 
Scenario: search user by email
 
 
 Then user is in search customer page
 When user provide registered email id
 And user click on search button
 Then user info is displayed
