Feature: Hotel Booking In Adactin Application
Scenario: Login Functionality
Given user Launch The Application
When user Enter The Username In Username Field
And user Enter The PasswordIn Pasaword Field
Then user Click On The Login Button And Is Navigate To The Search Hotel Page


Scenario: Search Hotel Functionality
When user Select The Location In The Location Field
And user Select The Hotels In The Hotel Field
And user Select The RoomType In The RoomType Field
And user Enter The CheckInDate In The CheckInDate Field
And user Enter The CheckOutDate In The CheckOutDate Field
And user Select The AdultsPerRoom In The AdultsPerRoom Field
And user Select The ChildernPerRoom In The ChildernPerRoom Field
Then user Click On The Search Button And Is Navigate To The Select Hotel Page


Scenario: Select Hotel Functionality
When user Click The RadioBtn In The RadioBtn Field
Then user Click On The Continue Button And Is Navigate To The Book Hotel Page


Scenario: Book Hotel Functionality
When user Enter The Firstname In The Firstname Field
And user Enter The Lastname In The Lastname Field
And user Enter The BillingAddress In The BillingAddress Field
And user Enter The Creditcadrno In The Creditcardno Field
And user Select The Creditcardtype In The Creditcardtype Field
And user Select The Month In The MonthType Field
And user Select The Year In The Year Field
And user Enter The CCV In The CCV Field


Then user Click On The BookNow Button And Is Navigate To The Booking Confirmation Page



Scenario: Booking Confirmation Functionality
Then user Click On The SearchHotel Button


Scenario: Logout Functionality
Then user Click On The LogoutButton
