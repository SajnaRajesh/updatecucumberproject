Feature: Automation Functional Test Scripts for Adactin Web Application

@testt
Scenario: To verify the valid login details
Given Launch the application using URL
When Enter the username 'sajuchinnu' in Login Page
And Enter the password 'chinnumol' in LoginPage
And Click on login button in Loginpage
Then Verify whether logged in username 'sajuchinnu' is displayed in SearchHotelPage


#Scenario: To verify whether the checkin date is greater than the checkout date
#When Select the location 'Sydney' in SearchHotelPage 
#And Select the Hotel 'Hotel Creek'in SearchHotelPage
#And Select the Room Type as 'standard' in SearchHotelPage
#And Select the no. of rooms as '1' in SearchHotelPage
#And Select the Checkin date as(today+7)date in SearchHotelpage
#And Select the Checkout date as (today+5)date in SearchHotelPage
#Then Verify the  error message 'check in date should not be later than checkout date'
#
#Scenario: To check if error is reported if checkout date is in the past
#When Select the location 'Sydney' in SearchHotelPage
#And Select the Hotel 'Hotel Creek'in Searchhotelpage
#And Select the no.of rooms as '1' in SearchHotelPage


