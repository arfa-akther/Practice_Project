Feature: This feature is for validate login functionaltity 

@bhaiya
Scenario: Verify user login successfully
Given Launch "<URL>" for demo 
Then click loginLink 
Then Enter user name and password and click login button
Then verify user login successfully profile page
