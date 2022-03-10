@tag1
Feature: Adactin Hotel Booking Login
Scenario: Checking Login Function
Given Adactin Webpage Launched
When User entre Username in Username fied
And User entre Password in Password field
And User clicks on Login button
Then Users credentials gets verified 
@tag2
Scenario:Searching hotel 
When User selects preffered details
Then User enter the search button
When User navigated to Select Hotel page
And  Selects the preffered hotel
Then User clicks continue button
@tag3
Scenario: Awaiting for payment details 
When User entres details 
And clicks on the Book Now button
Then Users credentials are verified 
Then shown the hotel booked information
@tag4
Scenario: User logs out from the Adactin Hotel Website
When User clicks on the Logout icon provided on the right top corner in blue colour 
Then User is navigated to logged out page