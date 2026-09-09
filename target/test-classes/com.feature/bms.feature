Feature: BookMyShow MobileApp

Scenario: Login with mobile number 
Given I launch application of bookmyshow
When I click on Skip
And I click on Continue with mobile number
And I enter mobile number "9500346260"
And I click on Verify

Scenario: Select chennai as the location 
When I click on skip button 
And I click on select manually 
And I select chennai as location 

Scenario: Book movie ticket up to payment page
When I click on Movies
And I select Vishwanath and Sons movie
And I click on Book tickets
And I select 2D format
And I select AGS Navalur
And I select 11:40 AM show
And I select seat F5
And I select seat F6
And I click on Pay button
And I accept the Terms and Conditions
And I update email and contact number in details page
And I click on update button
And I click continue button in ticket details page
Then I should see the Payment page
    
Scenario: Validate Movies, Live Events and Profile pages

Given I launch application of bookmyshow
When I click on Skip
When I click on skip button 
And I click on select manually 
And I select chennai as location 
When the user taps on Movies
Then the Movies page should be displayed
When the user taps on Live Events
Then the Live Events page should be displayed
When the user taps on Profile
Then the Profile page should be displayed

Scenario: Verify invalid location search
When I click on Home
And I click on location
And I enter invalid location "XYZ123"
Then invalid location should not be displayed

Scenario: Verify Your Orders navigation 
Given I click on Profile
When I click on Your Orders
Then Your Orders page should be displayed

Scenario: Verify Stream Library navigation
Given I click on Profile
When I click on Stream Library
Then Stream Library page should be displayed

Scenario: Verify Help Centre navigation
Given I click on Profile
When I click on Help Centre
Then Help Centre page should be displayed

