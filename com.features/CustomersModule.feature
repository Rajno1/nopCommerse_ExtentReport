Feature: Checking the functionalit of customers module

Background: cheching the login functionality of login page
Given user open URL "https://admin-demo.nopcommerce.com/login"
When user enters Email as "admin@yourstore.com" and Password as "admin"
Then clicks on login button
And page Title should be "Dashboard / nopCommerce administration"
Then user clicks on customers menu
And user clicks on customers menu item

Scenario: Add a new customer
Given user click on Addnew button
Then page title should be "Add a new customer / nopCommerce administration"
When Enter the details of customer info
And click on save button
Then use should get confirmation message "The new customer has been added successfully"
