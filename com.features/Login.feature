Feature: Checking the functionalit of customers module

Scenario: cheching the login functionality of login page
Given user open URL "https://admin-demo.nopcommerce.com/login"
When user enters Email as "admin@yourstore.com" and Password as "admin"
Then clicks on login button
And page Title should be "Dashboard / nopCommerce administration"