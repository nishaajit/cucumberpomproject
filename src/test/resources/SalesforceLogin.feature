
Feature: Login to Salesforce application
 

  
  Scenario: Login with Valid username and valid password
   Given  user is on the Login page
   When user entersusername as "nisha@tekarch.com" and password as "athipillil26" 
   And user click on login button
   Then verify page title "Home Page ~ Salesforce - Developer Edition"
 

   Scenario: Login with Valid username and invalid password
   Given  user is on the Login page
   When user entersusername as "nisha@tekarch.com" and password as "1123" 
   And user click on login button
   Then verify page title "Login | Salesforce  "
   
    Scenario: Login with Valid username and valid password
   Given  user is on the Login page
   When user entersusername as "nisha@tekarch.com" and password as "athipillil26" 
   And user check the remember me box
   And user click on login button
   Then verify page title "Home Page ~ Salesforce - Developer Edition"
   
   
   Scenario: Login with Valid username and valid password
   Given  user is on the Login page
   When user entersusername as "nisha@tekarch.com" and password as "athipillil26" 
   And user check the remember me box
   And user click on login button
   Then verify page title "Home Page ~ Salesforce - Developer Edition"
   
   
   
 
 