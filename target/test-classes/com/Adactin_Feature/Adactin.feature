Feature: Hotel Booking In Adactin Application
 @s1
Scenario Outline: login page
Given user Launch The Application
When  user enter the "<username>"  in username Field
And user Enter the "<password>" In password field
Then user Click on the login Button and it navigate to search Hotel Page
Examples:
     |username|password|
     |abcd|1234|
     |efgh|5678|
     |dhaakshayani|ammu2394|
  @s2
Scenario: Search Hotel
When  user Select the Location
Then User Select the Hotel
Then user Select the type of room
Then user select the number of rooms
Then user enter the check In Date
Then user enter the check out Date
Then user select the Adults per room
Then user select the childrens per room
Then user Click on the Search Button and it navigate to Select Hotel Page

@s3
Scenario: Select Hotel
When  user select the hotel
Then user click on continue button and it navigate to book a hotel page
@s4
Scenario: Book a Hotel
When user enter the first Name in First Name Field
Then user enter the Last Name in Last Name Field
Then user enter  the Billing Address in Billing Address Field
Then user enter the Credit Card No in the Credit Card No Field
Then user Select the Credit Card Type in the Credit Card Type Field
Then user Select the Expiry Date in  Month Field
Then user Select the Expiry Date in Year Field
Then user Select the CVV Number in CVV Number Field
Then user click on the booknow button and it navigate to  Booking Confirmation Page
@s5
Scenario: 
Then user click on the Log out Button
