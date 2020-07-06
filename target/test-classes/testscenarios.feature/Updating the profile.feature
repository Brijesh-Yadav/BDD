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
@tag
Feature: As a Sales agent
I want to be able to add new clients in the system
So that I can add accounting data for that client

Background:
Given I am on Github home page
When I specify Username as “xxxxxxxxxxxxxxxxxxxx” and Password as “xxx”
And Click on SignIn button

@Smoke
Scenario: updating the profile
Given I click on Your Profile option
When I click on edit profile button
And Uploaded new picture
Then I should be seeing new profile picture

