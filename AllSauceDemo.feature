Feature: Test the saucedemo Website
Scenario: To test the Saucedemo Website

Given I am in Login page
And I will enter username and password
And CLick on Login Button
When Add products to the cart
And Click on Basket
And Click on Checkout
And Enter first name,lastname and zipcode
And click on continue
And CLick on finish
Then Click on home page 
And I Will be in Home page of saucedemo website
