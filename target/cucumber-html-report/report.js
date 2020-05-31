$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:com.features/CustomersModule.feature");
formatter.feature({
  "name": "Checking the functionalit of customers module",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "cheching the login functionality of login page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user open URL \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_open_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "user enters Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_enters_Email_as_and_Password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "clicks on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "page Title should be \"Dashboard / nopCommerce administration\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.page_Title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on customers menu",
  "keyword": "Then "
});
formatter.match({
  "location": "CustomersModuleSteps.user_clicks_on_customers_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on customers menu item",
  "keyword": "And "
});
formatter.match({
  "location": "CustomersModuleSteps.user_clicks_on_customers_menu_item()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.scenario({
  "name": "Add a new customer",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user click on Addnew button",
  "keyword": "Given "
});
formatter.match({
  "location": "CustomersModuleSteps.user_click_on_Addnew_button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "page title should be \"Add a new customer / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CustomersModuleSteps.page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Enter the details of customer info",
  "keyword": "When "
});
formatter.match({
  "location": "CustomersModuleSteps.enter_the_details_of_customer_info()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "click on save button",
  "keyword": "And "
});
formatter.match({
  "location": "CustomersModuleSteps.click_on_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "use should get confirmation message \"The new customer has been added successfully\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CustomersModuleSteps.use_should_get_confirmation_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});