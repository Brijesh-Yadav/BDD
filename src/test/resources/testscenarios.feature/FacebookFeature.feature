#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature:
login with username
login with emailid
login with phone number

Scenario: login with username 
Given user navigates to Facebook
When I enter correct username and password
Then login should be successful

Scenario: login with emailid
Given user navigates to Facebook
When I enter correct email address and password
Then login should be successful

Scenario: login with phone number
Given user navigates to Facebook
When I enter correct phone number and password
Then login should be successful

| username  | password  | 
| username1 | password1 | 
| username2 | password2 |
