Feature: login with username for scenario outline for ex2

Background: 
Given: Open Browser for scenario outline

Scenario Outline: login with username  for scenario outline 
Given enter "<username>" and "<password>"   for scenario outline 
When click login button  for scenario outline
Then user should be logged in  for scenario outline 
Examples:
	|username|password|
	|brijesh9971@gmail.com|test123|
	|test12@gmail.com|test123|


