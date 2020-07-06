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

Feature: login with username for scenario outline

#Background: 
#Given: Open Browser for scenario outline

Scenario: login with username  for scenario outline ex
Given: enter username and password   for scenario outline ex
When: click login button  for scenario outline ex
Then: user should be logged in  for scenario outline ex
Example:
|brijesh9971@gmail.com|test123|
|test12@gmail.com|test123|
