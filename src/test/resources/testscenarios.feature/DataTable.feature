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
@smoke
Scenario: login with username 
Given user navigates to salesforce for datatable
When enter correct username and password for datatable
|brijesh9971@gmail.com|Anjli@29| 
|test2@gmail.com|pswd002| 
|test3@gmail.com|pswd003| 
Then login should be successful for datatable


